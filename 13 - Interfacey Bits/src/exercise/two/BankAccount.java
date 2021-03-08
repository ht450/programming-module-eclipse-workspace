/**
 * 
 */
package exercise.two;

/**
 * @author Hugh
 *
 */
public abstract class BankAccount {

	private int accNumber;
	
	/**
	 * default constructor
	 */
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * constructor with args
	 * @param accNumber
	 */
	public BankAccount(int accNumber) {
		this.accNumber = accNumber;
	}

	/**
	 * @return the accNumber
	 */
	public int getAccNumber() {
		return accNumber;
	}

	/**
	 * @param accNumber the accNumber to set
	 */
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	/**
	 * method displays all the details of the bank account (just account number) 
	 */
	public void displayAll() {
		System.out.println("Account Number : "+accNumber);
	}
	

}
