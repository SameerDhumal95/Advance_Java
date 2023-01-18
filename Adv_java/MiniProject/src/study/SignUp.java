package study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter pw=response.getWriter();
		
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		String contact=request.getParameter("contact");
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		
		long _contact=Integer.parseInt(contact);
		
		DAO dao=new DAO();
		dao.addUser(name, gender, _contact, userName, password);
	
		pw.println("<html><body>");
		pw.println("<h1>User Registered Successfully...</h1>");
		pw.println("<a href='index.html'><h3>Go to HomePage</h3></a>");
		
		pw.println("</body></html>");
	}


}
