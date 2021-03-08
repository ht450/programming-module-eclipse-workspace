/**
 * 
 */
package cars;

import java.util.ArrayList;

/**
 * @author Hugh
 *
 */
public class CarFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create cars
		Car saloon = new FamilySaloon("Ford", "Galaxy", 100, false);
		Car rally = new RallyCar("Subaru", "Imprezza", 400, 7.50);
		Car f1 = new F1("Ferrari", "2019", 800, 6.3);

		// car array
		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(saloon);
		cars.add(rally);
		cars.add(f1);

		// use array to display all
		displayAll(cars);

		// least horsePower (print only model)
		System.out.printf("Lowest Horse Power : %s\n", lowestHorsePower(cars).getModel());
		
		// search by make (print all details)
		searchByMake(cars, "ford");
		
		// average horsePower (print to 2dp)
		System.out.printf("Average Horse Power :  %.2f\n",averageHorsePower(cars));
		
	}

	/**
	 * method prints the details of an array of cars
	 * 
	 * @param cars
	 */
	public static void displayAll(ArrayList<Car> cars) {
		for (Car car : cars) {
			car.displayAll();
			System.out.println();
		}
	}

	/**
	 * method returns the car that has the lowest HP (or the first occurrence of the joint lowest HP)
	 * 
	 * @param cars
	 * @return
	 */
	public static Car lowestHorsePower(ArrayList<Car> cars) {
		int lowestHP = cars.get(0).getHorsePower();
		int index = 0;
		for (Car car : cars) {
			if (car.getHorsePower() < lowestHP) {
				lowestHP = car.getHorsePower();
				index = cars.indexOf(car);
			}
		}
		return cars.get(index);
	}
	
	/**
	 * method displays all details of cars whose make matches the passed term
	 * 
	 * @param cars
	 * @param make
	 */
	public static void searchByMake(ArrayList<Car> cars, String make) {
		System.out.println();
		System.out.println("Searching for Cars that match : "+make);
		for (Car car : cars) {
			if (car.getMake().equalsIgnoreCase(make)) {
				car.displayAll();
				System.out.println();
			}
		}
	}
	
	/**
	 * method returns the average horsePower from an arraylist of cars
	 * @param cars
	 * @return
	 */
	public static double averageHorsePower(ArrayList<Car> cars) {
		double total=0;
		for (Car car : cars) {
			total+=car.getHorsePower();
		}
		return (total/cars.size());
	}
}
