package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsClassReverseSort {
	public static void main(String[] args) {
		String[] suits = {"Hearts","Diamonds","Clubs","Spades","Jokers"};
		
		// Create and display a list containing the suits array elements
		List<String> list = Arrays.asList(suits); // create List
		System.out.println(list.toString());
		
		// or (printf revision)
		System.out.printf("Unsorted array elements: %s\n", list);
		
		// sort ArrayList
		Collections.sort(list, Collections.reverseOrder());
		
		// output list
		System.out.printf("Sorted array elements: %s\n", list);
	}
}
