/**
 * 
 */
package conditions;

/**
 * @author Hugh
 *
 */
public class GradingProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int mark;
		mark = 75;
		
		if (mark >= 70) {
			System.out.println("A");
		} else if (mark >= 60){
			System.out.println("B");
		} else if (mark >= 50){
			System.out.println("C");
		} else {
			System.out.println("D");
		}

		System.out.println("Done");
	}

}
