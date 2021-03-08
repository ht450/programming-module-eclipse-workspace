/**
 * 
 */
package exercise.two;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Hugh
 *
 */
public class CommandLineReader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//String[] testData = {"1","6","9","4","4","3","0","11"};
		//numberSorter(testData);
		numberSorter(args);
		
	}

	public static void numberSorter(String[] args) {
		
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		
		// give error message if no input
		if (args.length == 0) {
			System.err.println("Input empty! Please input parameters.");
		}
		
		for (String arg : args) {
			
			// convert element of array into wrapper class
			Integer num = new Integer(arg);
			
			// give warning message if the input was invalid
			if (num < 0 || num > 9) {
				System.err.println("The input "+num+" is invalid. Number must be between 0-9.");
			} else {				
				// add number to array
				intArrayList.add(num);
			}
		}
		
		Object[] intArray = intArrayList.toArray();
		Arrays.sort(intArray);
		
		for (int loop=0; loop<intArray.length;loop++) {
			System.out.println(intArray[loop]);
		}
		 
	}
	
	
	
}
