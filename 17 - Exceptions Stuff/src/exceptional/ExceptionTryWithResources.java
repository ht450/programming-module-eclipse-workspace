/**
 * 
 */
package exceptional;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Hugh
 *
 */
public class ExceptionTryWithResources {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		readFromFile();
		
	}
	
	public static void readFromFile() throws InputMismatchException, ArithmeticException {
		try (Scanner sc = new Scanner(System.in);) { // try with resources declaration
			int userNumber, answer;
			System.out.println("Enter a number...");
			userNumber = sc.nextInt();
			answer = 66 / userNumber;
			System.out.println("Answer is : " + answer);			
		} catch (InputMismatchException | ArithmeticException exception) {
			System.out.println("problem with the input!");
		}
	}
}
