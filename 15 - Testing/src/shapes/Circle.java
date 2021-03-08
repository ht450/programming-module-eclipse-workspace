/**
 * 
 */
package shapes;

/**
 * @author Hugh
 *
 */
public class Circle extends Shape implements IMyShape {

	private double radius;
	
	/**
	 * default constructor
	 */
	public Circle() {
		
	}

	/**
	 * constructor with args
	 * 
	 * @param shapeName
	 * @param radius
	 */
	public Circle(String shapeName, double radius) {
		super("Circle_"+shapeName);
		this.radius = radius;
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * returns the perimeter of the circle
	 */
	@Override
	public double calculatePerimeter() {
		return Math.PI*2*this.radius;
	}

	/**
	 * returns the area of the circle
	 */
	@Override
	public double calculateArea() {
		return Math.PI*Math.pow(this.radius, 2.00);
	}

}
