/**
 * 
 */
package file.stuff;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Hugh
 *
 */
public class WriteToFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		File file = new File("Teams.txt");
		
		// checks if file exists 
		if (!file.exists()) {
			// if not then create it
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("Unable to create file");
			}
		}//if
		
		try {
			FileWriter fw = new FileWriter(file, true); // needs true so it wont overwrite file
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("Italy");
			
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} // needs true so it wont overwrite file
		
		
		
	}//main

}//class
