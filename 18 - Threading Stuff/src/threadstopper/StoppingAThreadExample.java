package threadstopper;

public class StoppingAThreadExample {

	public static void main(String[] args) {
		
		// start 20 sec thread sleep
		SleepyThread sleepyThread = new SleepyThread();
		Thread newThread = new Thread(sleepyThread);
		newThread.start();
		
		// main thread to have a sleep to...
		try {
			System.out.println("Main thread - going for a small sleep");
			Thread.sleep(2000);
			System.out.println("Main thread - awake");
		} catch (InterruptedException e) {

		}
		
		// before Main Thread finishes ensure the SleepyThread is done
		System.out.println("Main thread - checking if SleepyThread is awake");
		if (newThread.isAlive()) {
			System.out.println("Main thread - sleepyThread sleeping. Going to interrupt it!");
			// still alive - interrupt
			newThread.interrupt();
			
			// Don't use anymore:
			// newThread.destroy();
			// newThread.stop();
		}
		System.out.println("Main finished!");		
	}

}
