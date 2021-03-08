/**
 * 
 */
package greetings.app;

/**
 * This class
 * @author Hugh
 *
 */
public class MessageCentre {

	// instance vars here
	
	
	// constructor here
	
	
	// methods
	/**
	 * Displays a message of welcome!
	 * @param timeOfDay am for morning, pm for evening, also anything else just gets good day.
	 */
	public void displayWelcomeMessage(String timeOfDay) {
		
		String message = "Hello and ";
		
		if (timeOfDay.equalsIgnoreCase("am")) {
			message += "good morning";
		} else if (timeOfDay.equalsIgnoreCase("pm")) {
			message += "good evening";
		} else {
			message += "good day";
		}
		System.out.println(message);
	} // method
	
	
} // end of class
