package down.down;

public class CountdownThread implements Runnable {

	public CountdownThread() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {

		for (int loop = 10; loop > 0; loop--) {
			System.out.println(loop);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
}
