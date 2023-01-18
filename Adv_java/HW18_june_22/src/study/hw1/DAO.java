package study.hw1;
//
//import java.sql.CallableStatement;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.sql.Types;
//
////DATA ACCESS OBJECT = DAO
//public class DAO {
//
//	public Connection myGetConnection()
//	{
//		Connection con = null;
//		try
//		{
//		Class.forName("com.mysql.cj.jdbc.Driver");
//	   
//		String url ="jdbc:mysql://localhost:3306/ietmar2022";
//	    String uname = "root";
//	    String pwd = "2022";
//		
//	    con = DriverManager.getConnection(url,uname,pwd);
//		}
//		catch(ClassNotFoundException | SQLException e)
//		{
//			System.out.println("the connection could not be made "+e);
//		}
//		return con;
//	}
//	
//	
//	public void addProduct(int id, String name,int cost) 
//	{
//		//get connection
//		try {
//		Connection con = myGetConnection();
//		PreparedStatement psmt = con.prepareStatement("insert into product values(?,?,?)");
//        psmt.setInt(1,id);  //1 is question mark no.
//        psmt.setString(2,name); //2 is question mark no.
//        psmt.setInt(3,cost); 
//		psmt.executeUpdate(); 
//		
//		//we have used here prepared statement
//		}
//		catch(SQLException e)
//		{
//			e.printStackTrace();
//		}
//	}//end of add product
//	
//	public void updateCost(int id, int cost)
//	{
//		Connection con = myGetConnection();
//		try {
//			PreparedStatement psmt = con.prepareStatement("update product set cost=? where id =?");
//		
//			//set the ? values
//			
//			psmt.setInt(1, cost);//first ? is cost
//			psmt.setInt(2, id);
//			
//			psmt.executeUpdate();
//		
//		}
//		catch(SQLException e)
//		{
//			e.printStackTrace();
//		}
//	}
//	
//	public void updateName(int id, String name)
//	{
//		Connection con = myGetConnection();
//		try {
//			PreparedStatement psmt = con.prepareStatement("update product set name=? where id =?");
//		
//			//set the ? values
//			
//			psmt.setString(1, name);//first ? is cost
//			psmt.setInt(2, id);
//			
//			psmt.executeUpdate();
//		
//		}
//		catch(SQLException e)
//		{
//			e.printStackTrace();
//		}
//	}
//	
//	public void updateCostandName(int id, String name,int cost)
//	{
//		Connection con = myGetConnection();
//		try {
//			PreparedStatement psmt = con.prepareStatement("update product set cost=?,name=? where id =?");
//		
//			//set the ? values
//			
//			psmt.setInt(1, cost);//first ? is cost
//			psmt.setString(2, name);
//			psmt.setInt(3, id);
//			
//			psmt.executeUpdate();
//		
//		}
//		catch(SQLException e)
//		{
//			e.printStackTrace();
//		}
//	}
//	
//	public void deleteRecord(int id)
//	{
//		Connection con = myGetConnection();
//		try {
//			PreparedStatement psmt = con.prepareStatement("delete from product where id =?");
//		
//			
//			psmt.setInt(1, id);
//			
//			psmt.executeUpdate();
//		
//		}
//		catch(SQLException e)
//		{
//			e.printStackTrace();
//		}
//	}
//	
//	public void showRecord(int id)
//	{
//		Connection con = myGetConnection();
//		try {
//			PreparedStatement psmt = con.prepareStatement("select * from product where id =?");
//		
//			
//			psmt.setInt(1, id);
//			
//			ResultSet rs = psmt.executeQuery();
//		
//			if(rs.next())
//			{
//				System.out.println("id = "+rs.getInt(1)+" name = "+rs.getString(2)+" cost = "+rs.getInt(3));
//			}
//			else
//			{
//				System.out.println("Record not found...");
//			}
//			
//			
//		}
//		catch(SQLException e)
//		{
//			e.printStackTrace();
//		}
//	}
//	
//}


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
	
	public Connection myGetConnection()
	{
		Connection con = null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/ietmar2022";
		String uname = "root";
		String pwd = "2022";

		con = DriverManager.getConnection(url, uname, pwd);
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println("the connection could not be made" + e);
		}
		return con;
	}
	
	public ResultSet getRows(String sql) 
	{
		Connection con = myGetConnection();
		ResultSet rs = null;
		Statement stmt;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			System.out.println("problem showing in rows " + e);
		}
		
		return rs;
	}

	public void showResultset(ResultSet rs)
	{
		try {
			while(rs.next())
			{
				int pId = rs.getInt("id");
				String pName = rs.getString("name");
				int cost = rs.getInt(3);
				
				System.out.println("Row : " + pId + " , " + pName + " , " + cost);
			}
		} catch (SQLException e) {
			System.out.println("problem showing resultset " + e);
		}

	}
	
	public void updatename(int id, String name)
	{
		Connection con = myGetConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement("update product set name=? where id=?");
			pstmt.setString(1, name);
			pstmt.setInt(2, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public void updateCost(int id, int cost)
	{
		Connection con = myGetConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement("update product set cost=? where id=?");
			pstmt.setInt(2, id);//1 number is for question mark.
			pstmt.setInt(1, cost);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void updateNameCost(int id, String name, int cost)
	{
		Connection con = myGetConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement("update product set name=?, cost=? where id=?");
			pstmt.setInt(3, id);//1 number is for question mark.
			pstmt.setInt(2, cost);
			pstmt.setString(1, name);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void deleteRec(int id)
	{
		Connection con = myGetConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement("delete from product where id=?");
			pstmt.setInt(1, id);//1 number is for question mark.
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void showRowInfo(int id)
	{
		Connection con = myGetConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement("select * from product where id=?");
			pstmt.setInt(1, id);//1 number is for question mark.
			
			pstmt.executeQuery();
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				System.out.println(" id : " + rs.getInt(1) + "\n name : " + rs.getString(2) + "\n cost : " + rs.getInt(3));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	

}

