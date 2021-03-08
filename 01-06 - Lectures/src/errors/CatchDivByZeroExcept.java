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
public class CatchDivByZeroExcept {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = null ;
		
		try {
			scanner = new Scanner(System.in);
			
			int num1, num2, answer;
			num1 = 9;
			
			// ask user for second number
			System.out.println("Enter a second number: ");
			System.out.print("Answer = 9 / ");
			num2 = scanner.nextInt();
			// beware of input exception
			
			// calculate answer
			answer = num1/num2;
			// beware of arithmetic exception
			
			System.out.println("Answer = "+answer);
			
		// about to catch specific exceptions
		// arithmetic - divide by zero
		} catch (ArithmeticException arithmeticException) {
			System.out.println("The second number is zero!");
			System.out.println(arithmeticException.toString());
		// wrong input
		} catch (InputMismatchException inputMismatchException) {
			System.out.println("Invalid input there bud!");
			
		// about to catch general exception (always leave to the end)
		} catch (Exception e) {
			System.out.println("Sorry there has been a problem");
		}
		
		
		
	}// end of main

}// end of class
