/**
 * 
 */
package exercise.extra;

/**
 * @author Hugh
 *
 */
public class Lecturer extends Employee implements IPayable {

	private String subject;
	
	/**
	 * default constructor
	 */
	public Lecturer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * constructor with args
	 * 
	 * @param firstName
	 * @param lastName
	 */
	public Lecturer(String firstName, String lastName, String subject) {
		super(firstName, lastName);
		this.subject = subject;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	/**
	 * method prints all the Lecturer's info 
	 */
	@Override
	public void displayAll() {
		super.displayAll();
		System.out.println("Subject : "+subject);
	}

	/**
	 * method calculates and prints the Lecturer's wages to screen
	 */
	@Override
	public void payWage(double hours, double rate) {
		System.out.println("Wages : £"+hours*rate*1.2);
	}

}
