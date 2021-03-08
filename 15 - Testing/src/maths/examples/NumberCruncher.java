/**
 * 
 */
package maths.examples;

/**
 * @author Hugh
 *
 */
public class NumberCruncher {

	public int addNumbers(int num1, int num2) {
		return num1 + num2;
	}

	public int addNumbers(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 * @throws Exception if the second param is 0
	 */
	public double divNumbers(double num1, double num2) throws Exception {
		if (num2 == 0) {
			throw new Exception();
		} else {
			return num1 / num2;
		}
	}
}
