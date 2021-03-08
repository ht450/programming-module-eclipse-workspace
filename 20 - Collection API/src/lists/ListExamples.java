package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {
	
	public static void main(String[] args) {
		
		ArrayList<String> citiesArr = new ArrayList<String>();
		citiesArr.add("Berlin");
		citiesArr.add("London");
		
		LinkedList<String> citiesLin = new LinkedList<String>();
		citiesLin.add("Madrid");
		citiesLin.add("Jakarta");
		
	}
	
	public static void showAll(List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
	}

}
