/**
 * 
 */
package importing.stuff;

/**
 * @author Hugh
 *
 */
//import the scanner class
import java.util.Scanner;

public class UsersName {

	/**
	 *  Class is going to get users to input their names
	 * @param args
	 */
	public static void main(String[] args) {
		// declare the scanner object 
		Scanner scanner = new Scanner(System.in);
		// declare a string to store the name
		String name;
		
		// print message to user asking for input
		System.out.println("Please input your name:");
		// use scanner to find input
		name = scanner.nextLine();
		// welcome user by name
		System.out.println("Welcome " +name+"!");
		
		
		scanner.close();
		
	}

}
