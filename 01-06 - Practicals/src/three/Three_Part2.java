/**
 * 
 */
package three;

import java.util.Scanner;

/**
 * @author Hugh
 *
 */
public class Three_Part2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// prompt the user for a mark
		// assign to a suitable var
		System.out.println("Input your mark: ");
		Scanner scanner = new Scanner(System.in);
		int mark = scanner.nextInt();
		
		// use IF ELSE statements to ouput classification (don't forget to identify invalids)
		if (mark < 0 || mark >100) {
			System.out.println("Input invalid!");
		} else if (mark < 50) {
			System.out.println("Fail");
		} else if (mark < 60) {
			System.out.println("Pass");
		} else if (mark < 70) {
			System.out.println("Merit");
		} else {
			System.out.println("Distinction");
		}
		
		
		scanner.close();
	}

}
