package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/third")
public class ThirdServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.print("proccessing do get resquest by third servlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String message = req.getParameter("message");
		System.out.print("proccessing POST METHOD resquest by post servlet");
		System.out.print("message : " + message);

		// sending data to browser

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		
		writer.print("<h1>From submitted</h>");
		
		Date date = new Date(1);
//		writer.print(String.format("<h2>Message : %s </h2>  <h3>Current Date is : %s </h3>  ", message,date));

//		writer.print("""<h2>Message : %s </h2>
//				 <h3>Current Date is : %s </h3>  """.formatted(message,date));
		
		writer.print(String.format("<h2>Message: %s</h2><h3>Current Date is: %s</h3>", message, date));

	}
}
