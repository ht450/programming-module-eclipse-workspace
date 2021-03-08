/**
 * 
 */
package arrays;

import java.util.Arrays;

/**
 * @author Hugh
 *
 */
public class DontReinventTheWheel {

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] feet = {2,3,4,5,1,12,1,45,3,5};
		
		//print out all the values manually
		for (int value : feet) {
			System.out.print(value+" ");
		}
		System.out.println();
		
		//built in class that prints an array for you
		System.out.println(Arrays.toString(feet));
		
		//class to sort an array
		Arrays.sort(feet);
		System.out.println(Arrays.toString(feet));
		
		
		
		
		
		
	}//end of main

}//end of class
