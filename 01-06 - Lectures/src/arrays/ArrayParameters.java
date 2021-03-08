/**
 * 
 */
package arrays;

/**
 * class file for showing passing arrays as parameters into methods
 * @author Hugh
 *
 */
public class ArrayParameters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//declare 2 arrays
		int[] temps = {8,4,5,3,12,13,15};
		int[] age = {34,56,34,23,89,7,89,45,23,45};
		
		//use method to print them
		printArray(temps);
		System.out.println();
		printArray(age);		
		
	}//end of main

	/**
	 * method that prints the elements in an array. (regardless of the size of the array)
	 * @param parameterArray
	 */
	public static void printArray(int[] parameterArray) {
		
		//loop over each element and prints it out
		for (int loop=0; loop<parameterArray.length; loop++) {
			System.out.println(parameterArray[loop]);
		}//end of for
		
	}//end of printArray
	
}//end of class
