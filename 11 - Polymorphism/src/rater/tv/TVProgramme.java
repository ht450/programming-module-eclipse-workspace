/**
 * 
 */
package rater.tv;

/**
 * @author Hugh
 *
 */
public class TVProgramme {

	private String programmeName; 
	private String broadcaster;
	private int rating; 
	private double averageAudience;
	
	/**
	 * 
	 */
	public TVProgramme() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param programmeName
	 * @param broadcaster
	 * @param rating
	 * @param averageAudience
	 */
	public TVProgramme(String programmeName, String broadcaster, int rating, double averageAudience) {
		super();
		this.programmeName = programmeName;
		this.broadcaster = broadcaster;
		this.rating = rating;
		this.averageAudience = averageAudience;
	}
	
	/**
	 * @return the programmeName
	 */
	public String getProgrammeName() {
		return programmeName;
	}

	/**
	 * @param programmeName the programmeName to set
	 */
	public void setProgrammeName(String programmeName) {
		this.programmeName = programmeName;
	}

	/**
	 * @return the broadcaster
	 */
	public String getBroadcaster() {
		return broadcaster;
	}

	/**
	 * @param broadcaster the broadcaster to set
	 */
	public void setBroadcaster(String broadcaster) {
		this.broadcaster = broadcaster;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	/**
	 * @return the averageAudience
	 */
	public double getAverageAudience() {
		return averageAudience;
	}

	/**
	 * @param averageAudience the averageAudience to set
	 */
	public void setAverageAudience(double averageAudience) {
		this.averageAudience = averageAudience;
	}

	/**
	 * method prints all the details about this programme.
	 */
	public void printDetails() {
		System.out.printf("%-15s : %-20s\n","Programme Name",this.programmeName);
		System.out.printf("%-15s : %-30s\n","Broadcaster", this.broadcaster);
		System.out.printf("%-15s : %d\n","Rating",this.rating);
		System.out.printf("%-15s : %.1f\n\n","Audience",this.averageAudience);
	}
	

	
}
