/**
 * 
 */
package areas;

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
	 * @param radius
	 */
	public Circle(double radius) {
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
	 * method that returns the area of the circle
	 */
	@Override
	public void area() {
		double areaOfCircle = Math.PI * Math.pow(this.radius, 2);
		System.out.println("Area of circle: "+ areaOfCircle);
	}

	
	
}
