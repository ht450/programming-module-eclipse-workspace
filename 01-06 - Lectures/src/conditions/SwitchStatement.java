/**
 * 
 */
package conditions;

/**
 * @author Hugh
 *
 */
public class SwitchStatement {
	// Switch statement can also be called case statement
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num;
		num = 4;

		switch (num) {
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			case 4:
				System.out.println("four");
				break;
			default:
				System.out.println("unknown");
		}// end of switch

	}// end of main

}// end of class
