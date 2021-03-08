package sets;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {

	public static void main(String[] args) {
		
		// Create and display a List<String>
		String[] colours = {"Black", "White", "Yellow", "Red", "Red", "Black"};
		List<String> list = Arrays.asList(colours);
		System.out.println("List: "+list);
		
		// eliminate duplicates then print unique values
		printNonDuplicates(list);
		
	}

	private static void printNonDuplicates(Collection<String> values) {
		// create a HashSet
		Set<String> set = new HashSet<String>(values);
		System.out.print("\nNonduplicates are: ");
		
		for (String value : set) {
			System.out.printf("%s ",value);
		}
		
		System.out.println();
	}
}
