package Servlet2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class DemoServlet
 */
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String title="Using post method to read form data";
		String Fname=request.getParameter("fname");
		String Lname=request.getParameter("lname");
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h1>"+title+"</h1>"+"</br>");
		pw.println("your name is: "+Fname+"</br>");
		pw.println("Your last name is: "+Lname+"</br>");
		pw.close();
	}

}
