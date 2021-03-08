/**
 * 
 */
package methods;

/**
 * class
 * @author Hugh
 *
 */
public class Ex2_3_MinMaxAverage {

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		min(10,20);
		max(10,20);
		average(10, 20, 11, 34);
	}//end of main

	/**
	 * Output a count from a passed start point to a passed end point
	 * @param endPoint
	 */
	public static void countUp(int startPoint, int endPoint) {
		for (int loop=startPoint; loop<=endPoint; loop++) {
			System.out.println(loop);
		}//end of FOR
	}//end of countUp method
	
	/**
	 * method takes 2 numbers (ints) and prints the smaller number
	 * @param num1
	 * @param num2
	 */
	public static void min(int num1, int num2) {
		//assuming numbers are different
		if (num1<num2) {
			System.out.println(num1);
		} else if (num2<num1) {
			System.out.println(num2);
		}//end of IF ELSE
	}//end of min method
	
	/**
	 * method takes 2 numbers (ints) and prints the larger number
	 * @param num1
	 * @param num2
	 */
	public static void max(int num1, int num2) {
		//assuming numbers are different
		if (num1>num2) {
			System.out.println(num1);
		} else if (num2>num1) {
			System.out.println(num2);
		}//end of IF ELSE
	}//end of max method
	
	/**
	 * method that calculates and prints the average of 4 passed ints 
	 * @param num1
	 * @param num2
	 * @param num3
	 * @param num4
	 */
	public static void average(int num1, int num2, int num3, int num4) {
		int total = num1+num2+num3+num4;
		double avg = (double)total/4;
		System.out.println(avg);
	}//end of average method
	
}//end of class
