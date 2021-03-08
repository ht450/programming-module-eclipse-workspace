/**
 * 
 */
package cars;

/**
 * @author Hugh
 *
 */
public class Car {

	private String make;
	private String model;
	private int horsePower; //0-1000 invalid:-999
	
	/**
	 * default constructor
	 */
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * constructor with args
	 * @param make
	 * @param model
	 * @param horsePower
	 */
	public Car(String make, String model, int horsePower) {
		this.make = make;
		this.model = model;
		setHorsePower(horsePower);
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the horsePower
	 */
	public int getHorsePower() {
		return horsePower;
	}

	/**
	 * @param horsePower the horsePower to set
	 */
	public void setHorsePower(int horsePower) {
		if (horsePower>=0 && horsePower<=1000) {
			this.horsePower = horsePower;
		} else {
			this.horsePower = -999;
		}	
	}
	
	/**
	 * method prints all the details of the car
	 */
	public void displayAll() {
		System.out.printf("%-10s: %s\n","Make",this.make);
		System.out.printf("%-10s: %s\n","Model",this.model);
		System.out.printf("%-20s: %d\n","HorsePower",this.horsePower);
	}
}
