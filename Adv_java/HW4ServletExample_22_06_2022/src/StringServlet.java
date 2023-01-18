import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class StringServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String num = request.getParameter("num");
		int n =Integer.parseInt(num);
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		pw.println("<html><body>");
		pw.println("<h1> DATA ARE...</h1>");
		
		int ascii=65;
		int i=1;
		int j=1;
		
		pw.println("<table border=1 width=100 height=500>");
		pw.println("<th>Serial Number</th>");
		pw.println("<th>File Name</th>");
		for (int k=1; k<=n; k++)
		{
			if(ascii>90)
			{
				ascii=65;
				i=i+1;			
			}
			
			String s =(char)ascii++ +" "+i;
			
			pw.println();
			pw.println("<tr><td>"+(j++)+"</td>");
			pw.println("<td>"+s+"</td></tr>");
		}
		pw.println("</table>");
		pw.println("</body></html>");
		pw.close();		
	}
}








