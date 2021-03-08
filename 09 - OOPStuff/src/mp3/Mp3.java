/**
 * 
 */
package mp3;

/**
 * @author Hugh
 *
 */
public class Mp3 {
	
	// instance vars
	private String title;
	private String artist;
	
	//constructor
	
	
	//methods
	/**
	 * This method returns the title
	 * @return
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * This method sets the title to a passed String
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * This method returns the artist
	 * @return
	 */
	public String getArtist() {
		return artist;
	}
	
	/**
	 * This method sets the artist to a passed string
	 * @param artist
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	/**
	 * this method plays the song
	 */
	public void playSong() {
		System.out.println("Playing "+this.title+" by "+this.artist);
	}

	/**
	 * this method stops the song
	 */
	public void stopSong() {
		System.out.println("Stopping "+this.title+" by "+this.artist);
	}
	
}
