/**
 * 
 */
package vehicle;

/**
 * @author Hugh
 *
 */
public class Vehicle {

	private String name;
	private String powerType;
	
	/**
	 * 
	 */
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param powerType
	 */
	public Vehicle(String name, String powerType) {
		this.name = name;
		this.powerType = powerType;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the powerType
	 */
	public String getPowerType() {
		return powerType;
	}

	/**
	 * @param powerType the powerType to set
	 */
	public void setPowerType(String powerType) {
		this.powerType = powerType;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", powerType=" + powerType + "]";
	}
	
	

}
