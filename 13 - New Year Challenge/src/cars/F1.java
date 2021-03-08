/**
 * 
 */
package cars;

/**
 * @author Hugh
 *
 */
public class F1 extends Car {

	private double area;
	
	/**
	 * 
	 */
	public F1() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * constructor with args
	 * @param make
	 * @param model
	 * @param horsePower
	 * @param area
	 */
	public F1(String make, String model, int horsePower, double area) {
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
	 * method prints all the details about the f1 car
	 */
	@Override
	public void displayAll() {
		System.out.println("F1 Car");
		super.displayAll();
		System.out.printf("%-10s: %f\n","Area",this.area);
	}
}
