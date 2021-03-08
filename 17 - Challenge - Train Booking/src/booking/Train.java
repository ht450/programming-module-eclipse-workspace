/**
 * 
 */
package booking;

import java.util.ArrayList;

/**
 * @author Hugh
 *
 */
public class Train {

	private int maxNumberOfCarriages;
	private ArrayList<Carriage> carriages;

	public Train(int maxNumberOfCarriages) {
		this.maxNumberOfCarriages = maxNumberOfCarriages;
		carriages = new ArrayList<Carriage>();
	}
	
	public void addCarriage(Carriage carriage) {
		
		if( this.carriages.size() >= this.maxNumberOfCarriages) {
			// can't add any more
			System.out.println("Sorry can't add any more carriages!");
		} else {
			this.carriages.add(carriage);
		}

	}

	public void addPassenger(Passenger passenger) {

		boolean boardedTrain = false;
		
		// first class
		if(passenger.getPassengerClass() == PassengerClass.FIRST) {
			// go through only first class carriages
			for (Carriage carriage : this.carriages) {
				if(carriage.getPassengerType().equals(PassengerClass.FIRST) && !carriage.carriageFull()) {
					// add passenger
					carriage.addPassenger(passenger);
					System.out.println("Passenger boarded");
					boardedTrain = true;
					break;
				}
			}			
		}
		
		// if they haven't boarded yet, try second class carriages
		// second class passengers will go straight to here
		if (!boardedTrain) {
			for (Carriage carriage : this.carriages) {
				if(carriage.getPassengerType().equals(PassengerClass.SECOND) && !carriage.carriageFull()) {
					// add passenger
					carriage.addPassenger(passenger);
					System.out.println("Passenger boarded");
					boardedTrain = true;
					break;
				}
			}
		}
		
		if (!boardedTrain) {
			System.out.println("Sorry, train full, wait for the next one.");
		}
	}

	public int getTotalCurrentPassengers() {
		
		int totalPassengers = 0;
		
		for (Carriage carriage : this.carriages) {
			totalPassengers += carriage.currentPassengers();
		}
		
		return totalPassengers;

	}

	public int getTrainMaxCapacity() {

		int totalCapacity = 0;
		
		for (Carriage carriage : this.carriages) {
			totalCapacity += carriage.getMaxPassengers();
		}
		
		return totalCapacity;
		
	}
	
	public void showAllDetails() {
		System.out.println();
		System.out.println("Train details __________________________");
		System.out.println("Number of carriages      : " + carriages.size());
		System.out.println("Train max capacity       : " + this.getTrainMaxCapacity());
		System.out.println("Train current passengers : " + this.getTotalCurrentPassengers());
		
		for (Carriage carriage : this.carriages) {
			System.out.println("\nCarriage "+this.carriages.indexOf(carriage)+" of "+this.carriages.size());
			carriage.displayAll();			
		}
		System.out.println();
		
	}

}
