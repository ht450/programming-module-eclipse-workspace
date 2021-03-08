/**
 * 
 */
package challenges.week7;

import java.util.Arrays;

/**
 * class that contains the solutions to the week 7 reading week daily coding challenge 
 * for Monday 28th
 * @author Hugh
 *
 */
public class Mon_CodeBreakers {

	/**
	 * will call other methods to code a string to an array of ASCII values and then decode back to a string. 
	 * @param args
	 */
	public static void main(String[] args) {
		//input string
		String nameString = "George";
		System.out.println("String to be encoded : "+nameString);
		// encode name
		int[] nameNumArray = encoderMethod(nameString);
		System.out.println("Encoded: "+Arrays.toString(nameNumArray));
		// decode array
		System.out.println("Decoded : "+decoderMethodToString(nameNumArray));
	}//main

	/**
	 * Takes a string and returns the strings ASCII values in an int array
	 * @param name
	 * @return ASCIIValues
	 */
	public static int[] encoderMethod(String name) {
		int[] ASCIIValues = new int[name.length()];
		for (int loop=0; loop<name.length(); loop++) {
			ASCIIValues[loop] = (int) name.charAt(loop);
		}// for loop
		return ASCIIValues;
	}//method encoderMethod
	
	/**
	 * Takes an int array of ASCII values and returns the corresponding string
	 * @param values
	 * @return name
	 */
	public static String decoderMethodToString(int[] values) {
		String name="";
		for (int loop=0; loop<values.length; loop++) {
			// converting from int to char then to string, then adding to name 
			name = name + Character.toString( (char) values[loop]);
		}// for loop
		return name;
	}//method decoderMethodToString
	
	/**
	 * Takes an int array of ASCII values and returns the corresponding char array
	 * @param values
	 * @return
	 */
	public static char[] decoderMethodtoArray(int[] values) {
		char[] charArray = new char[values.length];
		for (int loop=0; loop<values.length; loop++) {
			charArray[loop] = (char) values[loop];
		}// for loop
		return charArray;
	}// method decoderMethodToArray
	
	/**
	 * method that takes an array and prints the elements (format: [1, 2, 3, ... , n] )
	 * @param array
	 */
	public static void printArray(int[] array) {
		//System.out.println("Array : ");
		for (int loop=0; loop<array.length; loop++) {
			if (loop==0) {
				System.out.print("[");
			}
			System.out.printf("%d", array[loop]);
			if (loop==array.length-1) {
				System.out.printf("]\n");
			} else {
				System.out.printf(", ");
			}
		}//for loop
	}// method printArray
	
}//class
