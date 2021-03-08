/**
 * 
 */
package cars;

/**
 * @author Hugh
 *
 */
public class RallyCar extends Car {

	private double area;
	
	/**
	 * default constructor
	 */
	public RallyCar() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * constructor with args
	 * @param make
	 * @param model
	 * @param horsePower
	 * @param area
	 */
	public RallyCar(String make, String model, int horsePower, double area) {
		super(make, model, horsePower);
		this.area = area;
	}

	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(double area) {
		this.area = area;
	}
	/**
	 * method prints all the details about the rally car
	 */
	@Override
	public void displayAll() {
		System.out.println("Rally Car");
		super.displayAll();
		System.out.printf("%-10s: %f\n","Area",this.area);
	}
}
