package HW;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class InputSer extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		pw.println("<html><body>");
		pw.println("<form action='second' method='post'/>");
		pw.println("Enter the user name:<input type='text' name='username'/>");
		pw.println("<br/>Enter the surname :<input type='text' name='surname'/>");
		pw.println("Gender:<br />Male<input type='radio' name='gender' value='Male'/>");
		pw.println("<br />Female<input type='radio' name='gender' value='Female'/>");

		pw.println("<br/>Submit:<input type='submit' name='Submit'/>");
		
		pw.println("</form>");
		pw.println("</body></html>");
		
		
	}

}




















