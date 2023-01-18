package study.hw2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductList {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> pname = new ArrayList<String>();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				try {
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ietmar2022", "root", "2022");
					PreparedStatement pstmt = con.prepareStatement("select name from product");
					ResultSet rs = pstmt.executeQuery();
					while(rs.next())
						pname.add(rs.getString("name"));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Number of product present in table : " + pname.size());

				System.out.println("enter a product name");
				String nm = sc.next();
				for(String name : pname)
				{
					if(nm.equalsIgnoreCase(name))
					{
						System.out.println(nm + " is exist in list");
						return;
					}
				}
				System.out.println(nm + " is not exist in list");


	}

}
