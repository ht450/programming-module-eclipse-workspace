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
public class TryCatchSpecificException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			// scanner only lives inside the try block
			Scanner scanner = new Scanner(System.in);
			
			int age = 0;
			
			//get input from user
			System.out.print("Please enter your age : ");
			age = scanner.nextInt();
			System.out.printf("%d That is quite old !", age);
		
			// if there is an exception scanner will never close
			scanner.close();
			
		} catch (InputMismatchException inputMismatchException) {
			//more defined!
			System.out.println("Please enter digits - run program again!");
		} catch (Exception exception) {
			System.out.println("Nooooo !");
		}
		
		
	}// end of main

}// end of class
