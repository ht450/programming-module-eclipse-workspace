/**
 * 
 */
package loops;

import java.util.Scanner;

/**
 * @author Hugh
 *
 */
public class Ex7_ExerciseCounter {

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		int totalReps=0, totalSets=0;
		Scanner scanner = new Scanner(System.in);
		String userDecision;
		
		//user is asked to complete 10 sets of 5 reps of a particular exercise
		//before each exercise the user may decide to opt to so the set or not
		//if they do then 5 is added to the total rep count
		//if they dont the set is skipped and the total remains unchanged
		for (int set=1; set<=10; set++) {
			System.out.println("Set "+set);
			do {
				System.out.println("Would you like to complete this set? (YES or NO or QUIT)");
				userDecision = scanner.nextLine();
				if (userDecision.equalsIgnoreCase("yes")) {
					System.out.println("Well Done!\n");
					totalReps+=5;
					totalSets++;
					break;
				} else if (userDecision.equalsIgnoreCase("no")) {
					System.out.println("Next Time!\n");
					break;
				} else if (userDecision.equalsIgnoreCase("quit")) {
					System.out.println("Quitter!");
					break;
				} else {
					System.out.println("Please enter YES or NO!");
					continue;
				}				
			} while (!userDecision.equalsIgnoreCase("yes") || !userDecision.equalsIgnoreCase("no"));
			if (userDecision.equalsIgnoreCase("quit")) {
				break;
			}
		}//end of for
		
		
		//when the session is over the amount of reps completed is output as an exercise summary
		System.out.println("\nYour Exercise Summary: ");
		System.out.println("Total Sets: "+totalSets);
		System.out.println("Total Reps: "+totalReps);
		
		scanner.close();
	}//end of main

}//end of class
