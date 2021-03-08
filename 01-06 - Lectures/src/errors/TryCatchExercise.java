/**
 * 
 */
package errors;

import java.util.Scanner;

/**
 * @author Hugh
 *
 */
public class TryCatchExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age = 0;

		try {
			System.out.println("Enter your age: ");
			age = scanner.nextInt();
			System.out.printf("%d?! That is quite old !", age);
		} catch (Exception exception) {
			System.out.println("Oh dear...");
		}
		scanner.close();

	}

}
