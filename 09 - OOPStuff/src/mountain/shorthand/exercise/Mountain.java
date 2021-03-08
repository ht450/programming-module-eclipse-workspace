/**
 * 
 */
package mountain.shorthand.exercise;

/**
 * @author Hugh
 *
 */
public class Mountain {
	
	// instance vars
	private String name;
	private int height;
	
	// constructor
	
	
	//methods - go to Source>Generate Getters and Setters
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
		if (height>8848) {
			// duff value
			System.out.println("Invalid value... please check!");
		} else {
			this.height = height;
		}
	}
	
	
}
