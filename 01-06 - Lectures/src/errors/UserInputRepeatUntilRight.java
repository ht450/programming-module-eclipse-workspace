/**
 * 
 */
package errors;

import java.util.Scanner;

/**
 * @author Hugh
 *
 */
public class UserInputRepeatUntilRight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int num = 0;
		// flag
		boolean inputOK = false;
		Scanner s = new Scanner(System.in);
		
		do {
			try {
				System.out.println("Enter a number : ");
				//potential problem here
				num = s.nextInt();
				
				System.out.println("You entered : "+num);
				//got here then things are good!
				inputOK = true;
				
			// catch input exception
			} catch (Exception e) {
				System.out.println("Please enter integers only!");
				//flush the scanner
				s.next();
			}
		} while (inputOK != true);
		s.close();
		System.out.println("Thank you!");
	}// end of main

}// end of class
