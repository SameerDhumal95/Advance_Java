package study.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DAO {
	
	public Connection myGetConnection()
	{
		Connection con=null;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/ietmar2022";
		String uname ="root";
		String pwd = "2022";
		
		con = DriverManager.getConnection(url, uname, pwd);
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println("the connection could not be made....."+e);
		}
		return con;
	}
	
	
	public void addTask(String date,String task_info)
	{
		Connection con = myGetConnection();
		try {
        PreparedStatement pstmt = con.prepareStatement("insert into planner values(default,?,?)");
		pstmt.setString(1,date);  
		pstmt.setString(2,task_info); 
		pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//add task
	
	

}
	