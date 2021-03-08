/**
 * 
 */
package four;

/**
 * @author Hugh
 *
 */
public class Four_Part1_IntegerSumLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int sum, num ;
		num = 1;
		sum = 0;
		
		while (num <= 10) {
			System.out.println(num);
			sum = sum + num;
			System.out.println("The sum is: "+sum);
			num++;
		}//end of while
		
		
	}//end of main method

}
