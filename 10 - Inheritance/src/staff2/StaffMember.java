/**
 * 
 */
package staff2;

/**
 * @author Hugh
 *
 */
public class StaffMember {
	private String firstName;
	private String lastName;
	
	/**
	 * default constructor
	 */
	public StaffMember() {
		
	}
	
	/**
	 * @param firstName
	 * @param lastName
	 */
	public StaffMember(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
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
	 * returns details about StaffMember
	 */
	@Override
	public String toString() {
		return "StaffMember [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	
	

}
