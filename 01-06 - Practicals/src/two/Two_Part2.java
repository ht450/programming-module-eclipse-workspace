/**
 * 
 */
package two;

/**
 * @author Hugh
 *
 */
public class Two_Part2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String myName ;
		myName = "Hugh Tiernan";
		
		System.out.println("Input string: "+myName);
		System.out.println("Number of characters in string: "+myName.length());
		System.out.println("The first two characters in the string are: "+myName.substring(0, 2));
		System.out.println("The third character is: "+myName.charAt(2));
		System.out.println("The string in uppercase is: "+myName.toUpperCase());
		System.out.println("The string with letter n replaced with %: "+myName.replace("n","%"));
		System.out.println("First position of 'u': "+myName.indexOf("u")+"\nLast position of 'a': "+myName.lastIndexOf("a")); //if you don't add the space between the program thinks you are adding the integers
	}

}
