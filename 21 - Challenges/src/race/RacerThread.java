/**
 * 
 */
package race;

/**
 * @author Hugh
 *
 */
public class RacerThread implements Runnable {

	private String name;
	private Double timeTaken;
	
	@Override
	public void run() {
		
		try {
			// change time to millisecs 
			Double timeMillisecs = this.getTimeTaken() * 1000;
			
			// sleep thread for this length
			Thread.sleep(timeMillisecs.longValue());
			
		} catch (InterruptedException e) {
			System.err.println("Thread interrupted");
		}
		
		// print result
		System.out.printf("%S finished at : %.2f \n", this.getName(), this.getTimeTaken());
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the timeTaken
	 */
	public Double getTimeTaken() {
		return timeTaken;
	}

	/**
	 * @param timeTaken the timeTaken to set
	 */
	public void setTimeTaken(Double timeTaken) {
		this.timeTaken = timeTaken;
	}	
	
}
