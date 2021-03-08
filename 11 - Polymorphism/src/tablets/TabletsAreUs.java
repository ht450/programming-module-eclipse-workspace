package tablets;

import java.util.ArrayList;

public class TabletsAreUs {

	public static void main(String[] args) {

		// simulating a few tablets
		Tablet t1 = new Tablet("Apple", "iPad", 338.94, false, 10.2,
				"10.2 inch Retina display A10 Fusion chip Up to 10 hours of battery life");
		Tablet t2 = new Tablet("Apple", "iPad Air", 449.00, false, 10.5,
				"10.5 inch 10.5-inch Retina display with ProMotion, True Tone and wide colour, Up to 20 hours of battery life ");
		Tablet t3 = new Tablet("Google", "Fire", 79.99, true, 8, "8 inch display 10 hours of battery life");
		Tablet t4 = new Tablet("Samsung", "Galazy Tab", 180.00, true, 10.1,
				"10.1 inch  Entertainment for All: Designed with the whole family in mind, the Galaxy Tab A has what it takes to keep everyone happy. 5 hours battery.  ");
		Tablet t5 = new Tablet("Vankyo", "MatrixPad", 69.99, true, 7,
				"7-inch display Full-Featured Android Tablet with Eye Care for Kids Up to 4 hours of battery life");

		// adding to an arraylist
		ArrayList<Tablet> tablets = new ArrayList<Tablet>();
		tablets.add(t1);
		tablets.add(t2);
		tablets.add(t3);
		tablets.add(t4);
		tablets.add(t5);

		// show all in stock
		printStockList(tablets);

		// exercising a few searches
		// 1. all screen sizes > 10 inches in size
		searchBySize(tablets, 10);

		// 2. all Apple products (over priced!)
		searchByManufacturer(tablets, "Apple");
		
		// 3. all Android tablets
		searchByAndriod(tablets, true);
		
		// 4. note search .. e.g. by key word search (note this is case sensitive)
		searchInNotes(tablets, "battery");

	}

	/**
	 * method prints the model and manufacturers of all tablets
	 * 
	 * @param tablets
	 */
	public static void printStockList(ArrayList<Tablet> tablets) {
		for (Tablet tablet : tablets) {
			System.out.printf("%-10s from %-10s\n", tablet.getModel(), tablet.getManufacturer());
		}
	}

	/**
	 * method searches an arraylist of tablets for and prints any larger than the search size
	 * @param tablets
	 * @param size
	 */
	public static void searchBySize(ArrayList<Tablet> tablets, double size) {
		System.out.printf("\nSearching for all tablet with a screen at least %.2f inches...\n", size);
		for (Tablet tablet : tablets) {
			if (tablet.getSize() >= size) {
				System.out.printf("%-10s from %-10s. Screen: %.2f inches\n", tablet.getModel(), tablet.getManufacturer(), tablet.getSize());
			}
		}
	}

	/**
	 * method searches an arraylist of tablets and prints any made by the searched manufactured
	 * @param tablets
	 * @param manufacturer
	 */
	public static void searchByManufacturer(ArrayList<Tablet> tablets, String manufacturer) {
		System.out.printf("\nSearching for all tablet manufactured by %s...\n", manufacturer);
		for (Tablet tablet : tablets) {
			if (tablet.getManufacturer() == manufacturer) {
				System.out.printf("%-10s\n", tablet.getModel());
			}
		}
	}
	
	/**
	 * method searches an arralylist of tablet and prints any that are/aren't run on the Android OS (depending on the passed boolean)
	 * @param tablets
	 * @param android
	 */
	public static void searchByAndriod(ArrayList<Tablet> tablets, boolean android) {
		System.out.printf("\nSearching for all tablets where Android is %b...\n", android);
		for (Tablet tablet : tablets) {
			if (tablet.isAndroid() == android) {
				System.out.printf("%-10s from %-10s\n", tablet.getModel(), tablet.getManufacturer());
			}
		}
	}
	
	/**
	 * method searched through an arraylist of tablets. Searches through the notes var for the search term and prints it out.
	 * @param tablets
	 * @param searchTerm
	 */
	public static void searchInNotes(ArrayList<Tablet> tablets, String searchTerm) {
		System.out.printf("\nSearching through all notes for '%s'...\n", searchTerm);
		for (Tablet tablet : tablets) {
			if (tablet.getNotes().contains(searchTerm)) {
				System.out.printf("%-10s from %-10s: %s\n", tablet.getModel(), tablet.getManufacturer(), tablet.getNotes());
			}
		}
	}
	
	
}
