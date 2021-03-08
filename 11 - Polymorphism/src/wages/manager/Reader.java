/**
 * 
 */
package wages.manager;

/**
 * @author Hugh
 *
 */
public class Reader extends Employee {

	private String department;
	
	/**
	 * 
	 */
	public Reader() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param basePay
	 */
	public Reader(String firstName, String lastName, double basePay, String department) {
		super(firstName, lastName, basePay);
		this.department = department;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * method takes weekly hours worked and prints weekly wages
	 */
	@Override
	public void calWeeklyWage(int hours) {
		double wages = hours * this.getBasePay() * 1.2;
		System.out.println("Employee wages "+this.getFirstName()+" "+this.getLastName()+ " £"+wages);
	}
	
}
