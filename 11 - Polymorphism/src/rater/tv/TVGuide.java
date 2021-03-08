/**
 * 
 */
package rater.tv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Hugh
 *
 */
public class TVGuide {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		TVProgramme tv1 = new TVProgramme("ImmaCeleb", "ITV", 8, 10.4);
//		tv1.printDetails();
		
		File file = new File("TVProgrammes.csv");
		String line;
		ArrayList<TVProgramme> programmes = new ArrayList<TVProgramme>();
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			// skip headers line
			line = br.readLine();
			
			line = br.readLine();
			while(line!=null) {
				String[] splitLine = line.split(",");
				TVProgramme program = new TVProgramme(splitLine[0].trim(), splitLine[1].trim(), Integer.parseInt(splitLine[2]), Double.parseDouble(splitLine[3]));
				programmes.add(program);
				program.printDetails();
				line = br.readLine();
			}
			
			searchForBroadcaster(programmes, "BBC");
			
			br.close();
			fr.close();
		} catch (FileNotFoundException fileNotFoundException) {
			System.err.println("Can't find file");			
		} catch (IOException ioException) {
			System.err.println("input output exception!");
		} catch (Exception exception) {
			System.err.println("Problem...");
			exception.printStackTrace();
		} 		
	}

	/**
	 * method that searches an arraylist of TVProgrammes for a specific broadcaster and prints the program names that match.
	 * @param programmes
	 * @param broadcaster
	 */
	public static void searchForBroadcaster(ArrayList<TVProgramme> programmes, String broadcaster) {
		System.out.printf("All programmes by '%s' : \n", broadcaster);
		for (TVProgramme program : programmes) {
			if(program.getBroadcaster().equalsIgnoreCase(broadcaster)) {
				System.out.println(program.getProgrammeName());
				writeToFile("BBCProgrammes.csv", program);
			}
		}
	}
	
	/**
	 * method writes TVProgamme details to a file (in comma separated format)
	 * @param fileName
	 * @param program
	 */
	public static void writeToFile(String fileName, TVProgramme program) {
		File file = new File(fileName);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.err.println("problem creating file!");
				e.printStackTrace();
			}
		}
		String line;
		try {
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
		
			line = program.getProgrammeName()+","+program.getBroadcaster()+","+Integer.toString(program.getRating())+","+Double.toString(program.getAverageAudience())+"\n";
			
			bw.write(line);
			
			bw.close();
			fw.close();
		} catch (FileNotFoundException fileNotFoundException) {
			System.err.println("Can't find file");			
		} catch (IOException ioException) {
			System.err.println("input output exception!");
		} catch (Exception exception) {
			System.err.println("Problem...");
			exception.printStackTrace();
		}
	}
}
