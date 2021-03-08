/**
 * 
 */
package loops;

/**
 * @author Hugh
 *
 */
public class DoWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int loop;
		loop = 100;
		
		do {
			//loop body
			System.out.println(loop);
			loop--;
			
		} while (loop >= 50); //end of do-while
		
		System.out.println("end");
	
	}

}
