package study.lambda;

public class SimpleLambdaEx {

	public static void main(String[] args) {
		
		//this is the class definition that implements the interface method
		I1 obj1 = () -> { System.out.println("test I1");};
		
		I2 obj2 = (p1,p2) -> { System.out.println("I got "+ p1+" , "+"p2");};
		
		I3 obj3 = (p1) -> { return new Student(p1,"PPP");};
		
		obj1.m1();
		obj2.m2(true, 'A');
		obj2.m2(false,'B');
		Student s = obj3.m3(23);
		System.out.println(s);
		
		
		test(obj1);
		test(() -> {System.out.println("This is another passing via static");});
		
	}//end of main
	
	//static method through passing
	static void test(I1 obj)
	{
		obj.m1();
	}

}//end of class


@FunctionalInterface
interface I1
{
	void m1();
}

interface I2
{
	void m2(boolean x,char ch);
}

@FunctionalInterface
interface I3
{
	Student m3(int x);
}

