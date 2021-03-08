/**
 * 
 */
package exceptional;

import java.awt.PageAttributes.OriginType;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Hugh
 *
 */
public class OwnExceptionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			readFromFile();
		} catch (UserException userException) {
			System.out.println(userException.getMessage());
			System.out.println("Origin of problem : "+userException.getOriginOfProblem());
		}
		
		
	}
	

	public static void readFromFile() throws UserException {
		try (Scanner sc = new Scanner(System.in);) { // try with resources declaration
			int userNumber, answer;
			System.out.println("Enter a number...");
			userNumber = sc.nextInt();
			answer = 66 / userNumber;
			System.out.println("Answer is : " + answer);			
		} catch (InputMismatchException | ArithmeticException ex) {
			// create our own exception and throw
			UserException userException = new UserException("problem with user input "+ex.getMessage());
			userException.setOriginOfProblem("HARDWARE");
			throw userException;
		}
	}
	
	

}
