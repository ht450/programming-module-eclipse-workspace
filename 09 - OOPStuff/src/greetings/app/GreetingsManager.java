/**
 * 
 */
package greetings.app;

/**
 * @author Hugh
 *
 */
public class GreetingsManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Start");
		
		MessageCentre messageCentre = new MessageCentre();
		messageCentre.displayWelcomeMessage("perm");
		
		
		System.out.println("End");
	} // main

} // class
