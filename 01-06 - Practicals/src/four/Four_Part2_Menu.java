/**
 * 
 */
package four;

import java.util.Scanner;

/** class prompts the user to pick a menu item and repeats until EXIT is chosen
 * @author Hugh
 *
 */
public class Four_Part2_Menu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//vars
		int userInput ;
		String menuItem ;
		Scanner scanner = new Scanner(System.in);

		
		do {
			// show menu
			System.out.println("Menu___________________________");
			System.out.println("1. File");
			System.out.println("2. Edit");
			System.out.println("3. Save");
			System.out.println("4. Delete");
			System.out.println("5. Exit");
			System.out.println("Enter Option Number... ");
			
			//get user input
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
			System.out.println(menuItem+" selected \n");
			
		} while (userInput != 5); // end of do-while loop
		System.out.println("Program quitting");
	
		scanner.close();
	}//end of main

}
