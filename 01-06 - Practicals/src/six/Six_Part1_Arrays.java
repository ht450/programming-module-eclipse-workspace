/**
 * 
 */
package six;

import java.util.Scanner;

/**
 * @author Hugh
 *
 */
public class Six_Part1_Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Q1
		double rateOfPay = 10.25;
		int[] workHours = { 8, 7, 9, 7, 4 };
		System.out.println("Day \t\tHours");
		for (int loop = 0; loop < workHours.length; loop++) {
			System.out.println(dayOfTheWeek(loop + 1) + "\t" + workHours[loop]);
		}
		System.out.println("Total hours  : " + sumArray(workHours) + "hrs");
		System.out.println("Weekly pay   : £" + (sumArray(workHours) * rateOfPay) + "\n");

		// Q2
		double[] temperatures = { 3.4, 4.2, 9.0, 2.2, 4.5, 6.4, 3.1 };
		System.out.println("Average Temp: " + averageDoubleArray(temperatures) + "\n");

		// Q3
		double[] heights = { 1.4, 1.9, 1.31, 1.2 };
		System.out.println("Average Height: " + averageDoubleArray(heights));
		System.out.println("Smallest : " + smallestValue(heights));
		System.out.println("Tallest  : " + largestValue(heights) + "\n");

		// Q4
		int[] workHours6day = new int[6];
		for (int loop = 0; loop < workHours.length; loop++) {
			workHours6day[loop] = workHours[loop];
		}
		workHours6day[5] = 8;
		double newRateOfPay = 11.50;
		System.out.println("New Total hours  : " + sumArray(workHours6day) + "hrs");
		System.out.println("New Weekly pay   : £" + (sumArray(workHours6day) * newRateOfPay) + "\n");

		System.out.println("Max temp : " + smallestValue(temperatures));
		System.out.println("Min temp : " + largestValue(temperatures) + "\n");

		// Q5
		Scanner scanner = new Scanner(System.in);
		String usersName;
		System.out.println("Please enter your name: ");
		usersName = scanner.nextLine();

		stringVowelCounter(usersName);

		System.out.println();
		scanner.close();

		// Q6
		int[] evenNumbers = new int[50];
		for (int loop = 0; loop < evenNumbers.length; loop++) {
			evenNumbers[loop] = (loop * 2) + 2;
		}
		System.out.println("Total of even numbers from 1 to 100: " + sumArray(evenNumbers));

		// Q7
		intArrayPrinter(evenNumbers);
		System.out.println();

		// Q8
		int[] ass1Marks = { 24, 42, 29, 66, 77 };
		int[] ass2Marks = { 79, 68, 31, 22, 42 };

		System.out.println("Assignment 1 Average: " + averageIntArray(ass1Marks));
		System.out.println("Assignment 2 Average: " + averageIntArray(ass2Marks));
		System.out
				.println("Average over both: " + (averageIntArray(ass1Marks) + averageIntArray(ass2Marks)) / 2 + "\n");

		// Q9
		String quote = "Continuous effort not strength nor intelligence is the key for unlocking our potential";
		String[] quoteArray = quote.split(" ");
		int totalLetters = 0;
		String smallestWord = quoteArray[0];
		String largestWord = quoteArray[0];
		for (int loop = 0; loop < quoteArray.length; loop++) {
			System.out.print(quoteArray[loop] + " ");
			totalLetters += quoteArray[loop].length();
			if(quoteArray[loop].length()<smallestWord.length()) {
				smallestWord = quoteArray[loop];
			}
			if(quoteArray[loop].length()>largestWord.length()) {
				largestWord = quoteArray[loop];
			}
		}
		System.out.println("\nNumber of words   : " + quoteArray.length);
		System.out.println("Number of letters : " + totalLetters);
		System.out.println("Smallest Word : "+smallestWord);
		System.out.println("Largest Word  : "+largestWord);
		

	}

	/**
	 * method that takes an int and returns the corresponding name of the day of the
	 * week
	 * 
	 * @param dayNumber
	 * @return
	 */
	public static String dayOfTheWeek(int dayNumber) {
		String dayName;
		switch (dayNumber) {
		case 1:
			dayName = "Monday   ";
			break;
		case 2:
			dayName = "Tuesday  ";
			break;
		case 3:
			dayName = "Wednesday";
			break;
		case 4:
			dayName = "Thursday ";
			break;
		case 5:
			dayName = "Friday   ";
			break;
		case 6:
			dayName = "Saturday ";
			break;
		case 7:
			dayName = "Sunday   ";
			break;
		default:
			dayName = "Invalid day number";
		}
		return dayName;
	}

	/**
	 * Takes an int array and returns the total of all the elements in it
	 * 
	 * @param array
	 */
	public static int sumArray(int[] array) {
		int total = 0;
		for (int loop = 0; loop < array.length; loop++) {
			total += array[loop];
		}
		return total;
	}

	/**
	 * a method that finds the average value from an array of doubles.
	 * 
	 * @param array
	 * @return
	 */
	public static double averageDoubleArray(double[] array) {
		double total = 0;
		for (int loop = 0; loop < array.length; loop++) {
			total += array[loop];
		}
		return (total / array.length);
	}

	/**
	 * method that returns the smallest value in an array of doubles
	 * 
	 * @param array
	 * @return
	 */
	public static double smallestValue(double[] array) {
		double smallest = array[0];
		for (int loop = 1; loop < array.length; loop++) {
			if (array[loop] < smallest) {
				smallest = array[loop];
			}
		}
		return smallest;
	}

	/**
	 * method that returns the largest value in an array of doubles
	 * 
	 * @param array
	 * @return
	 */
	public static double largestValue(double[] array) {
		double largest = array[0];
		for (int loop = 1; loop < array.length; loop++) {
			if (array[loop] > largest) {
				largest = array[loop];
			}
		}
		return largest;
	}

	/**
	 * method that takes a string and prints out the vowels counts
	 * 
	 * @param string
	 */
	public static void stringVowelCounter(String string) {
		char[] charArray = new char[string.length()];
		charArray = string.toCharArray();
		int aCount = 0;
		int eCount = 0;
		int iCount = 0;
		int oCount = 0;
		int uCount = 0;
		for (int loop = 0; loop < charArray.length; loop++) {
			switch (charArray[loop]) {
			case 'a':
			case 'A':
				aCount++;
				break;
			case 'e':
			case 'E':
				eCount++;
				break;
			case 'i':
			case 'I':
				iCount++;
				break;
			case 'o':
			case 'O':
				oCount++;
				break;
			case 'u':
			case 'U':
				uCount++;
				break;
			default:
				break;
			}
		}
		System.out.println("Number of A's: " + aCount);
		System.out.println("Number of E's: " + eCount);
		System.out.println("Number of I's: " + iCount);
		System.out.println("Number of O's: " + oCount);
		System.out.println("Number of U's: " + uCount);
		System.out.println("Total Vowels: " + (aCount + eCount + iCount + oCount + uCount));
	}

	/**
	 * method that takes an int array and prints out all its elements
	 * 
	 * @param array
	 */
	public static void intArrayPrinter(int[] array) {
		System.out.print("[ ");
		for (int loop = 0; loop < array.length; loop++) {
			array[loop] = (loop * 2) + 2;
			System.out.print(array[loop]);
			if (loop < array.length - 1) {
				System.out.print(", ");
			} else {
				System.out.println(" ]");
			}
		}
	}

	/**
	 * a method that finds the average value from an array of ints and returns it as
	 * a double.
	 * 
	 * @param array
	 * @return
	 */
	public static double averageIntArray(int[] array) {
		double total = 0;
		for (int loop = 0; loop < array.length; loop++) {
			total += array[loop];
		}
		return (total / array.length);
	}

}
