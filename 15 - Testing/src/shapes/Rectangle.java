/**
 * 
 */
package shapes;

/**
 * @author Hugh
 *
 */
public class Rectangle extends Shape implements IMyShape {

	private double height;
	private double width;
	
	/**
	 * default constructor
	 */
	public Rectangle() {
		
	}

	/**
	 * constructor with args
	 * 
	 * @param shapeName
	 * @param height
	 * @param width
	 */
	public Rectangle(String shapeName, double height, double width) {
		super("Rect_"+shapeName);
		this.height = height;
		this.width = width;
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
	 * returns the perimeter of the rectangle
	 */
	@Override
	public double calculatePerimeter() {
		return (this.height*2 + this.width*2);
	}

	/**
	 * returns the area of the rectangle
	 */
	@Override
	public double calculateArea() {
		return this.height*this.width;
	}

}
