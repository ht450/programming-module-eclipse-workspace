/**
 * 
 */
package wages.manager;

/**
 * @author Hugh
 *
 */
public class Employee {

	private String firstName;
	private String lastName;
	private double basePay = 20.00;
	
	/**
	 * 
	 */
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param basePay
	 */
	public Employee(String firstName, String lastName, double basePay) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.basePay = basePay;
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
	 * @return the basePay
	 */
	public double getBasePay() {
		return basePay;
	}

	/**
	 * @param basePay the basePay to set
	 */
	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}
	
	public void calWeeklyWage(int hours) {
		double wages = hours * this.basePay;
		System.out.println("Employee wages "+this.firstName+" "+this.lastName+ " £"+wages);
	}
	

}
