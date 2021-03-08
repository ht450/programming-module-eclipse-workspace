package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsClassSearch {

	public static void main(String[] args) {
		int searchIndex = 0;
		String[] countries = { "Italy", "France", "USA", "New Zealand" };

		// create and display a list containing the countries array elements
		List<String> list = Arrays.asList(countries); // create list
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		searchIndex = Collections.binarySearch(list, "USA");
		System.out.println(searchIndex);
	}
}
