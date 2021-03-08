/**
 * 
 */
package constructor;

/**
 * @author Hugh
 *
 */
public class BookShop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// create with default
		Book b1 = new Book();
		b1.setTitle("Catch 22");
		System.out.println(b1.getTitle());

		// create with args
		Book b2 = new Book("To Kill a Mockingbird");
		System.out.println(b2.getTitle());
	}

}
