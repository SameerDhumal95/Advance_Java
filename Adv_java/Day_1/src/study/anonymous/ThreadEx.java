package study.anonymous;

public class ThreadEx {

	public static void main(String[] args)
	{
		Runnable task = new Runnable() {  //Runnable Interface
			
			@Override
			public void run() {
				for(int i=0;i<10;i++) System.out.println("Hello");
			}
		};
		//first thread
		new Thread(task).start(); //creating object shortcut method 
		
		//second thread
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for(int i=0;i<20;i++)   System.out.println("Hi");  //Simplicity Short hand notation (no need of extra class) //we cannot create constructor 
			}
		}).start();
		
	}//end of main
}//end of threadex
