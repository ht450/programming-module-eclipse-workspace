/**
 * 
 */
package exercise.two;

/**
 * @author Hugh
 *
 */
public class BusinessAccount extends BankAccount implements IPrintable {

	private String businessName;

	/**
	 * default constructor
	 */
	public BusinessAccount() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * constructor with args (including args for super class)
	 * @param accNumber
	 */
	public BusinessAccount(int accNumber, String businessName) {
		super(accNumber);
		this.businessName = businessName;
	}
	
	/**
	 * method that prints all of the accounts details
	 */
	@Override
	public void displayAll() {
		super.displayAll();
		System.out.println("Business Name : "+businessName);
		System.out.println();
	}

	/**
	 * method (implemented form interface) that prints a bank statement
	 */
	@Override
	public void printStatement() {
		System.out.println("Simulating statement:");
		System.out.println("Transactions...\tMoney...\n");
	}

}
