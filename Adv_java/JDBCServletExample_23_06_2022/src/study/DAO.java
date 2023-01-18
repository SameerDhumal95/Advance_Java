package study;

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
			System.out.println("the connection could not be made "+e);
		}
		return con;
	}
	

	public void addProduct(int id ,String name,int cost)
	{
		Connection con = myGetConnection();
		try {
        PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?)");
		pstmt.setInt(1,id); // 1 is question mark 1
		pstmt.setString(2,name); //internally single quote added or not if null
		pstmt.setInt(3,cost);
		pstmt.executeUpdate();
        con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//add product
	
	public ResultSet getRows(String sql) 
	{
		Connection con = myGetConnection();
		Statement stmt;
		ResultSet rs = null;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return rs;
		
	}

}
