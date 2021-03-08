/**
 * 
 */
package arrays;

/**
 * @author Hugh
 *
 */
public class ArrayExamples {

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		//make an array to hold 6 ages
		/*
		int[] myArray = new int[6];		
		myArray[0] = 17;
		myArray[1] = 21;
		myArray[2] = 32;
		myArray[3] = 36;
		myArray[4] = 22;
		myArray[5] = 21;
		*/
		//or
		int[] myArray = { 17, 21, 32, 36, 22, 21};
		int total=0;
		
		//show all values and output the total age
		for (int loop=0; loop<myArray.length ; loop++) {
			System.out.println(myArray[loop]);
			total += myArray[loop];
		}
		//print total
		System.out.println(total);
		
		
	}//end of main

}//end of class
