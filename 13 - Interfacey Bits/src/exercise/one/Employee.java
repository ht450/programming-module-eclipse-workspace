/**
 * 
 */
package exercise.one;

/**
 * @author Hugh
 *
 */
public class Employee implements IPayable {

	private String name;
	
	/**
	 * 
	 */
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param name
	 */
	public Employee(String name) {
		super();
		this.name = name;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * method prints out the wages
	 */
	@Override
	public void calculateWages(double hoursWorked, double payRate) {
		System.out.println("Wages : £" + hoursWorked*payRate);
	}

}
