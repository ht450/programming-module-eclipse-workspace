/**
 * 
 */
package areas;

/**
 * @author Hugh
 *
 */
public class Rectangle extends Shape {

	private int width;
	private int height;
	
	/**
	 * 
	 */
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param width
	 * @param height
	 */
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * method that prints the area of the rectangle
	 */
	@Override
	public void area() {
		int areaRect = this.height * this.width;
		System.out.println("Area of Rectangle: "+areaRect);
	}
	
	

}
