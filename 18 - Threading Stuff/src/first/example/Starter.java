package first.example;

public class Starter {

	public static void main(String[] args) {
		
		MyThreadFirst myThreadFirst = new MyThreadFirst();
		
		Thread thread = new Thread(myThreadFirst);
		
		thread.start();
		
		do {
			System.out.println("In main thread...");
		} while (true);
		
		
		
	}

}
