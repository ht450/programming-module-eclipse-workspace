package sets;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetStuff {

	public static void main(String[] args) {
		
		// create the sorted set implementation
		SortedSet<String> sortedSet = new TreeSet<String>();
		
		sortedSet.add("Zidane");
		sortedSet.add("Messi");
		sortedSet.add("Pele");
		
		// show all - naturally ordered
		for(String name : sortedSet) {
			System.out.println(name);
		}
		
		// show first and last
		System.out.println("First : "+sortedSet.first());
		System.out.println("Last : "+sortedSet.last());
		
		// remove an element
		sortedSet.remove("Messi");
		// show now
		for(String name : sortedSet) {
			System.out.println(name);
		}
	}
}
