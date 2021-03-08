/**
 * 
 */
package errors;

/**
 * @author Hugh
 *
 */
public class TryCatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try { // start of try
			int myArray[] = { 1, 2, 3, 4 };

			for (int loop = 0; loop < 6; loop++) {
				System.out.println(myArray[loop]);
			} // end of for
		} catch (Exception exception) {
			System.out.println("In here with a problem!");
			exception.printStackTrace();
		} // end of catch

	}// end of main

}// end of class
