/**
 * 
 */
package challenges.week7;

/**
 * class that contains the solutions to the week 7 reading week daily coding
 * challenge for Friday 1st
 * 
 * @author Hugh
 *
 */
public class Fri_BookCipher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 2D array of strings with hidden message
		String message[][] = { 
				{ "Buzz", "LightYear", "was" }, 
				{ "once", "apon", "a" }, 
				{ "time", "probably", "the " },
				{ "coolest", "character", "in", "Toy", "Story 2" }, 
				{ "but ", "Woody " },
				{ "was ", "always ", "Andy's ", "wow" }, 
				{ "toy.", "i" }, 
				{ "was", "never", "keen" },
				{ "because ", "I ", "don't " }, 
				{ "rate", "Tom", "Hanks.", "Woody ", "is", "quite", "dour" },
				{ "but", " Lightyear,", "could fly, sort of...", "Anyhow" }, 
				{ "the", "movies", "are", "classic" } 
				};

		String lastWord="", hiddenMessage="";
		char lastChar;
		
		// print array values
//		print2DStringArray(message);
		
		// extract the last char in the last word in each row
		// loop over the rows
		for (int rows=0; rows<message.length ; rows++ ) {
			// select last word and pass to a var
			lastWord = message[rows][message[rows].length-1];
			//System.out.println(rows+" "+lastWord);
			// select last letter and add to hidden message
			lastChar = lastWord.charAt(lastWord.length()-1);
			hiddenMessage += Character.toString(lastChar);
		}//rows loop
		
		// print message to screen in uppercase
		System.out.println(hiddenMessage.toUpperCase());

	}// main
	
	/**
	 * a method that takes a 2D String array and prints it to screen
	 * @param a2DArray
	 */
	public static void print2DStringArray(String[][] a2DArray) {
		//show the values in the 2D array
		for (int row=0 ; row<a2DArray.length; row++) {
			for (int col=0; col<a2DArray[row].length; col++) {
				System.out.print(a2DArray[row][col]+" ");
			}//end of col FOR
			System.out.println();
		}//end of row FOR
	}//print2DStringArray method

}// class
