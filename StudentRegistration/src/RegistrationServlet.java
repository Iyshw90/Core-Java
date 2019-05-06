
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet implements Servlet {

	public RegistrationServlet() {
		// TODO Auto-generated constructor stub
	}

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
		
		out.println("<html><body bgcolor=\"#E6E6FA\">");
		//out.println("<html><body background=\"C:/Iyshw_workspace/WebDemo1/src/background-designs.jpg\">");
		
		out.println("<h2 align=\"center\">STUDENT REGISTRATION</h2>");	
		out.println("<p align=\"center\">");
		
		out.println("<form action=\"/StudentRegistration/DisplayDetails\"/ >");
		out.println(" <table>");
		
		out.println(" <tr>");
		out.println(" <td align=\"right\"><b>First Name:</b></td>");
		out.println(" <td align=\"left\"><input  type=\"text\" name=\"firstname\" pattern=\"[A-Za-z]\" title=\"Only Alphabets are allowed\" ></td>");
		out.println(" </tr>");
		
		out.println(" <tr>");
		out.println(" <td align=\"right\"><b>Last Name:</b></td>");
		out.println(" <td align=\"left\"><input type=\"text\" name=\"lastname\" ></td>");
		out.println(" </tr>");
		
		out.println(" <tr>");
		out.println(" <td align=\"right\"><b>DOB:</b></td>");
		out.println(" <td align=\"left\"><input type=\"date\" name=\"dob\"></td>");
		out.println(" </tr>");
		
		out.println(" <tr>");
		out.println(" <td align=\"right\"><b>Gender: </b>  </td> ");
		out.println(" <td align=\"left\"><input type=\"radio\" name=\"gender\" value=\"Male\"> Male");
		out.println(" <input type=\"radio\" name=\"gender\" value=\"Female\"> Female");
		out.println(" <input type=\"radio\" name=\"gender\" value=\"Other\"> Other</td>");
		out.println(" </tr>");
		
		out.println(" <tr>");
		out.println("<td align=\"right\"><b>E-mail:</b></td> <td align=\"left\"><input type=\"email\" name=\"email\" autocomplete=\"off\"></td>");
		out.println(" </tr>");
		
		out.println(" <tr>");
		out.println(" <td align=\"right\"><b>Address:</b></td>");
		out.println(" <td align=\"left\"><textarea name=\"addr\" rows=\"10\" cols=\"30\"></textarea></td>");
		out.println(" </tr>");
		
				
		out.println(" </table>");
		
		out.println("<p align=\"center\"><input type=\"submit\" value=\"Submit\"></p>");
		out.println("</form></p>");
		
		out.println("</body><html>");
	}

}
