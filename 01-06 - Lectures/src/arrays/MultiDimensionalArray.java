/**
 * 
 */
package arrays;

/**
 * @author Hugh
 *
 */
public class MultiDimensionalArray {

	/**
	 * main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] a2DArray = new int[3][4];

		a2DArray[0][0] = 999;
		a2DArray[0][1] = 123;

		System.out.println(a2DArray[0][0]);
		System.out.println(a2DArray[0][1]);

		// for loop showing indexes of array
		// NOTE: hard coded values for the array size
		System.out.println("Array indexes [row][col]:");
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 4; col++) {
				System.out.print("[" + row + "]" + "[" + col + "] ");
			} // end of col FOR
			System.out.println();
		} // end of row FOR

		System.out.println("\nUsing a method to print contents:");
		arrayPrinter2D(a2DArray);
		

	}// end of main

	public static void arrayPrinter2D(int[][] a2DArray) {
		// show the values in the 2D array
				for (int row = 0; row < a2DArray.length; row++) {
					for (int col = 0; col < a2DArray[row].length; col++) {
						System.out.print("["+a2DArray[row][col] + "]\t");
					} // end of col FOR
					System.out.println();
				} // end of row FOR
	}
	
}// end of class
