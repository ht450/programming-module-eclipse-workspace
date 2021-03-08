/**
 * 
 */
package methods;

import java.util.Scanner;

/**
 * class with methods for printing out the users name 10 times
 * @author Hugh
 *
 */
public class NamePrintingMethod {

	/**
	 * main method for getting the users name and invoking the printing method
	 * @param args
	 */
	public static void main(String[] args) {
		String userName;
		Scanner scanner = new Scanner(System.in);
		
		//invoke method to print my name
		printHugh();
		
		//prompt user for name
		System.out.println("Please enter your name:");
		userName = scanner.nextLine();
		
		print10Times(userName);
		
		scanner.close();
	}//end of main method
	
	/**
	 * method that prints 'Hugh' to the console
	 */
	public static void printHugh() {
		System.out.println("Hugh");
	}
	
	
	/**
	 * method for printing an input string 10 times
	 * @param inputString
	 */
	public static void print10Times(String inputString) {
		
		for (int counter=0; counter<=10; counter++) {
			System.out.println(counter+". "+inputString);
		}// end of FOR
		
	}//end of namePrinter

}
