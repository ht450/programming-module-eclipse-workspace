/**
 * 
 */
package exceptional;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author Hugh
 *
 */
public class CheckExpection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CheckExpection ck = new CheckExpection();
		
		try {
			ck.iAmChecked();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void iAmChecked() throws FileNotFoundException {
		
		FileReader fr = new FileReader("nothere.txt");
		
	}

}
