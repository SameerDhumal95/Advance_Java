package study.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;


public class ReflectionExample {

	public static void main(String[] args) throws ClassNotFoundException {
		//3 ways to class Class object 

		//if you know the class name while writing the code then use this way
		Class<String> c1 = String.class;
		
		//when u dont know the class name while writing the code 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the class name");
		Class c2 = Class.forName(sc.next());
		
		//when u have the object of the class but dont know the class name
		Thread s = new Thread();
		Class c3 = s.getClass();

		//getting METADATA
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c3.getName());
		
		
		//to know fields of c3 
		Field[] fields = c2.getDeclaredFields();
		
		for(Field f: fields)
			System.out.println(f.getName()+"  "+f.getType());
		
		 //same for all Methods
		 Method[] methods = c1.getDeclaredMethods();
		 
		 for(Method m : methods) {
			 System.out.println(m.getName());
		 }	 
		 
		 //constructors
		 Constructor[] c = c1.getDeclaredConstructors();
		 
		 for(Constructor constructor : c)
		 {
			 System.out.println(constructor);
		 }	
	}

}
