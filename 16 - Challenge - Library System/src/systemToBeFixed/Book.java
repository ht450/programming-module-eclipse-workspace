/**
 * 
 */
package systemToBeFixed;

/**
 * Book class - represents a book in the system
 * 
 * @author Aidan McGowan
 */
public class Book {

	/**
	 * The book's ISBN
	 */
	private String ISBN;

	/**
	 * The author of the book
	 */
	private String author;

	/**
	 * The title of the book
	 */
	private String title;

	/**
	 * The rating of the book (1-5)
	 */
	private int rating;

	/**
	 * Default constructor
	 */
	public Book() {

	}

	/**
	 * constructor with args
	 * 
	 * @param iSBN
	 * @param author
	 * @param title
	 * @param rating
	 */
	public Book(String iSBN, String author, String title, int rating) {
		setISBN(iSBN);
		setAuthor(author);
		setTitle(title);
		setRating(rating);
	}

	/**
	 * Gets the ISBN number
	 * 
	 * @return
	 */
	public String getISBN() {
		return ISBN;
	}

	/**
	 * Sets the ISBN number
	 * 
	 * @param iSBN 10 or 13 chars
	 * @throws IllegalArgumentException if the input string is not 10 or 13
	 *                                  characters
	 */
	public void setISBN(String iSBN) throws IllegalArgumentException {
		if (iSBN.length() == 10 || iSBN.length() == 13) {
			this.ISBN = iSBN;
		} else {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Get the book's author
	 * 
	 * @return
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the book's author
	 * 
	 * @param author
	 * @throws IllegalArgumentException if the input string is less than 1 character
	 */
	public void setAuthor(String author) throws IllegalArgumentException {
		if (author.length() >= 1) {
			this.author = author;
		} else {
			throw new IllegalArgumentException();
		}

	}

	/**
	 * Gets the book's title
	 * 
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the books title
	 * 
	 * @param title
	 * @throws IllegalArgumentException if the input string is less than 1 character
	 * 
	 */
	public void setTitle(String title) throws IllegalArgumentException {
		if (title.length() >= 1) {
			this.title = title;
		} else {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * set the rating for the book
	 * 
	 * @param rating the rating to set
	 * @throws NumberFormatException 
	 */
	public void setRating(int rating) throws NumberFormatException {
		if (rating >= 1 && rating <= 5) {
			this.rating = rating;
		} else {
			throw new NumberFormatException();
		}
	}

}
