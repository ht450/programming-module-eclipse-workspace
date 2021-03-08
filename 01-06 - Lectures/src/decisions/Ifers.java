/**
 * 
 */
package decisions;

/**
 * @author Hugh
 *
 */
public class Ifers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int num1, num2;
		
		num1 = 22;
		num2 = 20;
		
		if (num1 == num2) {
			// this is the if statement block/body
			// only if TRUE
			System.out.println("Yip, "+num1 +" is the same as " +num2);
		}
		
		if (num1 != num2) {
			// not the same
			System.out.println("Nope, " +num1 +" is NOT the same as " +num2);
		}
		
		// relational operators	< > >= <=
		
		// greater than
		if (num1 > num2) {
			System.out.println(num1 +" is greater than " +num2);
		}
		
		// less than
		if (num1 < num2) {
			System.out.println(num1 +" is less than " +num2);
		}
		
		// greater than or equal to
		if (num1 >= num2) {
			System.out.println(num1 +" is greater than or equal to " +num2);
		}
		
		// less than or equal to
		if (num1 <= num2) {
			System.out.println(num1 +" is less than or equal to " +num2);
		}
		
		
		
		System.out.println("End of program...");
	}

}
