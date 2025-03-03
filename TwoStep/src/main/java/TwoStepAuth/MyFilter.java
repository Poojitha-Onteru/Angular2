package TwoStepAuth;

import jakarta.servlet.Filter;
import jakarta.servlet.*; 
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFilter extends HttpFilter implements Filter {
	public void init(FilterConfig fConfig) throws ServletException {}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String p=request.getParameter("pass");
		if(p.equals("1234")) {
			chain.doFilter(request, response);
		}
		else {
			pw.println("Wrong details..!");
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
	}
	
	public void destroy() {}

}
