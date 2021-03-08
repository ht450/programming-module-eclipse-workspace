package name.thread;

public class ThreadOutputsName  implements Runnable {

	public int number;
	
	@Override
	public void run() {
		
		System.out.println("Thread started "+Thread.currentThread().getName());
		
	}

}
