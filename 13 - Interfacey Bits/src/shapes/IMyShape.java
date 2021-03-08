/**
 * 
 */
package shapes;

/**
 * @author Hugh
 *
 */
public interface IMyShape {

	/**
	 * calculates the perimeter of the shape
	 * @return
	 */
	public double calculatePerimeter();
	
	/**
	 * calculates the area of the shape
	 * @return
	 */
	public double calculateArea();
	
	/**
	 * gets the shape name
	 * 
	 * @return
	 */
	public String getShapeName();
	
}
