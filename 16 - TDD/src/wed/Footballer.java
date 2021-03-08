/**
 * 
 */
package wed;

/**
 * @author Hugh
 *
 */
public class Footballer {

	private final int LOWER_AGE = 16;
	private final int UPPER_AGE = 40;
	
	
	private int age;

	/**
	 * 
	 */
	public Footballer() {
		// TODO Auto-generated constructor stub
	}

	public void setAge(int age) throws IllegalArgumentException {
		if (age >= LOWER_AGE && age <= UPPER_AGE) {
			this.age = age;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int getAge() {
		return age;
	}

}
