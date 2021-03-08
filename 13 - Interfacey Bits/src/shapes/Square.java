/**
 * 
 */
package shapes;

/**
 * @author Hugh
 *
 */
public class Square extends Shape implements IMyShape {

	private double width;
	
	/**
	 * default constructor
	 */
	public Square() {
		
	}

	/**
	 * constructor with args
	 * 
	 * @param shapeName
	 * @param width
	 */
	public Square(String shapeName, double width) {
		super("Square_"+shapeName);
		this.width = width;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * returns the perimeter of the square
	 */
	@Override
	public double calculatePerimeter() {
		return this.width*4;
	}

	/**
	 * returns the area of the square
	 */
	@Override
	public double calculateArea() {
		return Math.pow(this.width, 2);
	}

}
