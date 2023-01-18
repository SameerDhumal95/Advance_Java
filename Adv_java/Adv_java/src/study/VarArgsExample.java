package study;

public class VarArgsExample {

	public static void main(String[] args) {
		
		//sum();
		//sum(10);
		//sum(10,20);
		sum(1,2,3,4,5);
		holidays("june",25,24,2);
		
	} //end main
	
	static void sum(int... nums)
	{
		int total=0;
		for(int i=0;i<nums.length;i++)
		{
			total=total+nums[i];
		}
		System.out.println("total= "+total);
	}
	
	static void holidays(String month,int...days)
	{
		System.out.println("The holiydays for "+month+" month are: -");
	    for(int day : days)
	    {
	    	System.out.println(day+" ");
	    }
	}
}
