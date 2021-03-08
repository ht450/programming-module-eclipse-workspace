/**
 * 
 */
package wrap;

/**
 * @author Hugh
 *
 */
public class ComparingNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer intW1 = new Integer(3);
		Integer intW2 = new Integer(100);
		
		// one way to do it
		if (intW1.equals(intW2)) {
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}
		
		// another way... READ JAVADOC OF METHOD
		System.out.println(intW1.compareTo(intW2));
	}

}
