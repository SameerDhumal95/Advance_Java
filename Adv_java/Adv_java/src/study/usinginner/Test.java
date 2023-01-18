package study.usinginner;
//Outer Class
public class Test {
	
	private int data1 = 100;
	private int comm = 344;
	
	//Inner class
	class User
	{
		private int data2=101;
		private int comm = 999;
		
		public void show()
		{
			//inner class method is directly/Implicitly using the private property of outer class
			System.out.println("Using inner class data2 = "+data2+" data1 = "+data1);
			System.out.println("Test Comm = "+Test.this.comm+" User comm ="+this.comm);
		}
		
		public void display()
		{
			//Outer class Explicitily create objects of user
			System.out.println("data1="+data1+" data2="+new User().data2);
		}
		
	}//end of user
	
	//we cannot write static method in inner class and if we want to write then make class static

	public static void main(String[] args) {
		
		Test obj = new Test();
		User u = obj.new User(); //syntax to access inner class in main(creating an object of inner class)
		//User is created from obj
		u.show();
	}//end of main
}

//using inner class no need of getter methods we can access all the properties of outer class
