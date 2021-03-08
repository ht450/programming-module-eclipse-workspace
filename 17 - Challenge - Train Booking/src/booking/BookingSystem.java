/**
 * 
 */
package booking;

/**
 * @author Hugh
 *
 */
public class BookingSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// create train
		Train train = new Train(5);
		
		// create the carriages (capacity and class)
		Carriage c1 = new Carriage(2, PassengerClass.FIRST);
		Carriage c2 = new Carriage(3, PassengerClass.SECOND);
		Carriage c3 = new Carriage(1, PassengerClass.SECOND);
		Carriage c4 = new Carriage(1, PassengerClass.SECOND);
		
		// add the carriages to the train
		train.addCarriage(c1);
		train.addCarriage(c2);
		train.addCarriage(c3);
		train.addCarriage(c4);
		
		train.showAllDetails();
		
		// create and some passengers - where they each end up on the train will depend on the class and current capacity of the carriages 
		Passenger p1 = new Passenger(1010, "Liz","Queen",PassengerClass.FIRST);
		Passenger p2 = new Passenger(1011, "Charles","Wales",PassengerClass.FIRST);
		Passenger p3 = new Passenger(1012, "Megan","Canada",PassengerClass.SECOND);
		Passenger p4 = new Passenger(1013, "Andrew","The Younger",PassengerClass.SECOND);
		Passenger p5 = new Passenger(1014, "Harry","The Red",PassengerClass.SECOND);
		Passenger p6 = new Passenger(1015, "Mrs","Brown",PassengerClass.FIRST);
		
		train.addPassenger(p1);
		train.addPassenger(p2);
		train.addPassenger(p3);
		train.addPassenger(p4);
		train.addPassenger(p5);
		train.addPassenger(p6);
		
		// show the current booking list
		train.showAllDetails();
		
		
		
	}

}
