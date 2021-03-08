/**
 * 
 */
package areas2;

/**
 * @author Hugh
 *
 */
public class Shape {

	//instance vars
	private String shapeName;
	
	// constructors
	/**
	 * default constructor
	 */
	public Shape() {
		
	}
	/**
	 * 
	 * @param shapeName
	 */
	public Shape(String shapeName) {
		this.shapeName = shapeName;
	}
	
	//methods
	/**
	 * @return the shapeName
	 */
	public String getShapeName() {
		return shapeName;
	}
	/**
	 * @param shapeName the shapeName to set
	 */
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}
	
	/**
	 * method that prints a message about the area of the shape
	 */
	public void area() {
		System.out.println("Need more details to do this...");
	}

}
