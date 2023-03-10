package study.sess;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		pw.println("<html><body>");
		pw.println("<form  method='post' >");
		pw.println("Enter a uname: <input type='text' name='uname' />");
		pw.println("<br /> Enter pass: <input type='password' name='password' />");
		pw.println("<br /> <input type='submit' value='login' />");
		pw.println("</form>");
		pw.println("</body></html>");
		pw.close();
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String uname = request.getParameter("uname");
	String pwd = request.getParameter("password");
	
	 HttpSession session = request.getSession();
	 if(session.isNew())
	 {
		 session.setAttribute("uname", uname);
		 RequestDispatcher rd= super.getServletContext().getRequestDispatcher("/HomeServlet");
		 rd.forward(request, response); //forward the current request to another servlet and then send the output of another servlet to the browser
	 }
	
	}

}