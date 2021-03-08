package down.down;

public class ControllerOfThreads {

	public ControllerOfThreads() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		System.out.println("Start of main");
		
		CountdownThread countdownThread = new CountdownThread();
		
		Thread t = new Thread(countdownThread);
		
		t.start();
		
		System.out.println("End of main");
	}

}
