/**
 * 
 */
package three.extra;

/**
 * @author Hugh
 *
 */
public class Problem1_WeekdayIfElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int dayNum ;
		String dayName ;
		
		dayNum = 8 ;
		
		if (dayNum == 1) {
			dayName = "Sunday";
		} else if (dayNum == 2) {
			dayName = "Monday";
		} else if (dayNum == 3) {
			dayName = "Tuesday";
		} else if (dayNum == 4) {
			dayName = "Wednesday";
		} else if (dayNum == 5) {
			dayName = "Thursday";
		} else if (dayNum == 6) {
			dayName = "Friday";
		} else if (dayNum == 7) {
			dayName = "Saturday";
		} else {
			dayName = "Invalid";
		}
		
		System.out.println(dayName);	
		
		
	}//main method

}
