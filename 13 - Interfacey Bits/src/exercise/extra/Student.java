/**
 * 
 */
package exercise.extra;

/**
 * @author Hugh
 *
 */
public class Student extends Employee {

	private int studentNumber;

	/**
	 * default constructor
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * constructor with args
	 * 
	 * @param firstName
	 * @param lastName
	 */
	public Student(String firstName, String lastName, int studentNumber) {
		super(firstName, lastName);
		this.studentNumber = studentNumber;
	}

	/**
	 * @return the studentNumber
	 */
	public int getStudentNumber() {
		return studentNumber;
	}

	/**
	 * @param studentNumber the studentNumber to set
	 */
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	/**
	 * method that prints out all of the students information
	 */
	@Override
	public void displayAll() {
		super.displayAll();
		System.out.println("Student Number : "+studentNumber);
	}
	
}
