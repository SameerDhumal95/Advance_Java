package study.lambda;

import java.util.Comparator;
import java.util.TreeSet;

public class LambdaEx2 {

	public static void main(String[] args) {
		
		Comparator<Student > cmp = (o1,o2) -> {  //functional interface
			
			if(o1.roll > o2.roll) return 1;
			if(o1.roll < o2.roll) return -1;
			else 
				return 0;
			
		};
		
		TreeSet<Student> ts = new TreeSet<Student>(cmp); //roll no wise sorting 
		ts.add(new Student(12,"xxx"));
		ts.add(new Student(10,"aaa"));
		ts.add(new Student(9,"bbb"));
		ts.add(new Student(13,"ccc"));
	
	    for(Student stud: ts)
	    {
	    	System.out.println(stud);
	    }
	}
}//end of LambdaEx2

class Student implements Comparable<Student>
{
	int roll;
	String name;
	
	Student(int r, String s)
	{
		roll = r;
		name = s;
	}
	
	@Override
	public String toString() {
	
		return roll + " "+ name;
	}

	@Override
	public int compareTo(Student o) {
		
		return this.name.compareTo(o.name); 
	}

	
}
