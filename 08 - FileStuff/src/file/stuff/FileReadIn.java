/**
 * 
 */
package file.stuff;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author Hugh
 *
 */
public class FileReadIn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// readin from a file
		File file = new File("Teams.txt"); 
		String line;
		
		try {
			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			line = br.readLine();
			
			while (line!=null) {
				System.out.println(line);
				line = br.readLine();				
			}
						
			br.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Can't find file");
		} catch (Exception exception) {
			System.out.println("General problem");
		}
		
		
		
	}//main

}//class
