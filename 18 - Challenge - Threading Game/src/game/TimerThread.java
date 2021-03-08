/**
 * 
 */
package game;

/**
 * threaded class that controls the timed element of the game
 * 
 * @author Hugh
 */
public class TimerThread implements Runnable {
	
	/**
	 * the current time the thread has been running for
	 */
	private int currentCount;
	
	/**
	 * starts a thread timer - runs to twice the specified length of the game and will quit naturally if not interrupted
	 */
	@Override
	public void run() {
		
		// start a silent timer
		try {

			do {
							
				Thread.sleep(1000);
				currentCount++; // update the count every second
				
			} while (currentCount <= Game.gameLength*2);
			
		} catch (InterruptedException e) {
			// if interrupted - thread will end
		}
		
	}
	
	/**
	 * Returns the current time the thread has been running for
	 * 
	 * @return
	 */
	public int getCurrentCount() {
		return this.currentCount;
	}
	
	

}
