/**
 * 
 */
package loops;

import java.util.Scanner;

/**
 * Class asking a user for their full name and 'encoding' it with *'s
 * This method changes the name string itself, rather than just printing out *'s to resemble the layout of the string (like asked to do)
 * @author Hugh
 *
 */
public class Ex4_ForEncoder {

	/**
	 * main method asking user for their name and encoding it
	 * @param args
	 */
	public static void main(String[] args) {
		
		String userName, replaceString="";
		char replace;
		Scanner scanner = new Scanner(System.in);
		
		//prompt user for full name
		System.out.println("Please enter your full name:");
		userName = scanner.nextLine();
		
		//using a FOR loop
		//replace all characters in the name with * (ignore spaces)
		System.out.println(userName);
		
		for (int count=0; count < userName.length() ; count++) {
			System.out.println();
			System.out.println("Start "+count+" "+userName);
			
			//pick letter to replace
			replace = userName.charAt(count);
			System.out.println("Letter char \t"+replace);
			//ignore spaces
			if (replace==' ' || replace=='*') {
				continue;
			}
			//convert char to string
			replaceString = String.valueOf(replace);
			//replace letter with *
			System.out.println("Letter string \t"+replaceString);
			userName = userName.replace(replaceString, "*");
			
			System.out.println("End "+count+" "+userName);
		}//end of FOR
		
		System.out.println();
		System.out.println(userName);
		
		scanner.close();
	}// end of main method

}
