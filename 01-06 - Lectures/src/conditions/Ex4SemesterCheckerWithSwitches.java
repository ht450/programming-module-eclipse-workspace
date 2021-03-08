/**
 * 
 */
package conditions;

/**
 * @author Hugh
 *
 */
public class Ex4SemesterCheckerWithSwitches {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int month;
		
		// ask the user for the month number
		month = 11;
		
		switch (month) {
			
			// months 1,9-12 - semester 1
			case 1:
			case 9:
			case 10:
			case 11:
			case 12:
				System.out.println("Semester 1");
				break;
			
			// months 2-5 - semester 2
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Semester 2");
				break;
			
			// months 6-8 - summer
			case 6:
			case 7:
			case 8:
				System.out.println("Summer");
				break;
			
			default:
				System.out.println("Not a valid month number!");
		}
		
		
	}

}
