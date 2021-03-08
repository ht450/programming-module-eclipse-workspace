/**
 * 
 */
package constructor;

/**
 * @author Hugh
 *
 */
public class Book {
	private String title;
	
	// constructors
	/**
	 * default constructor
	 */
	public Book() {
		
	}
	
	/**
	 * constructor that sets title
	 * @param title
	 */
	public Book(String title) {
		this.title = title;
	}

	// methods
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	

	
	
	
}
