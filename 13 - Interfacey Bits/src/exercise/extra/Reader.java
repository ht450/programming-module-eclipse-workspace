/**
 * 
 */
package exercise.extra;

/**
 * @author Hugh
 *
 */
public class Reader extends Employee implements IPayable {

	private String researchArea;
	
	/**
	 * default constructor
	 */
	public Reader() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * constructor with args
	 * 
	 * @param firstName
	 * @param lastName
	 */
	public Reader(String firstName, String lastName, String researchArea) {
		super(firstName, lastName);
		this.researchArea = researchArea;
	}
	
	/**
	 * @return the researchArea
	 */
	public String getResearchArea() {
		return researchArea;
	}

	/**
	 * @param researchArea the researchArea to set
	 */
	public void setResearchArea(String researchArea) {
		this.researchArea = researchArea;
	}
	
	/**
	 * method prints all the Reader's information to screen
	 */
	@Override
	public void displayAll() {
		super.displayAll();
		System.out.println("Research Area : "+researchArea);
	}

	/**
	 * method calculates and prints the Reader's wages to screen
	 */
	@Override
	public void payWage(double hours, double rate) {
		System.out.println("Wages : £"+hours*rate*1.3);
	}

}
