/**
 * 
 */
package three;

/** Practical 3 - Operators and Selection Statements
 * @author Hugh
 *
 */

import java.util.Scanner;

public class Three_Part1 {

	/**	Solutions to Part 1 of Practical 3
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double userNumber;
		
		// 1.	Prompt the user for a decimal point number
		System.out.println("Please enter a decimal point number in the format xx.xxxx e.g. 12.3456");
		
		// 2.	Assign the number to a suitable variable.
		userNumber = scanner.nextDouble();
		
		// 3. 	The output of program should match the following

		System.out.printf("Number rounded (two decimal places)\t: %.2f\n", userNumber);
		
		System.out.printf("Number squared (three decimal places)\t: %.3f\n", Math.pow(userNumber, 2));
		
		System.out.printf("Number cubed to (three decimal places)\t: %.3f\n", Math.pow(userNumber, 3));

		System.out.printf("Square root (four decimal places)\t: %.4f\n", Math.sqrt(userNumber));
		
		
		scanner.close();
	}

}
