package maps;

import java.util.Map;
import java.util.TreeMap;

public class SortedMap {

	public static void main(String[] args) {
		
		// create a TreeMap (implements the SortedMap interface)
		Map<Integer, String> mySortedMap = new TreeMap<Integer, String>();
		
		// add the keys and values
		mySortedMap.put(4, "four");
		mySortedMap.put(3, "three");
		mySortedMap.put(2, "two");
		mySortedMap.put(5, "five");
		mySortedMap.put(1, "one");
		
		// get the keyset and output the values
		for (Integer key : mySortedMap.keySet()) {
			System.out.println(key+" "+mySortedMap.get(key));
		}
		
	}
}
