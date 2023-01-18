package study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SecondServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String num = request.getParameter("num"); //response from InputServlet
		int n = Integer.parseInt(num);
		
		String range = request.getParameter("to range");
		int nr = Integer.parseInt(range);
		
		String frange = request.getParameter("from range");
		int fr = Integer.parseInt(frange);
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		pw.println("<html><body>");
		for(int i=fr;i<=nr;i++)
		{
			String s = n +"*"+i+" = "+n*i;
			//System.out.println(s);  //that will print on tomcat server
			pw.println("<br/>"+s);
		}
		pw.println("</body></html>");
		
	}

}
