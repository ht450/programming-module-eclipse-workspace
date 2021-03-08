/**
 * 
 */
package wrap;

import java.util.Arrays;

/**
 * @author Hugh
 *
 */
public class Boxer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// AUTOBOXING... AUTO-UNBOXING
		int m, n;
		m = 20;
		
		Integer objM = new Integer(10);
		Integer objN;
		
		// assignment conversion
		objN = m; // AUTOBOX. box m to Integer object. assign to objN
		n = objM; // AUTOUNBOX. unbox objM to an int. assign to n.
		
		// expressions
		n = objM + 5; // unbox objM before integer addition
		objM++; // unbox objM, increment value and rebox
		
		// comparisons (alternative to equals() and compareTo())
		if (m > objM) {
			System.out.println("m is bigger...");
		}
		
		// initialisation of wrapper class arrays
		Integer[] intArray = {2, 3, 4, 5, new Integer(99)};
		System.out.println(Arrays.toString(intArray));
	}

}
