/**
 * 
 */
package conditions;

/**
 * @author Hugh
 *
 */
public class Ex2SemesterChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int month;
		
		// ask the user for the month number
		month = 1;

		if (month == 1 || (month>=9 && month <=12) ) {
			// months 1,9-12 - semester 1
			System.out.println("Semester 1");
		} else if ( month >= 2 && month <= 5) {
			// months 2-5 - semester 2
			System.out.println("Semester 2");
		} else if ( month >= 6 && month <= 8) {
			// months 6-8 - summer
			System.out.println("Summer");
		} else if (month < 1 || month >12) {
			System.out.println("Not a valid month number!");
		}
		
		

	}

}
