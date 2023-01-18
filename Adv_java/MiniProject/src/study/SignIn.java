package study;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignIn
 */
@WebServlet("/SignIn")
public class SignIn extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		pw.println("<html><body>");
		
		
		String usernameInput=request.getParameter("username");
		String passwordInput=request.getParameter("password");
		
		//Hashmap--> 1. KEY  2. VALUE
		HashMap<String, String> hm=new HashMap();
		
		DAO dao=new DAO();
		
		ResultSet rs=dao.getRows("select * from user_info_tbl");
		
		try {
			while(rs.next()) {
				String _username=rs.getString(5);
				String _password=rs.getString(6);
				hm.put(_username, _password);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(hm);
		
		if(hm.containsKey(usernameInput) ) {
			
			String _passwordOutput=hm.get(usernameInput);
			
			if(_passwordOutput.equals(passwordInput)) {
				pw.println("<h1>Succesfull</h1>");
				pw.println("<a href='index.html'><h3>Go to Home Page</h3></a>");
			}
			else {
				pw.println("<h1>Unsuccesfull, Password Invalid</h1>");
				pw.println("<a href='sign-in.html'><h3>Go to Sign-in</h3></a>");
			}
			
		}
		else {
			pw.println("<h1>Unsuccesfull Username Invalid</h1>");
			pw.println("<a href='sign-in.html'><h3>Go to Sign-in</h3></a>");
		}
		
		pw.println("</body></html>");
		pw.close();
	}

}
