/**
 * 
 */
package booking;

/**
 * @author Hugh
 *
 */
public class Passenger {
	
	private int ID;
	private String firstName;
	private String surname;
	private PassengerClass passengerClass;
	
	public Passenger() {
		// TODO Auto-generated constructor stub
	}

	public Passenger(int id, String firstName, String surname, PassengerClass passengerClass) {
		this.ID = id;
		this.firstName = firstName;
		this.surname = surname;
		this.passengerClass = passengerClass;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @return the passengerClass
	 */
	public PassengerClass getPassengerClass() {
		return passengerClass;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * @param passengerClass the passengerClass to set
	 */
	public void setPassengerClass(PassengerClass passengerClass) {
		this.passengerClass = passengerClass;
	}

	@Override
	public String toString() {
		return "Passenger [ID="+ ID + ", firstName=" + firstName + ", surname=" + surname + ", passengerClass="
		+ passengerClass + "]";
		
	}
	
}
