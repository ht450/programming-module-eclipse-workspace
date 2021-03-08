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
public class MoreThanOneException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		readFromUser();
	}

	public static void readFromUser() {
		Scanner sc = new Scanner(System.in);
		try {
			int userNumber, answer;
			System.out.println("Enter a number...");
			userNumber = sc.nextInt();
			answer = 66 / userNumber;
			System.out.println("Answer is : " + answer);
		} catch (InputMismatchException | ArithmeticException ex) {
			// log the exception
			System.out.println("Problem with input : " + ex.toString());

			// need to tell the difference
			if (ex.getClass().equals(InputMismatchException.class)) {
				System.out.println("Butter fingers");
			}
		} finally {
			sc.close();
		}

	}

}
