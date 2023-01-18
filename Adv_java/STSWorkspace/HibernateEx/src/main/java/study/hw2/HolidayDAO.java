package study.hw2;

	import java.util.Scanner;

	import org.hibernate.Session;
	import org.hibernate.Transaction;
	import org.hibernate.query.Query;

	import java.sql.Date;

	public class HolidayDAO {

		public static Scanner sc = new Scanner(System.in);

		public void addHoliday(Session sess)
		{
			System.out.println("Enter ID : ");
			 int id =sc.nextInt();
			 sc.nextLine();
			 System.out.println("Enter Holiday NAME : ");
			String hname=sc.nextLine();
			System.out.println("Enter Holiday Date: yyyy-mm-dd");
			String duration=sc.nextLine();
			

			Transaction tx=sess.beginTransaction();
			HolidaysEntity  obj= new HolidaysEntity(id,hname,Date.valueOf(duration));
			sess.save(obj);
			tx.commit();
			
			System.out.println("RECORD INSERTED!!");
		}

		public void updateHoliday(Session sess,int hid,String newHolidayname)
		{
			Transaction tx =sess.beginTransaction();
			
			HolidaysEntity dbRow=sess.get(HolidaysEntity.class,hid); //fetching the row whose id is 1
			dbRow.setNameOfHoldiay(newHolidayname);
			
			tx.commit();
			
			System.out.println("HOLIDAY NAME UPDATED!!");
		}

		public void deleteHoliday(Session sess,int hid)
		{
			Transaction tx =sess.beginTransaction();
			
			HolidaysEntity dbRow=sess.get(HolidaysEntity.class,hid); //fetching the row whose id is 1
			sess.delete(dbRow);
			
			tx.commit();
			
			System.out.println("RECORD DELETED!!");
		}

		public void showHolidays(Session sess)
		{
			Query<HolidaysEntity> q =sess.createQuery("from study.hw2.HolidaysEntity ");
			
			q.list().stream().forEach((row)->{System.out.println(row);});
		}

		
}


