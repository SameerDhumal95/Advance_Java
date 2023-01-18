package study.useinnerstatic;

public class Test2 {

	private int x = 20;
	private static int y = 200;
	
	//it does not get the this of Outer class implicitly
	//only static properties can be accessed
	static class Inner
	{
		private int a = 99;
		private static int b = 999;
		
		public void show()
		{
			System.out.println("X is not avilable here "+" Y= "+y+"A ="+a);
		}
	}//End of inner
	
	public static void main(String[] args) {
		Inner obj = new Test2.Inner(); //new syntax//outerClassName.inner
		obj.show();
	}
}
