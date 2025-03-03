package ServletDay2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;


/**
 * Servlet implementation class servletDisp1
 */
public class servletDisp1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletDisp1() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String n=request.getParameter("username");
		String p=request.getParameter("pass");
		//validation
		if(n.equals("poojitha") && p.equals("2003")) {
			RequestDispatcher rd=request.getRequestDispatcher("servletDisp2");
			//response.sendRedirect("servletDisp2");
			rd.forward(request, response);
			
		}
		else {
			out.print("Sorry You have entered wrong details");
			RequestDispatcher rd=request.getRequestDispatcher("/index.html");
			rd.include(request, response);
			
		}
		
	}

}
