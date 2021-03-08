/**
 * 
 */
package conditions;

/**
 * @author Hugh
 *
 */
public class LogicalOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int age;
		String gender ;
		
		age = 20;
		gender = "female";
		
		// male and over 50
		if (age >= 50	&&	gender.equalsIgnoreCase("male")) {
			System.out.println("You are over 50 and Male");
		}
		
		// female and under 30
		if (age <= 30	&&	gender.equalsIgnoreCase("female")) {
			System.out.println("You are female and under 30");
		}
		
		// if over 70 or female
		if (age > 70	||	gender.equalsIgnoreCase("female")) {
			System.out.println("You are over 70  or female");
		}
		
		
		
		
		
		
		
	}

}
