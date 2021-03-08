/**
 * 
 */
package practical;

/**
 * @author Hugh
 *
 */
public abstract class Employee {

	private String firstName;
	private String lastName;
	private double baseRate;
	
	/**
	 * 
	 */
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 */
	public Employee(String firstName, String lastName, double baseRate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.baseRate = baseRate;
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
	 * @return the baseRate
	 */
	public double getBaseRate() {
		return baseRate;
	}

	/**
	 * @param baseRate the baseRate to set
	 */
	public void setBaseRate(double baseRate) {
		this.baseRate = baseRate;
	}
	
	/**
	 * abstract method for calculating weekly salary
	 * @param hours
	 */
	public abstract void calculateWeeklySalary(double hours);

	/**
	 * method for printing all the details of the employee
	 * @return
	 */
	public void printAll() {
		System.out.println("Employee [firstName=" + firstName + ", lastName=" + lastName + ", baseRate=" + baseRate + "]");
	}
	
	

}
