/**
 * 
 */
package four;

import java.util.Scanner;

/**
 * Class uses FOR loops to count stuff
 * 
 * @author Hugh
 *
 */
public class Four_Part3_ForLoopCounting {

	/**
	 * main method using FOR loops to count
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// No.7
		//count down clock - launch aborted at 333
		for (int counter=1000 ; counter>0 ; counter--) {						
			if (counter==333) {
				System.out.println("Launch Aborted!");
				break;
			}//end of IF
			System.out.println(counter);//place before IF statement to print 333 before breaking
		}//end of for loop

		// No.8	
		// prints out star and number pattern
		String stars="";
		
		for (int outer = 1; outer <= 3; outer++) {
		stars = stars.concat("*");
			for (int inner = 1; inner <= 10; inner++) {
				System.out.printf(stars+inner+",");
			} // end inner
			System.out.println();
		}//end outer

		
		// No.9
		//prints out leap years
		for (int year=1910; year<=1990; year++) {
			if (year%4 == 0) {
				System.out.println(year);
			}//end of IF
		}//end of FOR
		System.out.println("Done");
		
		//No.10
		int age;
		Scanner scanner = new Scanner(System.in);
		//prompt user for age (include sensible validation)		
		//print message depending on age input
		do {
			System.out.println("Enter your age: ");
			age = scanner.nextInt();
			
			if (age>0 && age <=30) {
				System.out.println("You are young!");
				break;
			} else if (age>30 && age<=60) {
				System.out.println("You are getting on!");
				break;
			} else if (age>60 && age<=130) {
				System.out.println("You look amazing for your age!");
				break;
			} else {
				System.out.println("Age not valid!");
			}
			
		} while (age<=0 || age>130);
		
		scanner.close();
		
	}// main method

}// class
