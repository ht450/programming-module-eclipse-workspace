/**
 * 
 */
package exercise.extra;

/**
 * @author Hugh
 *
 */
public abstract class Employee {

	private String firstName;
	private String lastName;

	/**
	 * default constructor
	 */
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * constructor with args
	 * 
	 * @param firstName
	 * @param lastName
	 */
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

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
	 * method that displays all the info about the employee
	 */
	public void displayAll() {
		System.out.println("First Name : " + firstName);
		System.out.println("Last Name : " + lastName);
	}

}
