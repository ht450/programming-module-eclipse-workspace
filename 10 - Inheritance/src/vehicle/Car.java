/**
 * 
 */
package vehicle;

/**
 * @author Hugh
 *
 */
public class Car extends Vehicle {

	private int numberOfWheels;
	
	/**
	 * 
	 */
	public Car() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param powerType
	 */
	public Car(String name, String powerType, int numberOfWheels) {
		super(name, powerType);
		this.numberOfWheels = numberOfWheels;
	}


	/**
	 * @return the numberOfWheels
	 */
	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	/**
	 * @param numberOfWheels the numberOfWheels to set
	 */
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	@Override
	public String toString() {
		return "Car [numberOfWheels=" + numberOfWheels + ", getName()=" + getName() + ", getPowerType()="
				+ getPowerType() + "]";
	}

	
	

}
