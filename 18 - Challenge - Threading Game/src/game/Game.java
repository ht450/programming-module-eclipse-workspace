/**
 * 
 */
package game;

import java.util.Scanner;

/**
 * @author Hugh
 *
 */
public class Game {

	/**
	 * the length of time the user must try to get (in seconds)
	 */
	public static int gameLength = 30;

	/**
	 * main method - controls the game
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		TimerThread timer = new TimerThread();
		Thread t = new Thread(timer);
		
		// start the game
		System.out.println("Count of "+gameLength+" secs game");
		System.out.println("Press any key and enter to start .. then estimate when "+gameLength+" secs have elapsed");
		scanner.nextLine();

		// start timer
		System.out.println("Start counting... ");
		System.out.println("Hit any key and enter when you think time is up");
		t.start();
		
		// user presses any key and hits enter
		scanner.nextLine();
		
		// check results
		
		if(t.isAlive()) {
			
			// too early
			if(timer.getCurrentCount() < gameLength) {
				System.out.println("ohhh, too early, it has only been "+timer.getCurrentCount()+" seconds");

			// too late
			} else if(timer.getCurrentCount() > gameLength) {
				System.out.println("ohhh, too late, that was "+timer.getCurrentCount()+" seconds");
			
			// just right
			} else {
				System.out.println("NICE ONE, you got it exactly right");
				
			}
			
			// stop the thread
			t.interrupt();
			
		} else {
			// thread has stopped itself because user was wayyy to late
			System.out.println("Way too late! off by at least double");
			t.interrupt();
		}
		
		System.out.println("Game Over!");
		scanner.close();
		
	}

}
