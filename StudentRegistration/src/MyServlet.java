

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/MyServlet")
public class MyServlet implements Servlet {

   
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("I am in a servet");
		out.println("<form action=\"/action_page.php\">");
		out.println("E-mail: <input type=\"email\" name=\"user_email\">");
		out.println("Country code: <input type=\"text\" name=\"country_code\" pattern=\"[A-Za-z]\" title=\"Only Alphabets are allowed\">");
		out.println("<input type=\"submit\"></form>");
		
		out.println("</body><html>");
		
		
		
		
	}

}
