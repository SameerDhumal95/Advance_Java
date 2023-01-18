package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DemoApplication {

public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//class is loaded from jar to Ram
		Class.forName("com.mysql.cj.jdbc.Driver");
	    String url ="jdbc:mysql://localhost:3306/ietmar2022";
	    String uname = "root";
	    String pwd = "2022";
	    
	    //connection
	    Connection con = DriverManager.getConnection(url, uname, pwd);
	    
	    //insert record through java program
	    Statement stml = con.createStatement();
	    
	    Scanner sc =new Scanner(System.in);
	    System.out.println("Enter ID");
	    int id = sc.nextInt();
	    System.out.println("Enter Product");
	    String name = sc.next();
	    System.out.println("Enter Cost");
	    int cost = sc.nextInt();
	    String sql = "insert into product values("+id+",'"+name+"',"+cost+")";
	    stml.executeUpdate(sql);
	    
	    System.out.println("Record Inserted");
		//System.out.println(con);
	}

} 
