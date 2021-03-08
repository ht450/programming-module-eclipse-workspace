/**
 * 
 */
package arrays;

/**
 * @author Hugh
 *
 */
public class EnhancedForLoop {

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] myArray = {23,45,67,89};
		
		//output values to screen - using a FOR loop
		for (int loop=0; loop<myArray.length; loop++) {
			System.out.println(myArray[loop]);
		}
		System.out.println();
		
		//enhanced FOR loop - (look but not change! (read only mode))
		for (int number : myArray) {
			System.out.println(number);
		}
		System.out.println();
		
		//nested FOR loop
		//outer loop
		for (int outer=1 ; outer<=10 ; outer++) {
			//inner loop
			for (int inner=1 ; inner<=5 ; inner++) {
				System.out.println(outer+"."+inner);
			}
		}
		
		
		
		
		
		
		
		
		
		
	}//end of main

}//end of class
