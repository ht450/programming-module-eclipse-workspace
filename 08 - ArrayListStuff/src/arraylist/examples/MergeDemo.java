/**
 * 
 */
package arraylist.examples;

import java.util.ArrayList;

/**
 * @author Hugh
 *
 */
public class MergeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<String> listA = new ArrayList<String>();
		listA.add("One");
		listA.add("Two");
		listA.add("Three");
		
		ArrayList<String> listB = new ArrayList<String>();
		listB.add("Four");
		listB.add("Five");
		listB.add("Two");
		
		System.out.println(listA.toString());
		System.out.println(listB.toString());
		
		// smart coder alert! ... concerned about performance and memory management
		int a, b;
		a = listA.size();
		b = listB.size();
		listA.ensureCapacity(a+b);
		
		//merge the contents of B into A
		for (int loop=0; loop<listB.size(); loop++) {
			if (!listA.contains(listB.get(loop))) {
				listA.add(listB.get(loop));
			}
		}
		
		System.out.println(listA.toString());
		
		
		
	}//main

}//class
