/**
 * 
 */
package importing.stuff;

/**
 * @author Hugh
 *
 */

import java.util.Scanner;

public class ImportingExercise1 {

	/**
	 * class asks a user for their age and outputs whether or not they can vote
	 * @param args
	 */
	public static void main(String[] args) {
		//import scanner
		Scanner scanner = new Scanner(System.in);
		//declare age var
		int userAge ;
		
		//ask user for their age
		System.out.println("Hi, what age are you?");
		//read age
		userAge = scanner.nextInt();
		
		//if 18 or over, they can vote
		if (userAge >= 18) {
			System.out.println("Congratulations, you can vote!");
		}
		//if under 18, they cannot vote
		if (userAge < 18) {
			System.out.println("Unfortunatley you cannot vote.");
		}
		
		scanner.close();

	}

}
