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
import java.io.*;
/**
 * Servlet Filter implementation class MyFilOtp
 */
public class MyFilOtp extends HttpFilter implements Filter {

  

	public void destroy() {
		// TODO Auto-generated method stub
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String otp=request.getParameter("otp");
		if(otp.equals("7890")){
			pw.println("The entered OTP is correct...!");
		}
		else {
			pw.println("Entered wrong OTP..!");
			RequestDispatcher rq=request.getRequestDispatcher("index.html");
			rq.include(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
