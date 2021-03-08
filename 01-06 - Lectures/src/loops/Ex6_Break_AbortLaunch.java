/**
 * 
 */
package loops;

import java.util.Scanner;

/**
 * class that countsdown to a launch but aborts at the users chosen number
 * @author Hugh
 *
 */
public class Ex6_Break_AbortLaunch {

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		//takes user input for launch abort number
		int userInput;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a number between 1 and 10");
		userInput = scanner.nextInt();
		//start countdown
		int loop=10;
		while (loop>0) {
			//abort  launch on user input
			if (loop==userInput) {
				System.out.println("Launch Aborted!");
				break;
			}//end of IF
			System.out.println(loop);
			loop--;
		}//end of while
		scanner.close();
	}//end of main

}//end of class
