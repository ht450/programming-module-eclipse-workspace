/**
 * 
 */
package conditions;

/**
 * @author Hugh
 *
 */
public class ConditionalOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// MSci Grader
		// *assuming the mark is valid*
		int mark;
		mark = 30;
		String status;
		
		if (mark >= 50) {
			status = "Passed";
		} else {
			status = "Failed";
		}
		System.out.println(status);
		
		// as a conditional operator
		status = (mark >= 50) ? "Passed" : "Failed" ;
		System.out.println("As a conditional: "+status);
		
		
		// another example - maximum number picker
		// *assuming the numbers aren't the same*
		int num1, num2, maxNum;
		num1 = 2;
		num2 = 3;
		
		if (num1 > num2) {
			maxNum = num1;
		} else {
			maxNum = num2;
		}
		System.out.println("Max is: "+maxNum);
		
		// as a conditional
		maxNum = (num1 > num2) ? num1 : num2 ;
		System.out.println("Conditional max: "+maxNum);
		
	}

}
