package hw;
/*1. Write a FLOW as follows
		 http://localhost:8080/AppHW/find   GET       [ HINT WRITE A SERVLET  S1  that is mapped to  url-pattern " find "  , add doGet ]
		The above url should show a dropdown list of all productIds in the product table.
		Add a show button below it.
		when USER selects a product Id and clicks show button
		go to   http://localhost:8080/AppHW/find  POST   [  HINT   add doPost to the SERVLET S1  created above   ]
		this should show the id, name and cost of the selected id in 3 textfields. the id textfield should be readOnly. 
		show a update button below it.
		When USER changes the product name or cost or both and clicks the update button then
                go to http://localhost:8080/AppHW/update POST   [ HINT WRITE A SERVLET S2 that is mapped to url-pattern "update"  , add doPost  ]
		this should update the table with new values and show output as Record updated .  
               show a link to the  http://localhost:8080/AppHW/find     below it.
  */
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/find")
public class S1 extends HttpServlet {
	
	List<Integer> list=new ArrayList();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter pw=response.getWriter();
		pw.println("<html><body>");
		pw.println("<form action='S2' method='POST'>");
		int i=0;
		int size=list.size();
		pw.println("<center>Select List No. to Show Product :");
		pw.println("<select name='id'>");
		while(size>0) {
				pw.println("<option value="+list.get(i)+">"+list.get(i)+"</option>");
				//System.out.println(list.get(i));
				i++;
				size--;
		}
		pw.println("</select>");
		pw.println("<input type='submit' value='Submit'>");
		pw.println("</center></body></html>");
		pw.close();
		
		
		
	}
	
	@Override
	public void init() throws ServletException {
		DAO dao=new DAO();
		
		ResultSet rs=dao.getRows("Select * from product");
		
		try {
			while(rs.next()) {
				list.add(rs.getInt(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
