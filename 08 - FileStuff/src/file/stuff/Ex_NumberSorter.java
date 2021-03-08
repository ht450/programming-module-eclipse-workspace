/**
 * 
 */
package file.stuff;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Hugh
 *
 */
public class Ex_NumberSorter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] userNumbers = new int[5]; //limit to 5
		Scanner scan = new Scanner(System.in);		
		boolean done=false; // used for inputting numbers
		int tempNum;
		String writeToFile;

		// create file
		File file = new File("Numbers.txt");
		// check file exists
		if (!file.exists()) {
			// if not then create
			try {
				file.createNewFile();
			} catch (IOException ioException) {
				System.out.println("Unable to create file!");
			}
		}//if
		
		// prompt user for max 5 numbers
		System.out.println("Enter numbers: ");
		for (int loop=0; loop<userNumbers.length; loop++) {
			done=false;
			do {
				try {
					tempNum=scan.nextInt();
					userNumbers[loop]=tempNum;
					done=true;
				} catch (Exception exception) {
					System.out.println("integers only, try again!");
					scan.next();
				}
			} while (!done);
		}
		System.out.println(Arrays.toString(userNumbers));
		
		// sort number into ascending order
		System.out.println("Sorted...");
		Arrays.sort(userNumbers);
		System.out.println(Arrays.toString(userNumbers));
		
		// write the sorted numbers to file
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int loop=0; loop<userNumbers.length; loop++) {
				writeToFile=Integer.toString(userNumbers[loop]);
				bw.write(writeToFile);
				bw.newLine();
//				System.out.println("trace: "+loop);
			}
			
			bw.close();
			fw.close();
		} catch (IOException e) {
			System.out.println("shite");
			e.printStackTrace();
		}
		System.out.println("Written to file!");
		
		
		
		scan.close();
	}// main

}// class
