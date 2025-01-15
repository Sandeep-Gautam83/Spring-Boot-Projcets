package feedback_app.session.manage;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Request2Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Set response content type with UTF-8 encoding
        resp.setContentType("text/html; charset=UTF-8");
        var writer = resp.getWriter();

        // Retrieve cookies from the request
        Cookie[] cookies = req.getCookies();
        String username = null;
        String userId = null;

        // Check and retrieve relevant cookies
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                String name = cookie.getName().toLowerCase(); // Normalize name for consistency
                if ("username".equals(name)) {
                    username = cookie.getValue();
                } else if ("userid".equals(name)) {
                    userId = cookie.getValue();
                }
            }
        }

        // Prepare response based on the cookie values
        writer.println("<!DOCTYPE html>");
        writer.println("<html><head><title>Session Information</title></head><body>");
        writer.println("<h1>Session Information</h1>");

        if (username != null && userId != null) {
            writer.println(String.format("<p>Welcome, <strong>%s</strong>!</p>", username));
            writer.println(String.format("<p>Your User ID is: <strong>%s</strong></p>", userId));
        } else {
            writer.println("<h2 style='color:red;'>Required cookies are missing!</h2>");
            if (username == null || username.isEmpty()) {
                writer.println("<p>'username' cookie is not found or is empty.</p>");
            }
            if (userId == null || userId.isEmpty()) {
                writer.println("<p>'userid' cookie is not found or is empty.</p>");
            }
            writer.println("<p>Please <a href='" + req.getContextPath() + "/servlet1'>set cookies</a> again.</p>");
        }

        writer.println("<button onclick='history.back()'>Go Back</button>"); // Adds a "Go Back" button
        writer.println("</body></html>");
    }
}
