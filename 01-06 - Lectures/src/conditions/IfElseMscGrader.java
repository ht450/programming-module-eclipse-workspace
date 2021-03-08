/**
 * 
 */
package conditions;

/**
 * @author Hugh
 *
 */
public class IfElseMscGrader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int mark;
		mark = -1;
		
		// if 50 or over - pass
		// if under 50 - fail
		// if negative or over 100 - invalid
		
		if (mark < 0 || mark > 100) {
			System.out.println("Invalid Mark!");
		} else if (mark >= 50) {
			System.out.println("Pass");
		} else if (mark < 50) {
			System.out.println("Fail");
		} 
		
		
		
		
		
	}

}
