/**
 * 
 */
package constructor;

/**
 * @author Hugh
 *
 */
public class Footballer {
	
	// instance vars
	private String firstName;
	private String lastName;
	private int squadNumber;
	private int employeeNumber;
	
	// constructors
	/**
	 * default constructor
	 */
	public Footballer() {
		
	}
	
	/**
	 * constructor that takes and sets all fields
	 * @param firstName
	 * @param lastName
	 * @param squadNumber
	 * @param employeeNumber
	 */
	public Footballer(String firstName, String lastName, int squadNumber, int employeeNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.squadNumber = squadNumber;
		this.employeeNumber = employeeNumber;
	}
	
	// overloading the constructor
	/**
	 * Constructor that will default the squad number to 0
	 * @param firstName
	 * @param lastName
	 * @param employeeNumber
	 */
	public Footballer(String firstName, String lastName, int employeeNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeNumber = employeeNumber;
		this.squadNumber = 0; // can set it later
	}
	
	// methods
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the squadNumber
	 */
	public int getSquadNumber() {
		return squadNumber;
	}
	/**
	 * @param squadNumber the squadNumber to set
	 */
	public void setSquadNumber(int squadNumber) {
		this.squadNumber = squadNumber;
	}
	/**
	 * @return the employeeNumber
	 */
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	/**
	 * @param employeeNumber the employeeNumber to set
	 */
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
}
