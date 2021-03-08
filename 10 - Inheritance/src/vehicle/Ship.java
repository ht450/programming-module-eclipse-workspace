/**
 * 
 */
package vehicle;

/**
 * @author Hugh
 *
 */
public class Ship extends Vehicle {

	private int tonnage;
	
	/**
	 * 
	 */
	public Ship() {
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * @param name
	 * @param powerType
	 */
	public Ship(String name, String powerType, int tonnage) {
		super(name, powerType);
		this.tonnage = tonnage;
	}


	/**
	 * @return the tonnage
	 */
	public int getTonnage() {
		return tonnage;
	}

	/**
	 * @param tonnage the tonnage to set
	 */
	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}

	@Override
	public String toString() {
		return "Ship [tonnage=" + tonnage + ", getName()=" + getName() + ", getPowerType()=" + getPowerType() + "]";
	}
	
	
	

	
}
