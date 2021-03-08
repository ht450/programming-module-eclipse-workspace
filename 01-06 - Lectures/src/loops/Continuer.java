/**
 * 
 */
package loops;

/**
 * @author Hugh
 *
 */
public class Continuer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int exerciseCounter = 0;
		
		while (exerciseCounter < 10) {
			exerciseCounter++;
	
			if (exerciseCounter == 3 || exerciseCounter == 4) {
				System.out.println("Skip a few... ");
				continue;
			}
			
			
			System.out.println("Yes... "+exerciseCounter);
		}//end of while
	
	
	}//main method

}
