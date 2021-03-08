/**
 * 
 */
package areas2;

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
	 * @param shapeName
	 */
	public Rectangle(String shapeName, int width, int height) {
		super(shapeName);
		this.setWidth(width);
		this.setHeight(height);
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
		if (width >0) {
			this.width = width;
		} else {
			System.err.println("Width needs to be > 0");
		}
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
		
		if (height >0) {
			this.height = height;
		} else {
			System.err.println("Height needs to be > 0");
		}
	}

	@Override
	public void area() {
		int areaRect = this.height * this.width;
		System.out.println("Area of "+this.getShapeName()+" is "+areaRect);
	}
	
	

}
