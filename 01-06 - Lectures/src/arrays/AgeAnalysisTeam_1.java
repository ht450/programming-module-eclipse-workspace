/**
 * 
 */
package arrays;

/**
 * @author Hugh
 *
 */
public class AgeAnalysisTeam_1 {

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		//declare array
		int[] age = {12,56,35,24,86,23,56,78,45,10,6,6,5,98,101,51};
		
		
		//print it using method
		displayAllAges(age);
		
	}//end of main

	/**
	 * method that displays all the ages in the array (and print their average, min and max ages)
	 * @param arrayOfAges
	 */
	public static void displayAllAges(int[] arrayOfAges) {
		
		double average, total=0;
		int minimum=arrayOfAges[0], maximum=arrayOfAges[0];
		//loop over each element and prints it out
		for (int loop=0; loop<arrayOfAges.length; loop++) {
			
			//display all ages
			System.out.println(arrayOfAges[loop]);
			
			//calculate total to find average
			total += arrayOfAges[loop];
			
			//finding minimum
			if (arrayOfAges[loop] < minimum) {
				minimum = arrayOfAges[loop];
			}
			
			//finding maximum
			if (arrayOfAges[loop] > maximum) {
				maximum = arrayOfAges[loop];
			}
			
		}//end of for
		
		//calculate average
		average = total/arrayOfAges.length;
		
		//print values
		System.out.println();
		System.out.println("Av: "+ average);
		System.out.println("Min: "+ minimum);
		System.out.println("Max: "+ maximum);
	
	}//end of method
	
}//end of class
