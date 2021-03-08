package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SpanishTranslators {

	public static void main(String[] args) {
		
		Map<String, String> translator = new HashMap<String, String>();
		
		// add a key value pair
		translator.put("Hello", "Hola");
		translator.put("Thanks", "Gracias");
		translator.put("Bye", "Adios");
		translator.put("Good morning", "Buenos dias");
		
		// accessing the keys
		System.out.println(translator.keySet());
		
		Set<String> keys = translator.keySet();
		
		for(String key : keys) {
			System.out.println(key);
		}
		
		System.out.println(translator.get("Bye"));
		
		// show all
		for(String key : translator.keySet()) {
			System.out.println(key+" : "+translator.get(key));
		}
		
	}
}
