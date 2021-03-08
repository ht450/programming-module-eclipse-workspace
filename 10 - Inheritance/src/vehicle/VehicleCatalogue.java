/**
 * 
 */
package vehicle;

/**
 * @author Hugh
 *
 */
public class VehicleCatalogue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car c1 = new Car("Ford", "Diesel", 4);
		Ship s1 = new Ship("Boaty", "Diesel", 1200);
		
		System.out.println(c1.toString());
		System.out.println(s1.toString());
		
	}

}
