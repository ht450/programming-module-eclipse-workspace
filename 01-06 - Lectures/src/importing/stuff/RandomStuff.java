package importing.stuff;

import java.util.Random;
import java.util.Scanner;
// import java.util.*; will import the whole package (* called the wild card) but isn't necessary and is overhead and a bit lazy if not needed.

/**
 * @author Hugh
 *
 */
public class RandomStuff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int ranGenNum, userGuess ;
		
		// get a number between 1 - 10
		Random random = new Random();
		ranGenNum = random.nextInt(10) + 1; // can also add a new line: ranGenNum++;
		
		
		// ask the user for a guess
		System.out.println("Guess a number between 1 and 10.");
		Scanner scanner = new Scanner(System.in);
		userGuess = scanner.nextInt();
		
		// tell the user if they got it right
		if (userGuess == ranGenNum) {
			System.out.println("Yeooooo Good Guess!");
		}
		
		if (userGuess != ranGenNum) {
			System.out.println("Unlucky kid ");
			// tell user what the random was
			System.out.println("Random number was " +ranGenNum);
		}
		
		
		scanner.close();
	}

}
