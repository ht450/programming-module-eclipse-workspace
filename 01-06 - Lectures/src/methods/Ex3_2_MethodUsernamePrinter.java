/**
 * 
 */
package methods;

import java.util.Scanner;

/**
 * @author Hugh
 *
 */
public class Ex3_2_MethodUsernamePrinter {

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		String userName = getUserName();
		
		if (userName.isEmpty()) {
			System.out.println("What, no name?");
		} else {
			System.out.println("Hello "+userName);
		}
		
	}//end of main

	/**
	 * method asks the user for their name and returns it
	 * @return
	 */
	public static String getUserName() {
		String userName = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your full name : ");
		userName = scanner.nextLine();
		scanner.close();
		return userName;
	}//end of userName
	
}//end of class
