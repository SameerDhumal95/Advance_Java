package HW;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		String Uname = request.getParameter("Uname");
		String PWD = request.getParameter("PWD");
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<html><body><center>");
		
		//condition check
		if(Uname.equals("iet") && PWD.equals("123"))
		{
			String s = "You have logged in successfully";
			pw.println("<h1><br />"+s+"</h1>");
		}
		
		else
		{
			pw.println("<h1><br />log in failed...</h1>");
		}
		pw.println("</center></body></html>");
	}
	
	

}

