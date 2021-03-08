/**
 * 
 */
package conditions;

/**
 * @author Hugh
 *
 */
public class Ex1CreditCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int applicantAge;
		boolean goodCreditHistory;
		
		applicantAge = 115;
		goodCreditHistory = true;
		
		// applicant can only get credit if over 18 AND has good credit history
		if ( applicantAge >= 18 && goodCreditHistory) {
			System.out.println("Congratulations, you qualify for credit!");
		} else {
			System.out.println("Unfortunately you do not meet the criteria.");
		}
		System.out.println("Done");

	}

}
