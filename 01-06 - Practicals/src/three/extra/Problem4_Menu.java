/**
 * 
 */
package three.extra;

import java.util.Scanner;

/** show the user a menu and prompt them to pick an option
 * @author Hugh
 *
 */
public class Problem4_Menu {

	/** main method 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//vars
		int userInput ;
		String menuItem ;
		
		// show menu
		System.out.println("1. File");
		System.out.println("2. Add");
		System.out.println("3. Edit");
		System.out.println("4. Delete");
		System.out.println("5. Exit");
		System.out.println("Enter Option Number... ");
		
		//get user input
		Scanner scanner = new Scanner(System.in);
		userInput = scanner.nextInt();
		
		//process input
		switch (userInput) {
			case 1:
				menuItem = "File";
				break;
			case 2:
				menuItem = "Add";
				break;
			case 3:
				menuItem = "Edit";
				break;
			case 4:
				menuItem = "Delete";
				break;
			case 5:
				menuItem = "Exit";
				break;
			default:
				menuItem = "Invalid";
		}//end of switch
		
		// print result
		System.out.println("You selected "+menuItem);
		
		//tidy up resources
		scanner.close();
	}//main method

}
