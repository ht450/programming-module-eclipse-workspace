/**
 * 
 */
package challenges.week7;

import java.util.Random;
import java.util.Scanner;

/**
 * class that contains the solutions to the week 7 reading week daily coding challenge 
 * for Wednesday 30th
 * @author Hugh
 *
 */
public class Wed_PubQuiz {

	/**
	 * Method implementing a pub quiz
	 * @param args
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int randNum;
		String userGuess;
		String outcome;
		String goAgain;
		boolean goAgainValid=false;
		boolean quit=false;
		
		try {
			// declaring the questions and answers
			String[] jokeQuestions = { "Largest planet ? ", "Worse song ever ? ", "Capital of Peru?", "Roman god of War ?" };
			String[] jokeAnswers = { "Jupiter", "Baby", "Lima", "Mars" };
	
			System.out.println("General knowledge quiz...");
		
			do {
				// generate random number (between 0-3)
				randNum = rand.nextInt(4);
				
				// user given random question
				System.out.println("\nQ: "+jokeQuestions[randNum]);
				// user responds
				System.out.printf("A: ");
				userGuess = scan.next();
				// user answer checked against correct answer
				if (userGuess.equalsIgnoreCase(jokeAnswers[randNum])) {
					// correct
					outcome = "Well done, your answer was correct!";
				} else {
					// wrong
					outcome = "Sorry, your answer was incorrect";
				}
				// user is notified of outcome
				System.out.println("\n"+outcome);
				// user is prompted to continue or quit (loop until they give a valid response
				do {
					System.out.println("Would you like another question? (Y or N)");
					goAgain = scan.next();
					if (goAgain.equalsIgnoreCase("y")) {
						// repeat
						goAgainValid=true;
					} else if (goAgain.equalsIgnoreCase("n")) {
						// quit
						goAgainValid=true;
						quit=true;
					} else {
						// choose again
						System.out.println("That was an invlaid response, please respond with Y or N");
					}
				} while (!goAgainValid);
			} while (!quit);
		} catch (Exception exception) {
			System.out.println("The quiz master has had a problem...");
		} finally {
			System.out.println("Thanks for playing!");
			scan.close();
		}
	}//main method

}//class
