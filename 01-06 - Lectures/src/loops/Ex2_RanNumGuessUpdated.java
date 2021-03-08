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
public class Ex2_RanNumGuessUpdated {

	/**
	 * Start point for the game
	 * @param args
	 */
	public static void main(String[] args) {
		
		int randomNumber, userGuess, guessCount;
		guessCount=0;
		
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

			// tell user they got it wrong
			System.out.println("Incorrect,");
			
			//update guess count and check if they have hit the limit
			guessCount++;
			System.out.println("Guess No. "+guessCount);
			//System.out.println("Guess Count: "+guessCount);
			if (guessCount==10) {
				System.out.println("Sorry you have run out of chances!");
				break;
			}//end of IF
			
			// tell the user to guess higher or lower
			if (userGuess < randomNumber) {
				System.out.println("Guess higher: ");
				userGuess = scanner.nextInt();	
			} else if (userGuess > randomNumber) {
				System.out.println("Guess lower: ");
				userGuess = scanner.nextInt();
			}//end of IF
			
		}//end of while
		
		if (userGuess == randomNumber) {
			System.out.println("Well Done!");
		}
		
		//System.out.println("End");
		
		
		scanner.close();
	}

}
