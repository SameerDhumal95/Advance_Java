package study.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;


/*we dont know class name but we want to create object of the class So reflection is the method to create object*/

public class Example2
 {
	 public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		 Scanner sc =new Scanner(System.in);
		 System.out.println("enter class name");
		 
		 Class c1 = Class.forName(sc.next());
		 
		 System.out.println("the class is "+c1.getName());
		 //Object obj = c1.newInstance(); //or
		
		 Constructor ctor = c1.getDeclaredConstructor(null);
		 Object obj = ctor.newInstance();
		 
		 /* in this code we have not mention class*/ 
		 
		 Constructor ctor2 = c1.getDeclaredConstructor(String.class, int.class);
		 Object obj2 = ctor2.newInstance("new Yera celebration",30);
		 
		 Field[] properties = c1.getDeclaredFields();
		 
		 for(Field property : properties)
		 {
			 property.setAccessible(true);
			 
			 /*name not known but that will create object that is the beauty of reflection*/
			
			 System.out.println("obj = "+ property.getName()+" : "+property.get(obj));
			 System.out.println("obj2 = "+ property.getName()+" : "+property.get(obj2));
		 }
		 
		 System.out.println("Enter the name of method to call");
		 String mname = sc.next();
		 
		 Method method = c1.getDeclaredMethod(mname);
		 method.invoke(obj); //calling the specified method using a specific object
		 method.invoke(obj2);
	}
 }

 
 class SocialEvent
 {
	private String eventName;
	 private int numberOfPeople;
	 
	 public SocialEvent()
	 {
		 eventName = "Birthday Party";
		 numberOfPeople = 10;
		 
	 }
	 
	 public SocialEvent(String en,int num)
	 {
		 eventName =en;
		 numberOfPeople =num;
	 }
	 
	 public void show()
	 {
		 System.out.println("Show method called "+eventName+ " "+ numberOfPeople);
	 }
	 
	 public int getNumberOfPeople()
	 {
		 return numberOfPeople;
	 }
	 
 }