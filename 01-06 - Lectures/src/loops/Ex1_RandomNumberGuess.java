/**
 * 
 */
package loops;

import java.util.Random;
import java.util.Scanner;

/**
 * Generate random number and ask the user to guess the number
 * @author Hugh
 *
 */
public class Ex1_RandomNumberGuess {

	/**
	 * Start point for the game
	 * @param args
	 */
	public static void main(String[] args) {
		
		int randomNumber, userGuess;
		
		// get random number
		Random random = new Random();
		randomNumber = random.nextInt(10);
		randomNumber++;
		
		// get the users guess
		System.out.println("Guess a number between 1 and 10: ");
		Scanner scanner = new Scanner(System.in);
		userGuess = scanner.nextInt();
		
		// compare the numbers... if wrong go again... otherwise quit
		while (userGuess != randomNumber) {
			System.out.println("Incorrect,");
			
			// guess again
			System.out.println("Try again: ");
			userGuess = scanner.nextInt();

			
		}//end of while
		
		System.out.println("Well Done!");
		
		
		scanner.close();
	}

}
