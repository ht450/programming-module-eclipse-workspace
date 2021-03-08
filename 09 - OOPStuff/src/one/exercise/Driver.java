/**
 * 
 */
package one.exercise;

/**
 * this class tests the SimpleCalc class in this package
 * @author Hugh
 *
 */
public class Driver {

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		
		SimpleCalc simpleCalc = new SimpleCalc();
		
		int num1 = 16;
		int num2 = 5;
		
		simpleCalc.add(num1, num2);
		simpleCalc.subtract(num1, num2);
		simpleCalc.mulitply(num1, num2);
		simpleCalc.divide(num1, num2);
		
		
	}//main

}//class
