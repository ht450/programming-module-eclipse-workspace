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
	 * @param baseRate
	 */
	public Employee(String firstName, String lastName, double baseRate) {
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
	 * method that prints this employee's weekly salary
	 * 
	 * @param hours
	 */
	public void calculateWeeklySalary(double hours) {
		System.out.println("Weekly Salary : £" + this.baseRate*hours);
	}
	
	/**
	 * method that prints all the instance vars for this employee's
	 */
	public void printAll() {
		System.out.println("First Name : " + firstName);
		System.out.println("Last Name : " + lastName);
		System.out.println("Base Rate : " + baseRate);
	}
}
