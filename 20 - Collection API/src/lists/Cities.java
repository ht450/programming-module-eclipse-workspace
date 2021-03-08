package lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Cities {

	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("London");
		cities.add("Paris");
		
		LinkedList<String> linkedCities = new LinkedList<String>();
		linkedCities.add("Cardiff");
		linkedCities.add("Armagh");
		
		showAll(linkedCities);
		
	}
	
	/**
	 * general
	 */
	public static void showAll(List<String> list) {
		for(String string: list) {
			System.out.println(string);
		}
	}
	
	/**
	 * really general
	 */
	public static void showAll(Collection<String> collection) {
		for(String string: collection) {
			System.out.println(string);
		}
	}

}
