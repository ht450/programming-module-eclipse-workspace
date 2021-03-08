/**
 * 
 */
package arraylist.examples;

import java.util.ArrayList;

/**
 * @author Hugh
 *
 */
public class PairProg_Merging {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		 ArrayList<String> creditableSingersList = new ArrayList<String>();
		 creditableSingersList.add("Jimmy Page");
		 creditableSingersList.add("Bono");
		 creditableSingersList.add("Johnny Rotten");
		
		 ArrayList<String> croonersList = new ArrayList<String>();
		 croonersList.add("Taylor Swift");
		 croonersList.add("Daniel O'Donnel");
		 croonersList.add("Nathan Carter");
		
		 //Good Singers
		 System.out.println("Good Singers:");
		 viewAllSingers(creditableSingersList);
		 
		 System.out.println();
		 
		 //Bad Singers
		 System.out.println("Bad Singers");
		 viewAllSingers(croonersList);
		
		//Commented out because using method to print instead 
		  for (int loop = 0; loop < creditableSingersList.size(); loop++) {
		  	System.out.println(creditableSingersList.get(loop));
		  }
		
			for (int loop = 0; loop < croonersList.size(); loop++) {
		  	System.out.println(croonersList.get(loop));
		  }
		
	}//main


	/**
	 * Method to print an Array List
	 * @param singers
	 */
	public static void viewAllSingers (ArrayList<String> singers) {
		for (String singer:singers) {
			System.out.println(singer);
		}
	}

}//class
