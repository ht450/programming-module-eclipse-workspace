package recuring;

public class CountingDown {
	
	public static void main(String[] args) {
		countDown(3);
	}		

	public static void countDown(int num) {
		// base case
		if (num<=0) {
			System.out.println("END");
		} else {
			// swap these two lines around and see what happens (follow the call stack in the debugger)
			System.out.println(num);
			countDown(--num);
		}
	}

}
