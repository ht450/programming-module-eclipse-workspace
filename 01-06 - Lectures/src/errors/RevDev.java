/**
 * 
 */
package errors;

import java.util.Scanner;

/**
 * class
 * @author Hugh
 */
public class RevDev {

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int age = 9;
		
		// business rule...
		// over 50? print old, otherwise young
		// if <0 or >120, print invalid

		// input age
		System.out.println("Please enter your age");
		// try catch exceptions for invalid inputs to scanner
		try {
			age = scanner.nextInt();
			
			//implement business rule
			if (age<=0 || age>120) {
				System.out.println("Invalid!");
			} else if (age>50) {
				System.out.println("That's old");
			} else {
				System.out.println("That's young");
			}// end of IF
			
		} catch (Exception exception) {
			System.out.println("Invalid Input!\n"+exception.fillInStackTrace());
			System.out.println("Please enter your age as a valid number only");
			// try input again?
		}// end of try catch
		
		
	
		
		scanner.close();
	}//end of main
	
}// end of class

