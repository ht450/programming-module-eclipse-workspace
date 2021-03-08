/**
 * 
 */
package three;

import java.util.Scanner;

/**
 * @author Hugh
 *
 */
public class Three_Part3_2 {

	/**
	 * an IF ELSE statement to check a user input value in a voting system
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String userVote, partyName;
		Scanner scanner = new Scanner(System.in);

		// present user with two options 'con' or 'lab'
		System.out.println("Voting Machine...");
		System.out.println("Please enter your vote ('con' for Conservative or 'lab' for Labour):");
		userVote = scanner.next();

		System.out.println("1 " + userVote);

		/*
		 * // if entry is 'con' output 'Voting registered as Conservative' (ignore case)
		 * if (userVote.equalsIgnoreCase("con")) { userVote = "Conservative";
		 * System.out.println("Voting registered as Conservative"); } else if
		 * (userVote.equalsIgnoreCase("lab")) { // if entry is 'lab' output 'Voting
		 * registered as Labour' (ignore case) userVote = "Labour";
		 * System.out.println("Voting registered as Labour"); } else { // add validation
		 * option System.out.println("Sorry, entry invalid."); }
		 */

		// use the conditional operator to convert con or lab to conservative or labour
		if (userVote.equalsIgnoreCase("con") || userVote.equalsIgnoreCase("lab")) {
			partyName = userVote.equalsIgnoreCase("con") ? "Conservative" : "Labour";
			System.out.println("2 " + partyName);
		} else { // add validation option 
			System.out.println("Sorry, voting party unrecognised.");
		}

		scanner.close();
	}

}
