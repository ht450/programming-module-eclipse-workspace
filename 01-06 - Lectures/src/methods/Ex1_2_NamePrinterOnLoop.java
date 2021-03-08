/**
 * 
 */
package methods;

/**
 * @author Hugh
 *
 */
public class Ex1_2_NamePrinterOnLoop {
	
	/**
	 * method that prints a users name a number of times
	 */
	public static void loopPrinter(int timesPrinted, String name) {
		for (int loop = 1; loop <= timesPrinted; loop++) {
			System.out.println(loop+". "+name);
		}//end of FOR
	}//end of loopPrinter
	
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		
		loopPrinter(1, "Hugh");

	}// end of main

}//end of class
