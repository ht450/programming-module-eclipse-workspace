/**
 * 
 */
package loops;

/**
 * @author Hugh
 *
 */
public class FirstWhileLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int counter; // meaningful name, don't call it 'i' like the books
		counter = 1;
		
		while (counter <= 20) {
			// loop body
			
			// only print loop counter if it is even
			if (counter%2==0) {
			System.out.println("Iteration: "+counter);
			}
			
			counter++;
		}//end of while loop
		
	}

}
