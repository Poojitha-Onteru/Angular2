package Serv4;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.GenericServlet;
import java.io.IOException;
import java.io.PrintWriter;
/**

/**
 * Servlet implementation class Servlet4
 */
public class Servlet4 extends GenericServlet {
	private static final long serialVersionUID = 1L;
	public int count;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public void init(ServletConfig sc) {
        count=Integer.parseInt(sc.getInitParameter("count"));
    }
    public Servlet4() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
   	public void service(ServletRequest request,ServletResponse response) throws ServletException, IOException {
   		PrintWriter pw=response.getWriter();
   		response.setContentType("text/html");
   		pw.println("<html>"+"<body>");
   		pw.println("<h2>value of count :</h2>"+count);
   		pw.println("</html>"+"</body>");
   		pw.close();
   	}

}
