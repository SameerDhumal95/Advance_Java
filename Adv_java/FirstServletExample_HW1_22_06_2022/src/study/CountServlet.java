package study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/CountServlet")
public class CountServlet extends HttpServlet {
	int counter = 0;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//int counter = 0;
 
		
	HttpSession session=  request.getSession();
	int ucounter=0;
	
	if(session.isNew())
	{
		ucounter = 1;
		session.setAttribute("userwise_counter",1);
	}
	
	else
	{
		ucounter = (Integer)session.getAttribute("userwise_counter");
		
		ucounter++;
		
		session.setAttribute("userwise_counter", ucounter);
	}
    
    PrintWriter pw = response.getWriter();
    
    counter++;
    pw.println("the access count is "+counter);
    pw.println("the total user wise count is "+ucounter);
    pw.close();
	}
}
