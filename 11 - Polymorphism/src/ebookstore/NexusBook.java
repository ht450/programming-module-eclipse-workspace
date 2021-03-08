/**
 * 
 */
package ebookstore;

/**
 * @author Hugh
 *
 */
public class NexusBook extends eBook {

	/**
	 * Default Constructor
	 */
	public NexusBook() {

	}

	/**
	* 
	*/
	public NexusBook(String title) {
		super(title);
	}

	public void readBook() {
		System.out.println("Reading Book...");
	}

}
