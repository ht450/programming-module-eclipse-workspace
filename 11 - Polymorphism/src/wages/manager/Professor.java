/**
 * 
 */
package wages.manager;

/**
 * @author Hugh
 *
 */
public class Professor extends Employee {

	private String school;
	/**
	 * 
	 */
	public Professor() {

	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param basePay
	 */
	public Professor(String firstName, String lastName, double basePay, String school) {
		super(firstName, lastName, basePay);
		this.school = school;
	}

	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}

	/**
	 * method takes hours and prints weekly wage
	 */
	@Override
	public void calWeeklyWage(int hours) {
		double wages = hours * this.getBasePay() * 1.3;
		System.out.println("Employee wages "+this.getFirstName()+" "+this.getLastName()+ " £"+wages);
	}
	
	

}
