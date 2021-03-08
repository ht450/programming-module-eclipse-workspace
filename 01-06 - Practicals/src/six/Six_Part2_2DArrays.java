/**
 * 
 */
package six;

/**
 * @author Hugh
 *
 */
public class Six_Part2_2DArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Q1
		int[][] array1 = new int[4][4];

		int arrayFiller = 0;
		for (int row = 0; row < array1.length; row++) {
			for (int col = 0; col < array1[row].length; col++) {
				arrayFiller += 2;
				array1[row][col] = arrayFiller;
			}
		}

		// Q2
		System.out.println("Array: ");
		print2DIntArray(array1);

		// Q3
		System.out.println("Sum of all the elements: " + sum2DIntArray(array1));

		// Q4
		System.out.println("Total length: " + totalElements2DIntArray(array1));
		double averageValue = sum2DIntArray(array1) / totalElements2DIntArray(array1);
		System.out.println("Average Value: " + averageValue);
	}

	/**
	 * method that takes a 2D int array and prints it to screen
	 * 
	 * @param array
	 */
	public static void print2DIntArray(int[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + "\t");
			}
			System.out.println();
		}
	}

	/**
	 * method that takes a 2D int array and returns the sum of all its elements
	 * 
	 * @param array
	 * @return
	 */
	public static int sum2DIntArray(int[][] array) {
		int total = 0;
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				total += array[row][col];
			}
		}
		return total;
	}

	/**
	 * method that returns the total number of elements in a 2D int array
	 * 
	 * @param array
	 * @return
	 */
	public static int totalElements2DIntArray(int[][] array) {
		int totalLength = 0;
		for (int row = 0; row < array.length; row++) {
			totalLength += array[row].length;
		}
		return totalLength;
	}

}
