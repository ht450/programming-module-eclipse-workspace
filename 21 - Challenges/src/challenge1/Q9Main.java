package challenge1;

public class Q9Main {

	public static void main(String[] args) {

		System.out.println("In main");
		// TODO : start 10 of the threads
		for (int loop=0; loop<10; loop++) {
			
			Q9Threader counterThread = new Q9Threader();
			Thread thread = new Thread(counterThread);
			thread.start();
			
		}

		System.out.println("Main done");
	}

}
