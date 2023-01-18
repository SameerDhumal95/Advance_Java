package study.hw1;

import java.util.List;
import java.util.Scanner;

import org.hibernate.query.Query;


import org.hibernate.Session;
import org.hibernate.Transaction;

public class CoursesDAO {

	Scanner sc = new Scanner(System.in);
	
	public void addCourse(Session sess)
	{
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		
		System.out.println("Enter Course Name: ");
		String cname = sc.next();
		
		System.out.println("Enter Course Desc: ");
		String cdesc = sc.next();
		

		System.out.println("Enter faculty name: ");
		String fname = sc.next();
		

		System.out.println("Enter Course Duration: ");
		int cdur = sc.nextInt();
		
		Transaction tx = sess.beginTransaction();

		CourseEntity c1 = new CourseEntity(id,cname,cdesc,cdur,fname);

		sess.save(c1);

		tx.commit();
		
//		System.out.println("Record Inserted..");
	}
	
	public void showCourses(Session sess)
	{
	//List<CourseEntity> list = sess.createQuery("select c from courses c").list();
    Query<CourseEntity> list = sess.createQuery("from study.hw1.CourseEntity");
    
    list.list().stream().forEach((row)->{
    	
    	System.out.println(row);
    });
	}
}
