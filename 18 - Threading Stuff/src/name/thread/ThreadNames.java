package name.thread;

public class ThreadNames {

	public ThreadNames() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		
		for (int loop = 1; loop<100; loop++) {
			
			ThreadOutputsName ton = new ThreadOutputsName();			
			ton.number = loop;
			Thread t = new Thread(ton);
			
			t.start();
			
		}
		
	}

}
