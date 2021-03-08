/**
 * 
 */
package practical;

/**
 * @author Hugh
 *
 */
public class AirTrafficControl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Flight f1 = new Flight("ESY3214", "Belfast", "Amsterdam", 2.2);
		Flight f2 = new Flight("BA127", "London Heathrow", "Cape Town", 11.5);
		Flight f3 = new Flight("AE999", "Dublin", "New York JFK", 7.5);
		Flight f4 = new Flight("AE678", "Dublin", "Newark", 8.5);
		Flight f5 = new Flight("AUS12", "Beijing", "Paris", 18.1);

		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());
		System.out.println(f4.toString());
		System.out.println(f5.toString());

		Flight[] flights = { f1, f2, f3, f4, f5 };

		System.out.println(flights[2].getFlightNumber());

		for (int loop = 0; loop < flights.length; loop++) {
			System.out.println(flights[loop].toString());
		}

		System.out.println(longestFlight(flights).getDuration());
		destinationSearch(flights, "Dublin");

	}// main

	/**
	 * returns the longest Flight (as a Flight object) from an array of Flight objects
	 * @param flights
	 * @return
	 */
	public static Flight longestFlight(Flight[] flights) {
		Flight longestFlight = flights[0];
		for (int loop = 0; loop < flights.length; loop++) {
			if (flights[loop].getDuration() > longestFlight.getDuration()) {
				longestFlight = flights[loop];
			}
		}
		return longestFlight;
	}

	/**
	 * prints the flight numbers of flights that match the destination search
	 * @param flights
	 * @param destination
	 */
	public static void destinationSearch(Flight[] flights, String destination) {
		for (int loop = 0; loop < flights.length; loop++) {
			if (flights[loop].getDestination() == "Dublin") {
				System.out.println(flights[loop].getFlightNumber());
			}
		}
	}

}
