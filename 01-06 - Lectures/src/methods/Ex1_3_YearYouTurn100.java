/**
 * 
 */
package methods;

/**
 * @author Hugh
 *
 */
public class Ex1_3_YearYouTurn100 {

	/**
	 * method calculates the year the user turns 100
	 * @param currentAge
	 */
	public static void yearTurn100(int currentAge) {
		int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
		int yearTurning100 = 100 - currentAge + currentYear;
		System.out.println("Year turning 100 is : " +yearTurning100);
	}//end of yearTurn100
	
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		yearTurn100(22);
	}//end of main

}//end of class
