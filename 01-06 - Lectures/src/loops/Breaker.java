/**
 * 
 */
package loops;

/**
 * @author Hugh
 *
 */
public class Breaker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int loop = 10;
		
		while (loop > 0 ) {
			
			if (loop==3) {
				System.out.println("Abort!");
				break;
			}
			
			System.out.println(loop);
			loop-- ;
			
		}//end of while
	
		System.out.println("Done");
		
	}//main method

}
