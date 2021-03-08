/**
 * 
 */
package staff2;

/**
 * @author Hugh
 *
 */
public class Footballer extends StaffMember {
	
	private int goalsScored;

	/**
	 * default constructor
	 */
	public Footballer() {
		
	}
	
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param goalsScored
	 */
	public Footballer(String firstName, String lastName, int goalsScored) {
		/* setting directly - is ok  but using super is better
		this.setFirstName(firstName);
		this.setLastName(lastName);
		*/
		// calling the constructor (with args) of the super class
		super(firstName, lastName);
		
		this.goalsScored = goalsScored;
	}
	
	/**
	 * @return the goalsScored
	 */
	public int getGoalsScored() {
		return goalsScored;
	}

	/**
	 * @param goalsScored the goalsScored to set
	 */
	public void setGoalsScored(int goalsScored) {
		this.goalsScored = goalsScored;
	}

	@Override
	public String toString() {
		return "Footballer [goalsScored=" + goalsScored + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + "]";
	}
	
	
	

}
