/**
 * 
 */
package loops;

/**
 * method to show savings increasing over 10 years
 * @author Hugh
 *
 */
public class Ex3_CompoundInterest {
	
	/**
	 * constant to store the interest rate
	 */
	public static final double Interest_Rate = 0.05 ;

	/**
	 * main method calculating compound interest and printing it out
	 * @param args
	 */
	public static void main(String[] args) {
		
		double savings;
		savings = 1000;
		
		System.out.printf("%4s %20s\n", "Year", "Savings");

		for (int year=1; year<=10; year++) {
			//calculate savings and print yearly statement
			savings = savings*(1+Interest_Rate);
			//System.out.printf("Year %d, Savings £%.2f\n", year, savings);
			System.out.printf("%4d %20.2f\n", year, savings);
			
		}//end of FOR
		
	}//end of main method

}
