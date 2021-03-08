/**
 * 
 */
package recuring;

import java.util.Scanner;

/**
 * @author Hugh
 *
 */
public class RecursionExercise {

	private static int number = 0;
	private static Scanner scan = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		enterNumber();

		countTo100(number);

	}

	public static void enterNumber() {

		System.out.println("Enter a number between 1 and 10");
		number = scan.nextInt();

		if (number < 1 || number > 10) {
			enterNumber();
		} else {
			System.out.println("you entered... " + number);
		}
	}

	public static void countTo100(int num) {

		if (num > 100) {
			return;
		} else {
			System.out.println(num);
			countTo100(num + 1);
		}

	}

}
