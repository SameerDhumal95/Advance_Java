package study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
	public Connection myGetConnection() {
		Connection connect=null;
		try {
		//Load the class from jar to RAM
		Class.forName("com.mysql.cj.jdbc.Driver");
		//url-->Protocol:dbvendor://IP:portname/database
		String url="jdbc:mysql://localhost:3306/mproject";
		String uname="root";
		String pwd="2022";
				
		connect = DriverManager.getConnection(url,uname,pwd);
		}
		catch(ClassNotFoundException|SQLException e) {
			System.out.println("the connection could not be made"+e);
		}
		return connect;
	}
	
	public ResultSet getRows(String sql) {
		Connection con=myGetConnection();
		ResultSet rs=null;
		Statement stmt=null;
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	public void showResultSet(ResultSet rs) {
		try {
			
			while(rs.next()) {
			int pID=rs.getInt("id");
			String pName=rs.getString("name");
			int cost=rs.getInt(3);
			
			System.out.println(pID+" "+pName+" "+ cost);
		}
		}
		catch(SQLException e) {
			System.out.println("Problem showing result "+ e);	
		}
		}
	
	
	public void addUser(String name,String gender,Long contact,String username,String password) {
		Connection con=myGetConnection();
		try{
			PreparedStatement pstmt=con.prepareStatement("insert into user_info_tbl values(default,?,?,?,?,?)");
			pstmt.setString(1, name);
			pstmt.setString(2, gender);
			pstmt.setLong(3, contact);
			pstmt.setString(4, username);
			pstmt.setString(5, password);
			pstmt.executeUpdate();
		}
		catch(SQLException e) {
			System.out.println("Problem: "+e);
		}
	}
	
	
	}
	
	

