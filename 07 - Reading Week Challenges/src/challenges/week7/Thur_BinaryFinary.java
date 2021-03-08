/**
 * 
 */
package challenges.week7;

import java.util.Arrays;

/**
 * class that contains the solutions to the week 7 reading week daily coding challenge 
 * for Thursday 31st
 * @author Hugh
 *
 */
public class Thur_BinaryFinary {

	/**
	 * method that will take a boolean array and print the corresponding binary number
	 * and will then print the decimal equivalent
	 * @param args
	 */
	public static void main(String[] args) {
		// declare 8 bit array
		boolean[] eightBitArray = { true, false, false, true, false, true, false, true };
		// print binary
		System.out.println(Arrays.toString(binaryPrinter(eightBitArray)));
		// print decimal
		System.out.println(decimalPrinter(eightBitArray));
		
	}//main method
	
	/**
	 * method that takes a boolean array and converts it to a binary array and returns that
	 * @return
	 */
	public static int[] binaryPrinter(boolean[] booleanArray) {
		int[] binaryArray = new int[booleanArray.length];
		for (int loop=0; loop<booleanArray.length; loop++) {
			if (booleanArray[loop]) {
				binaryArray[loop]=1;
			} else {
				binaryArray[loop]=0;
			}
		}//for
		return binaryArray;
	}//binaryPrinter method
	
	/**
	 * method that takes a boolean array and returns its decimal equivalent
	 * @param booleanArray
	 * @return
	 */
	public static int decimalPrinter(boolean[] booleanArray) {
		int[] binaryArray = binaryPrinter(booleanArray);
		double[] powersOf2 = new double[booleanArray.length];
		int decimalAnswer=0;
		// make powers of 2 array
		int index=0;
		int exponent=(powersOf2.length-1);
		while ( index<powersOf2.length ) {
			powersOf2[index] = Math.pow(2, (double) exponent);
			index++;
			exponent--;
		}//for
		
//		System.out.println("PowOf2 "+Arrays.toString(powersOf2));
//		System.out.println("Binary "+Arrays.toString(binaryArray));
		
		// compare to powers of 2 array, if bit is 1 add to total
		for (int loop=0; loop<binaryArray.length; loop++) {
			if (binaryArray[loop]==1) {
				decimalAnswer+=powersOf2[loop];
			}
//			System.out.println(loop+". "+decimalAnswer);
		}//for
		return decimalAnswer;
	}//decimalPrinter method

}//class
