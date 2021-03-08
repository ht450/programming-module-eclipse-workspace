/**
 * 
 */
package abstraction;

/**
 * @author Hugh
 *
 */
public class Lecturer extends Employee {

	private String school;
	
	/**
	 * 
	 */
	public Lecturer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param firstName
	 * @param lastName
	 */
	public Lecturer(String firstName, String lastName, String school) {
		super(firstName, lastName);
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

	@Override
	public void calSalary(int hrs, int rate) {
		System.out.println(this.getFirstName()+" "+this.getLastName()+" is getting £"+(hrs*rate*1.6));
	}
	
	

}
