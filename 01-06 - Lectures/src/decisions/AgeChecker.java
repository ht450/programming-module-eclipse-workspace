/**
 * 
 */
package decisions;

/**
 * @author Hugh
 *
 */
public class AgeChecker {

	/**
	 * class to check if someone is over 70
	 * @param args
	 */
	public static void main(String[] args) {
		// create a var to hold an Age
		int age;
		age = 70;
		
		// check if the age is over 70
		
		// if so output you are old
		if (age >= 70) {
			System.out.println("you are old");
		}

		// if not output you are young
		if (age < 70) {
			System.out.println("you are young");
		}
		
	}

}
