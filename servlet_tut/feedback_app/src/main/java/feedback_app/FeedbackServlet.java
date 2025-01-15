package feedback_app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/feedback")
public class FeedbackServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Get form data and trim whitespace
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String feedbackMessage = req.getParameter("feedback_message");

        email = (email != null) ? email.trim() : null;
        phone = (phone != null) ? phone.trim() : null;
        feedbackMessage = (feedbackMessage != null) ? feedbackMessage.trim() : null;

        // Check if any of the form fields are missing
        if (email == null || phone == null || feedbackMessage == null) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            resp.getWriter().println("<h1>Error: Missing required fields.</h1>");
            return;
        }

        // Optionally: validate email format and phone format here (using regex)
        if (!isValidEmail(email)) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            resp.getWriter().println("<h1>Error: Invalid email format.</h1>");
            return;
        }
        
        // Save feedback data to the database (implement your DB logic)
        saveFeedbackToDatabase(email, phone, feedbackMessage);

        // Set the content type for response
        resp.setContentType("text/html; charset=UTF-8");

        // Get the PrintWriter for sending the response
        PrintWriter writer = resp.getWriter();

        // Start response output
        writer.println("<html><body>");
        writer.println("<h1>Feedback Submitted Successfully!</h1>");
        writer.println("<h2>Your form details that you have submitted:</h2>");
        writer.println(String.format(
                "<h3>Email address: %s</h3>" +
                "<h3>Phone number: %s</h3>" +
                "<h3>Feedback message: %s</h3>",
                email, phone, feedbackMessage));

        // End response output
        writer.println("</body></html>");

        // Close the PrintWriter resource
        writer.close();
    }

    // Method to validate email format
    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email.matches(emailRegex);
    }

    // Placeholder for saving feedback to database (implement database logic)
    private void saveFeedbackToDatabase(String email, String phone, String feedbackMessage) {
        // Implement your database logic here
        // For example, use JDBC to save feedback to the database
    }
}
