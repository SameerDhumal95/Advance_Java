package HW;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InputSer extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		pw.println("<html><body>");
		
		   pw.println("<form action='login' method='post'>");
		   
		     pw.println("Enter Username:<input type='text' name='Uname'/>");
		     pw.println("<br/><br/>Enter Password:<input type='text' name='PWD'/>");
		     pw.println("<br/><input type='submit' value='submit'>");
		     
		pw.println("</form>");
		
		pw.println("</body></html>");
		pw.close();
	}

}
