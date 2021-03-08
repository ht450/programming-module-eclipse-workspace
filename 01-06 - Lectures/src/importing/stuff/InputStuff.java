/**
 * 
 */
package importing.stuff;

import java.util.Scanner; ;

/**
 * @author Hugh
 *
 */


public class InputStuff {
		
	public static void main (String args[]) {
		
		String userName;
		
		// set up scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		// get user input
		userName = scanner.nextLine();
		
		// display the user input with message... IF?
		System.out.println("Hello "+userName);
		
		// if name is Boris then output you should be sacked
		// VERY IMPORTANT - string comparison
		if (userName.equalsIgnoreCase("Boris")) {
			System.out.println("Boris? You should be SACKED!");
		}
		
		
		
		scanner.close();
	}

}
