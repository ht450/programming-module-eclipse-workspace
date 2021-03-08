/**
 * 
 */
package arraylist.examples;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author Hugh
 *
 */
public class FirstExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// creation of arraylist
		ArrayList<String> items = new ArrayList<String>();
		
		// adding items to arraylist
		items.add("Apples");
		items.add("Oranges");
		
		//print arraylist
		System.out.println(items.toString());
		
		/*
		// arrays revision
		int[] weeArray = {2,3,4,5,65,6,76};
		System.out.println(weeArray.toString()); // bit odd ?
		System.out.println(Arrays.toString(weeArray)); // works better
		*/
		
		// overload method
		items.add(0, "Pears");
		System.out.println(items.toString());
		
		// how big is the array list
		System.out.println(items.size());
		
		// another way to print elements or access individually
		System.out.println("Printing...");
		for (int loop=0; loop<items.size(); loop++) {
			System.out.println(items.get(loop));
		}
		System.out.println();
		// or enhanced for loop (remember: it's read only)
		for (String s : items) {
			System.out.println(s);
		}
		System.out.println();
		
		// iterator
		System.out.println("Iterator...");
		Iterator<String> it = items.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		// search for
		items.add("Pears");
		if (items.contains("Pears")) { // .contains only tells you yes or no, not the amount
			System.out.println("Nice Pear!"); 
		}
		
		// gets and sets
		
		// get element
		System.out.println("Elements at 2nd position "+items.get(1));
		
		// set element at specified position
		items.set(1, "Peach"); // unlike add, set will override
		System.out.println(items.toString());
		
		// sorting
		System.out.println("Sorting...");
		Collections.sort(items);
		System.out.println(items.toString());
		
		// removal - example of an OVER LOADED method!
		items.remove("Peach");
		System.out.println(items.toString());
		
		items.remove(0);
		System.out.println(items.toString());
		
		// clear all
		items.clear();
		System.out.println(items.size());
		
	}//main

}//class
