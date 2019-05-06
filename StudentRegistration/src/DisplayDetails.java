

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/DisplayDetails")
public class DisplayDetails implements Servlet {

   
	
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
		String sFirstName = request.getParameter("firstname");
		String sLastName = request.getParameter("lastname");
		String sDOB = request.getParameter("dob");
		String sGender = request.getParameter("gender");
		String sEmail = request.getParameter("email");
		String sAddress = request.getParameter("addr");
		
		System.out.println("printing result text......"+sFirstName+" | "+sLastName+" | "+sDOB+" | "+sGender+" | "+sEmail+" | "+sAddress);
		
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body background=\"C:/Iyshw_workspace/WebDemo1/src/background-designs.jpg\">");
		out.println("<h2 align=\"center\">CONFIRM STUDENT DETAILS</h2>");	
		out.println("<p align=\"center\">");
		
		out.println("<form action=\"/StudentRegistration/SuccessPage\"/ >");
		out.println(" <table>");
		
		out.println(" <tr>");
		out.println(" <td align=\"right\"><b>First Name:</b></td>");
		out.println(" <td align=\"left\">"+sFirstName+"</td>");
		out.println(" </tr>");
		
		out.println(" <tr>");
		out.println(" <td align=\"right\"><b>Last Name:</b></td>");
		out.println(" <td align=\"left\">"+sLastName+"</td>");
		out.println(" </tr>");
		
		out.println(" <tr>");
		out.println(" <td align=\"right\"><b>DOB:</b></td>");
		out.println(" <td align=\"left\">"+sDOB+"</td>");
		out.println(" </tr>");
		
		out.println(" <tr>");
		out.println(" <td align=\"right\"><b>Gender:  </b> </td> ");
		out.println(" <td align=\"left\">"+sGender+"</td>");
		out.println(" </tr>");
		
		out.println(" <tr>");
		out.println("<td align=\"right\"><b>E-mail:</b></td> <td align=\"left\">"+sEmail+"</td>");
		out.println(" </tr>");
		
		out.println(" <tr>");
		out.println(" <td align=\"right\"><b>Address:</b></td>");
		out.println(" <td align=\"left\">"+sAddress+"</td>");
		out.println(" </tr>");
		
		
		out.println(" </table>");
		out.println("<p align=\"center\"><input type=\"submit\" value=\" Register \"></p>");
		out.println("</form></p>");
		out.println("</body><html>");
	}

}
