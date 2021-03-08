package maps;

import java.util.HashMap;
import java.util.Map;

public class TelephoneContact {

	public static void main(String[] args) {
		
		Map<String, String> phoneBook = new HashMap<String, String>();
		
		phoneBook.put("Tony", "075396321486");
		phoneBook.put("Fidelma", "087521232521");
		phoneBook.put("Aoife", "078552412512");
		
		// get number
		System.out.println("Number for Aoife "+phoneBook.get("Aoife"));
		
		// get all
		for (String contact : phoneBook.keySet()) {
			System.out.println(contact+" "+phoneBook.get(contact));
		}
		
		// getting Tony's number
		if(phoneBook.containsKey("Tony")) {
			System.out.println("Tony's no. is : "+phoneBook.get("Tony"));
		}
		
	}
}
