package study.client;

import java.sql.ResultSet;

public class Clint2 {

	public static void main(String[] args) {
		DAO dao = new DAO();
		System.out.println("Show All products:");
		ResultSet rs = dao.getRows("select * from product");
		dao.showResultset(rs);
		System.out.println();
		
		System.out.println("products less than 200 rs.:");
		//show all the records from the table that have cost less than 200
		 rs = dao.getRows("select * from product where cost < 200");
		dao.showResultset(rs);
		System.out.println();
		
//		System.out.println("products after prepared statement:");
//		//this is done by prepared statement
//		dao.addProduct(8,"Desktop",3000);
//		dao.showResultset(dao.getRows("select * from product"));
//		System.out.println();
//		
//	    System.out.println("After updatation:");
//	    dao.updateCost(8, 3500);
//	    dao.showResultset(dao.getRows("select * from product"));
	
//	    dao.callHiStoredProc();
	
		dao.callgetNameProc(8);
	}

}
