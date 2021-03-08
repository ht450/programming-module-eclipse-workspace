/**
 * 
 */
package champoleague;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * @author Hugh
 *
 */
public class EuropeanCupWinners {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String line;
		int year;
		ArrayList<String> euroChampsList = new ArrayList<String>();
		ArrayList<String> euroChampsNoDups = new ArrayList<String>();

		File file = new File("ECWinners.txt");

		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			// Part 1
			year = 1956;
			line = br.readLine();
			do {
				System.out.println(year + " : " + line);
				euroChampsList.add(line);
				line = br.readLine();
				year++;
			} while (line != null);

			// Part 2
			for (String team : euroChampsList) {
				if (!euroChampsNoDups.contains(team)) {
					euroChampsNoDups.add(team);
				}
			}
			System.out.println(euroChampsNoDups);

			br.close();
			fr.close();
		} catch (FileNotFoundException fileNotFoundException) {
			System.err.println("File not found!");
		} catch (Exception e) {
			System.err.println("Oopsies... Exception!");
		}

	} // main

} // class
