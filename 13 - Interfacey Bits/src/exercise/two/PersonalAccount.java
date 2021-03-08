/**
 * 
 */
package exercise.two;

/**
 * @author Hugh
 *
 */
public class PersonalAccount extends BankAccount {

	private String firstName;
	private String lastName;

	/**
	 * default constructor
	 */
	public PersonalAccount() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * constructor with args
	 * 
	 * @param accNumber
	 */
	public PersonalAccount(int accNumber, String firstName, String lastName) {
		super(accNumber);
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * method that prints all of the accounts details
	 */
	@Override
	public void displayAll() {
		super.displayAll();
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name : "+lastName);
		System.out.println();
	}
	

}
