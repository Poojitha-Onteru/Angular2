package FilterPack;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * Servlet Filter implementation class MyFilter
 */
public class MyFilter extends HttpFilter implements Filter {
	FilterConfig conf;
    public MyFilter() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    public void init(FilterConfig conf) throws ServletException {
		// TODO Auto-generated method stub
    	this.conf=conf;
	}
    
    
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		String s=request.getParameter("uname");
		if(s.equals("onteru")) {
			out.print("The name given is correct..!");
		}
		else {
			chain.doFilter(request, response);
		}
	}
	public void destroy() {
		// TODO Auto-generated method stub
	}


}
