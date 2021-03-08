/**
 * 
 */
package five;

import java.util.Calendar;
import java.util.Random;

/**
 * class with solutions to Practical 5: Methods (Part 1)
 * 
 * @author Hugh
 *
 */
public class Five_Part1_MethodInvocation {

	/**
	 * main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
//		evenOrOdd(2);
//		uppercaseToLowercase('l');
//		isMulitple(2, 20);
//		tenRandomNumbers();
//		countdownWithAsterisks(23);
//		printNumberInWordSwitch(5);
//		rollingSum(4);
//		goodMorning();
		
	}// end of main

	/**
	 * #1 Takes a number and prints whether it is even or odd
	 * 
	 * @param number
	 */
	public static void evenOrOdd(int number) {
		if (number % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}// end of evenOrOdd

	/**
	 * #2 method that takes a character and if uppercase converts to lowercase
	 * 
	 * @param letter
	 */
	public static void uppercaseToLowercase(char letter) {
		if (Character.isUpperCase(letter)) {
			letter = Character.toLowerCase(letter);
		} // end of IF
		System.out.printf("%s", letter);
	}// end of lowercaseToUppercase

	/**
	 * #3 method that takes two ints and determines if the second is a multiple of
	 * the first
	 * 
	 * @param num1
	 * @param num2
	 */
	public static void isMulitple(int num1, int num2) {
		if (num2 % num1 == 0) {
			System.out.printf("%d is a multiple of %d\n", num2, num1);
		} else {
			System.out.printf("%d is not a multiple of %d\n", num2, num1);
		} // end of IF
	}// end of isMulitple

	/**
	 * #4 method that when invoked generates 10 random numbers between 1-100
	 */
	public static void tenRandomNumbers() {
		Random rand = new Random();
		System.out.println("Generating 10 random integers in the range 1-100");
		for (int loop = 1; loop <= 10; loop++) {
			System.out.println("Generated : " + (rand.nextInt(100) + 1));
		} // end of for
		System.out.println("Done");
	}// end of tenRandomNumbers

	/**
	 * #5 method that takes a number between 5-50 (inclusive) and countsdown,
	 * printing the number and the same number of *'s
	 * 
	 * @param upperLimit
	 */
	public static void countdownWithAsterisks(int upperLimit) {
		if (upperLimit < 5 || upperLimit > 50) {
			System.out.println("Outside the range");
		} else {
			for (int outerLoop = upperLimit; outerLoop >= 0; outerLoop--) {
				System.out.printf("%d\t", outerLoop);
				for (int innerLoop = outerLoop; innerLoop > 0; innerLoop--) {
					System.out.printf("*");
				} // end of inner FOR loop
				System.out.println();
			} // end of outer FOR loop
		} // end of ELSE
	}// end of countdownWithAsterisks

	/** 
	 * #6a
	 * 
	 * @param number
	 */
	public static void printNumberInWordNestedIfElse(int number) {
		if (number == 1) {
			System.out.println("ONE");
		} else if (number == 2) {
			System.out.println();
		}
	}// end of printNumberInWordNestedIfElse

	/**
	 * #6b
	 * 
	 * @param number
	 */
	public static void printNumberInWordSwitch(int number) {
		switch (number) {
			case 1:
				System.out.println("ONE");
				break;
			case 2:
				System.out.println("TWO");
				break;
			case 3:
				System.out.println("THREE");
				break;
			case 4:
				System.out.println("FOUR");
				break;
			case 5:
				System.out.println("FIVE");
				break;
			case 6:
				System.out.println("SIX");
				break;
			case 7:
				System.out.println("SEVEN");
				break;
			case 8:
				System.out.println("EIGHT");
				break;
			case 9:
				System.out.println("NINE");
				break;
			default:
				System.out.println("OTHER");
				break;
		}// end of switch
	}// end of printNumberInWordSwitch

	/**
	 * #7
	 * method that takes an int and sums all the numbers up to that number and also averages them
	 * @param upperBound
	 */
	public static void rollingSum(int upperBound) {
		int sum=0;
		double average;
		for (int loop=1; loop<=upperBound; loop++) {
			sum += loop;
			//System.out.println("+ "+loop+" = "+sum);
		}//end of for
		System.out.println("The sum is "+sum);
		average = (double) sum / (double) upperBound ;
		System.out.println("The average is "+average);
	}// end of rollingSum
	
	public static void goodMorning() {
		int time;
		Calendar cal = Calendar.getInstance();
		time = cal.get(Calendar.AM_PM);
		if (time==0) {
			System.out.println("Good Morning");
		} else if (time==1) {
			System.out.println("I hope the morning went well for you. Enjoy the rest of your day.");
		}// end of IFELSE
	}//end of goodMorning
	
	
	
}// end of class
