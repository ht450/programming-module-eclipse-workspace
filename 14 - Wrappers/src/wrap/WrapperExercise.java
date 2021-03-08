/**
 * 
 */
package wrap;

import java.util.Arrays;

/**
 * @author Hugh
 *
 */
public class WrapperExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i1 = 33;
		String i2 = "999";
		double i3 = 23.4;
		Integer i4 = 4;
		int i5 = 67;
		int i6 = 31;
		String i7 = "60";
		double i8 = 22.2;
		int i9 = -22;
		
		// store all in an Array
		Double[] numbers = new Double[9];
		numbers[0] = new Double(i1);
		numbers[1] = new Double(i2);
		numbers[2] = new Double(i3);
		numbers[3] = i4.doubleValue();
		numbers[4] = new Double(i5);
		numbers[5] = new Double(i6);
		numbers[6] = new Double(i7);
		numbers[7] = i8;
		numbers[8] = new Double(i9);
		
		// show unsorted values
		System.out.println("Unsorted :");
		for (Double number : numbers) {
			System.out.println(number);
		}
		
		// sort
		Arrays.sort(numbers);
		
		// show sorted values
		System.out.println("Sorted :");
		for (Double number : numbers) {
			System.out.println(number);
		}
		
		// code can be improved by making the print statement a method
	}
	
	public static void printArray(Double[] array) {
		for (Double item : array) {
			System.out.println(item);
		}
	}

}
