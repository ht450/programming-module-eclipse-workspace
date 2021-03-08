package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassShuffle {
	
	public static void main(String[] args) {
		
		// create an arraylist of ints
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);

		// shuffle the list of numbers
		Collections.shuffle(list);
		System.out.println(list);
		
	}
}
