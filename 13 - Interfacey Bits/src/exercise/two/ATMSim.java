/**
 * 
 */
package exercise.two;

/**
 * @author Hugh
 *
 */
public class ATMSim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BusinessAccount businessAcc = new BusinessAccount(123, "Hugh's Screws");
		PersonalAccount personalAcc = new PersonalAccount(456, "Hugh", "Tiernan");
		
		businessAcc.displayAll();
		businessAcc.printStatement();
		
		personalAcc.displayAll();
	}

}
