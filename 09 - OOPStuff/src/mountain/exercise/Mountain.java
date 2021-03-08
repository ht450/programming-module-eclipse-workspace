/**
 * 
 */
package mountain.exercise;

/**
 * @author Hugh
 *
 */
public class Mountain {
	
	private String name;
	private int height;
	
	/**
	 * this method sets the name of the mountain
	 * @param name
	 */
	public void setName (String name) {
		this.name = name;
	}
	
	/**
	 * this method returns the name of the method
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * this method sets the name height of the mountain
	 * @param height
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	/**
	 * this method returns the height of the mountain
	 * @return
	 */
	public int getHeight() {
		return height;
	}
	
}
