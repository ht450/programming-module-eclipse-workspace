/**
 * 
 */
package areas;

/**
 * @author Hugh
 *
 */
public class Triangle extends Shape {

	private double base;
	private double height;
	
	/**
	 * 
	 */
	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param base
	 * @param height
	 */
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	/**
	 * @return the base
	 */
	public double getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * method that prints the area of the triangle
	 */
	@Override
	public void area() {
		double areaTri = this.base/2 *this.height;
		System.out.println("Area Triangle: "+areaTri);
	}

	
}
