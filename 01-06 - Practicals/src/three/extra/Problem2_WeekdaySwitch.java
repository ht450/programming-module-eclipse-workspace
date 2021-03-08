/**
 * 
 */
package three.extra;

/** method that takes a number input and outputs the corresponding day of the week
 * @author Hugh
 *
 */
public class Problem2_WeekdaySwitch {

	/** main method checks the day of the week using a switch selection statement
	 * @param args
	 */
	public static void main(String[] args) {
		int dayNum;
		String dayName;

		dayNum = 4;

		switch (dayNum) {
			case 1:
				dayName = "Sunday";
				break;
			case 2:
				dayName = "Monday";
				break;
			case 3:
				dayName = "Tuesday";
				break;
			case 4:
				dayName = "Wednesday";
				break;
			case 5:
				dayName = "Thursday";
				break;
			case 6:
				dayName = "Friday";
				break;
			case 7:
				dayName = "Saturday";
				break;
			default:
				dayName = "Invalid";
		}
		System.out.println(dayName);

	}// main method

}
