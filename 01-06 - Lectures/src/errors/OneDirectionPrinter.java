/**
 * 
 */
package errors;

import java.util.Random;

/**
 * @author Hugh
 *
 */
public class OneDirectionPrinter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean done=false;
		Random random = new Random();
		do {
			try {
				int rand=0;
				//String[] oneDirection = {"Niall","Harry","Zayn","Liam","Louis"};
				//zayn has left
				String[] oneDirection = {"Niall","Harry","Liam","Louis"};
				
				rand = random.nextInt(5);
				System.out.println(oneDirection[rand]);
				done=true;
			} catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
				System.out.println("Trying again...");
				done=false;
			}
		} while (!done);
		
	}

}
