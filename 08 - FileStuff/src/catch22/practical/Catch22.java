/**
 * 
 */
package catch22.practical;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Hugh
 *
 */
public class Catch22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String line;
		int linecount = 0;
		int wordcount = 0;
		int totalchar = 0;
		int yossiarncount = 0;
		int acount = 0;

		try {
			File catch22 = new File("Catch 22.txt");
			File redeacted = new File("Catch22Redacted.txt");

			FileReader fr = new FileReader(catch22);
			BufferedReader br = new BufferedReader(fr);

			FileWriter fw = new FileWriter(redeacted);
			BufferedWriter bw = new BufferedWriter(fw);

			// print out full text
			line = br.readLine();
			while (line != null) {

				linecount++;

				String[] words = line.split(" ");
				wordcount += words.length;

				// System.out.println(line);
				totalchar += line.length();
				if (line.contains("Yossarian")) {
					yossiarncount++;

					String redactedLine = line.replace("Yossarian", "---------");
					bw.write(redactedLine + "\n");
				} else {
					bw.write(line + "\n");
				}

				for (int loop = 0; loop < line.length(); loop++) {
					switch (line.charAt(loop)) {
					case 'a':
					case 'A':
						acount++;
						break;
					default:
						//nothing happens
					}
				}

				line = br.readLine();
			}

			br.close();
			fr.close();
			bw.close();
			fw.close();

			System.out.println("Total Lines       : " + linecount);
			System.out.println("Total Words       : " + wordcount);
			System.out.println("Total Characters  : " + totalchar);
			System.out.println("Total Yossarians  : " + yossiarncount);
			System.out.println("Total 'A' chars   : " + acount);

		} catch (FileNotFoundException fileNotFoundException) {
			System.err.println("Sorry, file not found");
		} catch (IOException ioException) {
			System.err.println("Input Output exception");
		} catch (Exception e) {
			System.err.println("Exception");
			e.printStackTrace();
		} // try-catch
	}// main
}// class
