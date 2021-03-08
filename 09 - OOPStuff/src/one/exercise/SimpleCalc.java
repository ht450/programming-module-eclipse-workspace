/**
 * 
 */
package one.exercise;

/**
 * this class represents a calculator
 * @author Hugh
 *
 */
public class SimpleCalc {

	/**
	 * method prints total of 2 ints (num1+num2)
	 * @param num1
	 * @param num2
	 */
	public void add(int num1, int num2) {
		int total = num1+num2;
		System.out.println(total);
	}
	
	/**
	 * method prints difference between 2 passed ints (num1-num2)
	 * @param num1
	 * @param num2
	 */
	public void subtract(int num1, int num2) {
		int difference = num1-num2;
		System.out.println(difference);
	}
	
	/**
	 * method multiplies 2 ints (num1*num2)
	 * @param num1
	 * @param num2
	 */
	public void mulitply(int num1, int num2) {
		int product = num1*num2;
		System.out.println(product);
	}
	/**
	 * method divides 2 ints (num1/num2). gives while number output (no decimals)
	 * @param num1
	 * @param num2
	 */
	public void divide(int num1, int num2) {
		int div = num1/num2;
		System.out.println(div);
	}
	
}//class
