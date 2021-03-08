/**
 * 
 */
package practical;

/**
 * @author Hugh
 *
 */
public class Calculator {

	private int memory;
	
	/**
	 * 
	 */
	public Calculator() {
		
	}

	/**
	 * @param memory
	 */
	public Calculator(int memory) {
		this.memory = memory;
	}

	/**
	 * @return the memory
	 */
	public int getMemory() {
		return memory;
	}

	/**
	 * @param memory the memory to set
	 */
	public void setMemory(int memory) {
		this.memory = memory;
	}

	/**
	 * method that takes two numbers and returns their sum
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int addNumbers(int num1, int num2) {
		return num1+num2;
	}
	
	/**
	 * method that takes two numbers and returns the first minus the second
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int subtract(int num1, int num2) {
		return num1-num2;
	}
	
	/**
	 * method that takes two numbers and returns their product
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int multiply(int num1, int num2) {
		return num1*num2;
	}
	
	/**
	 * method takes two numbers and divides the first by the second.
	 * if the second number is zero it will give a warning and the answer will default to zero.
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int divide(int num1, int num2) {
		int answer;
		try {
			answer = num1/num2;
		} catch(ArithmeticException arithmeticException) {
			System.err.println("Cannot divide by zero!");
			answer = 0;
		}
		return answer;
	}
	
	/**
	 * method that returns the square root of a number using the Math class.
	 * @param num1
	 * @return
	 */
	public double sqrRoot(int num1) {
		return Math.sqrt((double) num1);
	}
	
	/**
	 * method that resets the memory back to zero.
	 */
	public void clearMemory() {
		setMemory(0);
	}
	
	
	
	
	
}
