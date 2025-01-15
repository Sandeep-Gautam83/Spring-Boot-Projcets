package feedback_app.session.manage;

import java.io.IOException;
import java.util.UUID;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/servlet1")
public class Request1Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Define user information (dynamic retrieval recommended in a real app)
        String username = "Sandeep";
        String userId = "1234";

        // Create cookies
        Cookie usernameCookie = new Cookie("username", username);
        Cookie userIdCookie = new Cookie("userid", userId);

        // Set cookie properties
        usernameCookie.setMaxAge(10 * 60); // 10 minutes
        userIdCookie.setMaxAge(5 * 60);    // 5 minutes
        usernameCookie.setPath("/"); // Make cookies accessible across the app
        userIdCookie.setPath("/");
        usernameCookie.setHttpOnly(true); // Secure cookie
        userIdCookie.setHttpOnly(true);

        // Add cookies to the response
        resp.addCookie(usernameCookie);
        resp.addCookie(userIdCookie);

        // Create and configure HTTP session
        HttpSession session = req.getSession();
        session.setAttribute("username", username);
        session.setAttribute("userSecret", UUID.randomUUID().toString()); // Generate a unique secret
        session.setMaxInactiveInterval(10 * 60); // 10 minutes timeout

        // Log session information (optional, for debugging purposes)
        System.out.println("Session created for username: " + username);
        System.out.println("Session ID: " + session.getId());

        // Set the content type for response and handle character encoding
        resp.setContentType("text/html; charset=UTF-8");

        // Prepare response
        resp.getWriter().println("<h1>Cookies and Session set successfully</h1>");
        resp.getWriter().println(String.format("<p>Session ID: %s</p>", session.getId())); // Display session ID
    }
}
