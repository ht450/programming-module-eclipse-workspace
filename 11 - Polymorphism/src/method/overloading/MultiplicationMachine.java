/**
 * 
 */
package method.overloading;

/**
 * @author Hugh
 *
 */
public class MultiplicationMachine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MultiplicationMachine mm = new MultiplicationMachine();
		mm.multiply(1, 2);
		mm.multiply(1, 2, 3);
		mm.multiply(1, 2, 3, 4);
	}
	
	/**
	 * default constructor
	 */
	public MultiplicationMachine() {
		
	}
	
	/**
	 * method multiplies 2 numbers
	 * @param num1
	 * @param num2
	 */
	public void multiply(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	/**
	 * method multiplies 3 numbers
	 * @param num1
	 * @param num2
	 * @param num3
	 */
	public void multiply(int num1, int num2, int num3) {
		System.out.println(num1 * num2 * num3);
	}
	/**
	 * method multiplies 4 numbers
	 * @param num1
	 * @param num2
	 * @param num3
	 * @param num4
	 */
	public void multiply(int num1, int num2, int num3, int num4) {
		System.out.println(num1 * num2 * num3 * num4);
	}
}
