/**
 * 
 */
package three.extra;

/** checks whether a letter is a vowel or consonant
 * @author Hugh
 *
 */
public class Problem3_VowelChecker {

	/** main method for checking letters and printing result
	 * @param args
	 */
	public static void main(String[] args) {
		String letter, letterType;
		System.out.println("Please enter a single letter...");
		letter = "x";
		
		switch (letter) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
				//System.out.println("Vowel");
				letterType = "Vowel";
				break;
			case "b":
			case "c":
			case "d":
			case "f":
			case "g":
			case "h":
			case "j":
			case "k":
			case "l":
			case "m":
			case "n":
			case "p":
			case "q":
			case "r":
			case "s":
			case "t":
			case "v":
			case "w":
			case "x":
			case "y":
			case "z":
				//System.out.println("Consonant");
				letterType = "Consonant";
				break;
			default:
				//System.out.println("Invalid");
				letterType = "Invalid";
		}//end of switch
		
		System.out.println("Your entry was: "+letterType);
		
	}//main method

}
