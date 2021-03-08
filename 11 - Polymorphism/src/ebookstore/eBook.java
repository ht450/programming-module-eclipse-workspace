/**
 * 
 */
package ebookstore;

/**
 * @author Hugh
 *
 */
public abstract class eBook {

	private String title;
	
	/**
	 * 
	 */
	public eBook() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param title
	 */
	public eBook(String title) {
		this.title = title;
	}

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
	
	/**
	 * method that reads the eBook
	 */
	public abstract void readBook();
	
}
