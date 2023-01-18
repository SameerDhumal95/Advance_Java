package study.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamsEx {

	static ArrayList<String> al = new ArrayList<String>();
	
	public static void main(String[] args) {

		
		al.add("red");
		al.add("blue");
		al.add("violet");
		al.add("pink");
		al.add("green");
		al.add("black");
		al.add("orange");
		
		
		al.stream().forEach( (element)->{System.out.println("this is "+element);} );
		
		al.stream().forEach(  (e)->{System.out.println(e.toUpperCase());} );
		
		myForEach( (el)->{System.out.println("my for each "+el);} );
		
		System.out.println("AFTER FILTERING");
		
		//select only those elements that match a condition and create a new stream
		
		Stream<String> st1 =al.stream();
		
		/* filter accept condition and do things*/
		Stream<String> st2 = st1.filter( (ele)->{ if(ele.length() < 5) return true; else return false;} );
		
		  st2.forEach( (e)->{System.out.println(e);} ); //separate writing
		
		  System.out.println("Another Filter...");
		  
		  /* this is shorthand notation to write filter*/
		  al.stream().filter( (ele)->{if(ele.length() > 5) return true; else return false;})
		  			 .forEach((e)->{System.out.println("--"+e);} ); //combined writing using .
          
	}//end of main
	
	static void myForEach(Consumer<String> consumer )
	{
		for(int i=0;i<al.size();i++)
		{
			String ele = al.get(i);
			 consumer.accept(ele);
		}
		
	}
	
	

}