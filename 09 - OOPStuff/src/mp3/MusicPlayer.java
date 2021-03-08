/**
 * 
 */
package mp3;

/**
 * @author Hugh
 *
 */
public class MusicPlayer {

	/**
	 * this method creates songs
	 * @param args
	 */
	public static void main(String[] args) {
		
		Mp3 song1 = new Mp3();
		song1.setTitle("Wagon Wheel");
		song1.setArtist("Nathan Carter");
		song1.playSong();
		song1.stopSong();
		
		Mp3 song2 = new Mp3();
		song2.setTitle("Song 2");
		song2.setArtist("Tony");
		song2.playSong();
		song2.stopSong();
		
	}

}
