/**
 * 
 */
package csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author Hugh
 *
 */
public class RugbyScores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// find file
		File file = new File("Scores.csv");
		String line;

		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			line = br.readLine();
			while (line != null) {

				printMatchResult(line);
				printWinner(line);

				line = br.readLine();
			}

			br.close();
			fr.close();
		} catch (FileNotFoundException fileNotFoundException) {
			System.err.println("File not found!");
		} catch (Exception exception) {
			System.err.println("Exception reading file!");
		}

	}

	public static void printWinner(String line) {
		String[] match = line.split(",");

		String team1 = match[0];
		int score1 = Integer.parseInt(match[1]);
		String team2 = match[2];
		int score2 = Integer.parseInt(match[3]);

		if (score1 > score2) {
			System.out.printf("Winner %s\n", team1);
		} else if (score1 < score2) {
			System.out.printf("Winner %s\n", team2);
		} else if (score1 == score2) {
			System.out.printf("Draw!\n");
		}
	}

	public static String[] printMatchResult(String line) {
		String[] lineSplit = line.split(",");
		System.out.printf("%s %s : %s %s\t", lineSplit[0], lineSplit[1], lineSplit[2], lineSplit[3]);
		return lineSplit;
	}
}
