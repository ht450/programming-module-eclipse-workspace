/**
 * 
 */
package wages.manager;

/**
 * @author Hugh
 *
 */
public class Lecturer extends Employee {

	private String type;
	
	/**
	 * 
	 */
	public Lecturer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param basePay
	 */
	public Lecturer(String firstName, String lastName, double basePay, String type) {
		super(firstName, lastName, basePay);
		this.type = type;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * method that calculates a lecturers weekly wage given their weekly hours
	 */
	@Override
	public void calWeeklyWage(int hours) {
		double wages = hours * this.getBasePay() * 1.1;
		System.out.println("Employee wages "+this.getFirstName()+" "+this.getLastName()+ " £"+wages);
	}
	
	
	
}
