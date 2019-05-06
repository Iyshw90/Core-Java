

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/SuccessPage")
public class SuccessPage implements Servlet {

   
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
		out.println("<html><body background=\"C:/Iyshw_workspace/WebDemo1/src/background-designs.jpg\">");
		out.println("<div align=\"center\">");	
		out.println("<p align=\"center\"><br><br><br><br><br><br><br>");
		out.println("<h3 align=\"center\">Thank you!</h3>");
		out.println("<h2 align=\"center\">YOUR  REGISTRATION  WAS  SUCCESSUL!!</h2>");
		out.println("</p></div>");
		out.println("</body><html>");
	}

}
