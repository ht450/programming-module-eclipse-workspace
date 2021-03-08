/**
 * 
 */
package practical;

/**
 * @author Hugh
 *
 */
public class WhaleWatcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Whale w1 = new Whale("Right", "Atlantic", 135, 21, 16);
		Whale w2 = new Whale("Blue", "Pacific", 173, 23, 25);
		Whale w3 = new Whale("Sperm", "Atlantic", 41, 20, 15);
		Whale w4 = new Whale("Humpback", "Southern", 30, 13, 13);

		Whale[] whales = { w1, w2, w3, w4 };

		displayAll(whales);

		searchByOcean(whales, "Atlantic");

		fastest(whales);

		averageLength(whales);
		
		heaviest(whales);
		
		
	}

	/**
	 * method that displays all details from a Whale[]
	 * 
	 * @param whales
	 */
	public static void displayAll(Whale[] whales) {
		for (Whale whale : whales) {
			System.out.println(whale.toString());
		}
	}

	/**
	 * method that prints out the names of the whales whose main ocean matches the
	 * search
	 * 
	 * @param whales
	 * @param ocean
	 */
	public static void searchByOcean(Whale[] whales, String ocean) {
		for (Whale whale : whales) {
			if (whale.getMainOcean() == ocean) {
				System.out.println(whale.getName());
			}
		}
	}

	/**
	 * method prints out the name of the fastest whale from a Whale[]
	 * 
	 * @param whales
	 */
	public static void fastest(Whale[] whales) {
		Whale fastestWhale = whales[0];
		for (Whale whale : whales) {
			if (whale.getMaxSpeed() > fastestWhale.getMaxSpeed()) {
				fastestWhale = whale;
			}
		}
		System.out.println(fastestWhale.getName());
	}

	/**
	 * method prints out the average length of whale from a whale[]
	 * 
	 * @param whales
	 */
	public static void averageLength(Whale[] whales) {
		double totalLength = 0;
		for (Whale whale : whales) {
			totalLength += whale.getLength();
		}
		double avgLength = totalLength / whales.length;
		System.out.println("Average Length: " + avgLength+"m");
	}
	
	/**
	 * method prints out the name of the heaviest whale from a Whale[]
	 * 
	 * @param whales
	 */
	public static void heaviest(Whale[] whales) {
		Whale heaviestWhale = whales[0];
		for (Whale whale : whales) {
			if (whale.getWeight() > heaviestWhale.getWeight()) {
				heaviestWhale = whale;
			}
		}
		System.out.println(heaviestWhale.getName());
	}

}
