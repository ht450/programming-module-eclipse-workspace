/**
 * 
 */
package methods;

/**
 * class that take a user input for a number and exponent and passes it 
 * to another method to calculate and return the answer
 * @author Hugh
 *
 */
public class Ex3_3_ExponentCalculation {

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(exponentCalculator(3, 5));
	}//end of main

	
	public static double exponentCalculator (double number, double exponent) {
		double answer = Math.pow(number, exponent);		
		return answer;
	}//end of exponentCalculator
	
}//end of class
