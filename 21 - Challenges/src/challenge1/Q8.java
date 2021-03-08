package challenge1;


import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Q8 {

	public static void main(String[] args) {
		
		List<Integer> numbers = new LinkedList<Integer>();

		// TODO : auto add ten random numbers between 1 - 10 to the list
		for(int loop=0; loop<10;loop++) {
			numbers.add(new Random().nextInt(10) + 1);
		}
		
		// TODO : sort 
		Collections.sort(numbers);
		
		// TODO : print list
		System.out.println(numbers.toString());

		// TODO : remove any duplicates 
		Set<Integer> numbersSet = new HashSet<Integer>(numbers);

		// TODO : print list (without the duplicates)
		System.out.println(numbersSet.toString());
	}
}
