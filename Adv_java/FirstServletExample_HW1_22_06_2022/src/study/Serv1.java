package study;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Serv1")
public class Serv1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int count = Integer.parseInt(request.getParameter("count"));
		count ++;
		//response.getWriter().append("count = "+count++);
	
		
		ServletContext context = super.getServletContext();
		RequestDispatcher rd =context.getRequestDispatcher("/Serv2");
		request.setAttribute("counter", count);
		rd.include(request, response);
		
		
	}

	

}
