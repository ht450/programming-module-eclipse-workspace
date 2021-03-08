/**
 * 
 */
package loops;

import java.util.Scanner;

/**
 * class that take a number and calculates its factorial
 * @author Hugh
 *
 */
public class Ex5_Factorial {

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		int userInput, numberFactorial=1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a number: ");
		userInput = scanner.nextInt();
		
		for (int count=userInput; count>0; count--) {
			System.out.printf("answer: %d, counter: %d\n",numberFactorial,count);
			numberFactorial = numberFactorial*count;
		}//end of for
		
		System.out.printf("\n%d! = %d", userInput, numberFactorial);
		scanner.close();
	}//end of main

}//end of class
