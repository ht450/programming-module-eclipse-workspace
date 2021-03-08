/**
 * 
 */
package methods;

/**
 * @author Hugh
 *
 */
public class Ex2_2_CountdownClock {

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		countdown(12);
	}//end of main

	/**
	 * method that countdown to 0 from the user input
	 * @param starter
	 */
	public static void countdown(int starter) {
		for (int counter = starter; counter>=0; counter--) {
			System.out.println(counter);
		}//end of for		
	}//end of countdown
	
}//end of class
