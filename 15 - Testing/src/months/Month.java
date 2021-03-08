/**
 * 
 */
package months;

/**
 * @author Hugh
 *
 */
public class Month {

	/**
	 * method that takes a int 1-12 and returns the name of the month
	 * @param monthNumber
	 * @return name of month
	 * @throws NumberFormatException
	 */
	public static String monthIntToString (int monthNumber) throws NumberFormatException {
		String monthName;
		switch(monthNumber) {
			case 1:
				monthName = "Janurary";
				break;
			case 2:
				monthName = "Feburary";
				break;
			case 3:
				monthName = "March";
				break;
				// and so on...
			default:
				throw new NumberFormatException();
		}
		return monthName;
	}
	

}
