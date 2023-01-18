package some.other;

import org.springframework.stereotype.Component;

@Component
public class MyDate {

	private int day,month,year;
	
	public MyDate()
	{
		day=1;
		month=1;
		year=2000;
		System.out.println("mydate constructor called...");
	}
	
	public int getDay()
	{
		return day;
	}
	
}
