/**
 * 
 */
package methods;

/**
 * @author Hugh
 *
 */
public class Ex3_1_Adds2Numbers {

	// make it into a game
	// get 2 random numbers and ask the user for the answer
	// tell the user if they get it correct
	
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(multiply(2, 8));
	}//end main

	/**
	 * method that adds 2 ints together and returns the total
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static int add(int num1, int num2) {
		int total = num1 + num2;
		return total;
	}//end of add method
	
	/**
	 * method that subtracts 2 ints together and returns the answer
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static int subtract(int num1, int num2) {
		int answer = num1 - num2;
		return answer;
	}//end of subtract method
	
	/**
	 * method that multiplys 2 ints and returns the answer
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static int multiply(int num1, int num2) {
		int answer = num1*num2;
		return answer;
	}//end of multiply method
	
	
}//end class
