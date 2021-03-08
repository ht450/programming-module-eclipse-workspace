/**
 * 
 */
package practical;

/**
 * @author Hugh
 *
 */
public class CarSales {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car c1 = new Car("Ford", "Fiesta", "Blue", 4, 1.2, 110);
		Car c2 = new Car("Peugeot", "308", "Red", 4, 1.8, 130);
		Car c3 = new Car("Ferrari", "F4", "Red", 2, 2.8, 230);
		
		c1.startCar();
//		c1.stopCar();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
	}

}
