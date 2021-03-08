/**
 * 
 */
package errors;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Hugh
 *
 */
public class TryCatchFinally {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {

			int age = 0;

			// get input from user
			System.out.print("Please enter your age : ");
			age = scanner.nextInt();
			System.out.printf("%d That is quite old !", age);

		} catch (InputMismatchException inputMismatchException) {
			// more defined!
			System.out.println("Please enter digits - run program again!");
		} catch (Exception exception) {
			System.out.println("Nooooo !");

		// clean up resources - exception or not
		} finally {
			scanner.close();
		}

	}// end of main

}// end of class
