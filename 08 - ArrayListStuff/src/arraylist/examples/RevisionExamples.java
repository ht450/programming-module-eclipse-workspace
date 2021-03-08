/**
 * 
 */
package arraylist.examples;

import java.util.ArrayList;

/**
 * @author Hugh
 *
 */
public class RevisionExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// instantiated the object
		ArrayList<String> lister = new ArrayList<String>();
		
		lister.add("One");
		lister.add("Two");
		lister.add("Three");
		
		lister.add(1, "Four");
		
		System.out.println(lister.toString());
		
		lister.size(); // .size is an attribute of the object
		
		
	}//main

}//class
