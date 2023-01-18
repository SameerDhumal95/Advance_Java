package study.lambda;

/*public class LambdaEx {

	public static void main(String[] args) {

		Runnable r1 = new Runnable() {

			@Override
			public void run() {

				while(true)
					System.out.println("Hello");
			}
		};

	//	new Thread(r1).start();  or 
		Thread t1 = new Thread(r1);
		t1.start();
	}
}*/

/*Upper code written by Lambda expression*/ 

//Lambda expression

public class LambdaEx {

	public static void main(String[] args) {

		Runnable r1 = ()-> {

			while(true) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		};

		//	new Thread(r1).start();  or 
		Thread t1 = new Thread(r1);
		t1.start();
	}
}
