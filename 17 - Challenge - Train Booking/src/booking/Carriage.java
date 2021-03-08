/**
 * 
 */
package booking;

import java.util.ArrayList;

/**
 * @author Hugh
 *
 */
public class Carriage {

	private int maxPassengers;
	private ArrayList<Passenger> passengers;
	private PassengerClass passengerType;
	
	public Carriage() {
		passengers = new ArrayList<Passenger>();
	}
	
	public Carriage(int maxPassengers, PassengerClass passengerType) {
		this.setMaxPassengers(maxPassengers);
		this.setPassengerType(passengerType);
		passengers = new ArrayList<Passenger>();
	}
	
	public void addPassenger(Passenger passenger) {
		
		if(currentPassengers() >= getMaxPassengers()) {
			// can't add
		} else {
			this.passengers.add(passenger);			
		}
	}
	
	public boolean carriageFull() {
		return currentPassengers() == this.maxPassengers;
	}
	
	public int currentPassengers() {
		return this.passengers.size();
	}
	
	public void displayAll() {
		
		System.out.println("Max passengers : "+this.maxPassengers);
		System.out.println("Class          : "+this.getPassengerType());
		System.out.println("Current passengers : "+this.passengers.size());
		
		for(Passenger passenger : passengers) {
			System.out.println(passenger.toString());
		}
	}

	/**
	 * @return the maxPassengers
	 */
	public int getMaxPassengers() {
		return maxPassengers;
	}

	/**
	 * @return the passengerType
	 */
	public PassengerClass getPassengerType() {
		return passengerType;
	}

	/**
	 * @param maxPassengers the maxPassengers to set
	 */
	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}

	/**
	 * @param passengerType the passengerType to set
	 */
	public void setPassengerType(PassengerClass passengerType) {
		this.passengerType = passengerType;
	}
	
	
	
	
}
