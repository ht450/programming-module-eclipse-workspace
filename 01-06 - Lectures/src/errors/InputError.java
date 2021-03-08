/**
 * 
 */
package errors;

import java.util.Scanner;

/**
 * @author Hugh
 *
 */
public class InputError {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an int ...");
		num = s.nextInt();
		System.out.println("you entered: "+num);
		s.close();
	}

}
