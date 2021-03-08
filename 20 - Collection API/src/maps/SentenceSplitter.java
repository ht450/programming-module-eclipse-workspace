package maps;

import java.util.HashMap;
import java.util.Map;

public class SentenceSplitter {

	public static void main(String[] args) {

		String sentence = "to be or not to be";
		// create HashMap
		Map<String, Integer> myMap = new HashMap<String, Integer>();

		// tokenise the input
		String[] tokens = sentence.split(" ");

		// processing input text
		for (String token : tokens) {
			if (myMap.containsKey(token)) {
				int count = myMap.get(token);
				// increase the count for this word
				myMap.put(token, count + 1);
			} else {
				// add the new word with a count of 1 to map
				myMap.put(token, 1);
			}
		}
		
		System.out.println("\nMap contains:\nKey\t\tValue");
		// display all the map content
		for (String key: myMap.keySet()) {
			System.out.println(key+"\t\t"+myMap.get(key));
		}
		
		//display a value based on a key
		if (myMap.containsKey("not")) {
			System.out.println("Value for key \"not\" : "+myMap.get("not"));
		} else {
			
		}

	}
}
