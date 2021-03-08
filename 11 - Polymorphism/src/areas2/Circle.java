/**
 * 
 */
package areas2;

/**
 * @author Hugh
 *
 */
public class Circle extends Shape {

	private double radius;
	
	/**
	 * 
	 */
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param shapeName
	 */
	public Circle(String shapeName, double radius) {
		super(shapeName);
		this.setRadius(radius);
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
		if (radius > 0) {
			this.radius = radius;
		} else {
			System.err.println("Sorry, radius needs to be > 0");
		}	
	}

	/**
	 * method that prints the area of the circle
	 */
	@Override
	public void area() {
		double areaCircle = Math.PI * (this.radius * this.radius);
		System.out.println("Area of "+this.getShapeName()+" is "+areaCircle);
	}
	
	
	
	

}
