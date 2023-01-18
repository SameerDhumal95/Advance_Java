package study;

import study.anno.MySticker;

@MySticker(value="aaa",roll=23)
public class MyClass {

	@MySticker(value="sss",roll=23)
	public void f1() //motorcycle
	{
		System.out.println("f1");
	}
	
	@MySticker(value="rrr",roll=21)
	public void f2()
	{
		System.out.println("f2");
	}
	
}
