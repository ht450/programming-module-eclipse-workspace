/**
 * 
 */
package debug;

/**
 * @author Hugh
 *
 */
public class Debug2_Adder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1, num2;
		num1 = 9;
		num2 = 6;
		System.out.println("Answer is "+adder(num1, num2));
		System.out.println("Bye...");
	}// end of main
	
	public static int adder(int a, int b) {
		int answer=0;
		answer=a+b;
		return answer;
	}// end of adder

}// end of class
