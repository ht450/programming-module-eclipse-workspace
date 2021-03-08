/**
 * 
 */
package graduation;

/**
 * @author Hugh
 *
 */
public abstract class Student {

	private int studentNo;
	private String firstName;
	private String lastName;
	
	/**
	 * 
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param studentNo
	 * @param firstName
	 * @param lastName
	 */
	public Student(int studentNo, String firstName, String lastName) {
		super();
		this.studentNo = studentNo;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * @return the studentNo
	 */
	public int getStudentNo() {
		return studentNo;
	}

	/**
	 * @param studentNo the studentNo to set
	 */
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
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

	@Override
	public String toString() {
		return "Student no. : " + studentNo + "\nFirst Name : " + firstName + "\nLast Name : " + lastName +"\n";
	}	
	

}
