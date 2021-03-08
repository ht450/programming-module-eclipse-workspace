package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsClassMinMax {

	public static void main(String[] args) {
		// create the list of random numbers
		List<Integer> numbers = new ArrayList<Integer>();
		
		for (int loop = 0; loop < 10; loop++) {
			numbers.add(new Random().nextInt(100));
		}
		System.out.println(numbers);

		// get the min and max values
		System.out.println("Min Value : " + Collections.min(numbers));
		System.out.println("Max Value : " + Collections.max(numbers));
	}
}
