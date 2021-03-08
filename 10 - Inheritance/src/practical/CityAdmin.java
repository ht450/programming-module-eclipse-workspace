/**
 * 
 */
package practical;

/**
 * @author Hugh
 *
 */
public class CityAdmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		City c1 = new City("Beijing", 11, true, "China");
		City c2 = new City("Madrid", 5, true, "Spain");
		City c3 = new City("Rome", 6, true, "Italy");
		City c4 = new City("New York", 8, false, "USA");
		City c5 = new City("Washington", 2, true, "USA");
		City c6 = new City("Dallas", 3, false, "USA");

		City[] cities = { c1, c2, c3, c4, c5, c6 };

		displayAll(cities);

		System.out.println(smallestPop(cities));

		capitalCities(cities);

		searchByCountry(cities, "USA");
		
		averagePop(cities);

	}

	/**
	 * method that prints out the details of the cities from an array
	 * 
	 * @param cities
	 */
	public static void displayAll(City[] cities) {
		for (City city : cities) {
			System.out.println(city.toString());
		}
	}

	/**
	 * returns the smallest population from an array of City's
	 * 
	 * @param cities
	 * @return
	 */
	public static int smallestPop(City[] cities) {
		int smallestPop = cities[0].getPopulation();
		for (City city : cities) {
			if (city.getPopulation() < smallestPop) {
				smallestPop = city.getPopulation();
			}
		}
		return smallestPop;
	}

	/**
	 * method prints a list of cities that are capitals
	 * 
	 * @param cities
	 */
	public static void capitalCities(City[] cities) {
		for (City city : cities) {
			if (city.isCountryCapital()) {
				System.out.println(city.getCityName() + " is the capital of " + city.getCountry());
			}
		}
	}

	/**
	 * method prints a list of cities in the search country
	 * 
	 * @param cities
	 * @param country
	 */
	public static void searchByCountry(City[] cities, String country) {
		for (City city : cities) {
			if (city.getCountry() == country) {
				System.out.println(city.getCityName());
			}
		}
	}

	/**
	 * method prints the average population of all the cities in a City array
	 * @param cities
	 */
	public static void averagePop(City[] cities) {
		double totalPop=0;
		for (City city : cities) {
			totalPop += city.getPopulation();
		}
		double avgPop = totalPop / cities.length;
		System.out.printf("Average Population: %.2f million\n", avgPop);
	}
}
