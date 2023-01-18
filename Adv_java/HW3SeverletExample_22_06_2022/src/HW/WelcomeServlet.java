package HW;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class WelcomeServlet extends HttpServlet {
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String s=request.getParameter("surname");
		String u=request.getParameter("username");		
		String g=request.getParameter("gender");
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		pw.println("<html><body>");
		
		String nu = u.substring(0,1).toUpperCase()+u.substring(1,u.length()).toLowerCase();
		String nl = s.substring(0,1).toUpperCase()+s.substring(1,s.length()).toLowerCase();
		
		
		if(g.equals("Male"))
		{
			pw.println("<h1>Mr. "+nu+" "+nl+"</h1>");
		}
		else
		{
			pw.println("<h1>Miss. "+nu+" "+nl+"</h1>");
		}
		pw.println("</body></html>");
	}

}












