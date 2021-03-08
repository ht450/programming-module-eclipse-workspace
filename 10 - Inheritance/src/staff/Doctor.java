/**
 * 
 */
package staff;

/**
 * @author Hugh
 *
 */
public class Doctor extends StaffMember {
	
	private String ward;

	/**
	 * @return the ward
	 */
	public String getWard() {
		return ward;
	}

	/**
	 * @param ward the ward to set
	 */
	public void setWard(String ward) {
		this.ward = ward;
	}
	
	@Override
	public String toString() {
		return "Doctor [Based : " + ward + ",  Name : " + getFirstName() + " " + getLastName() + "]";
	}
	
	
	
}
