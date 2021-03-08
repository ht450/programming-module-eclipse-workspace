/**
 * 
 */
package systemToBeFixed;

import java.util.ArrayList;

/**
 * Class enables various utility searches in libary books
 *
 * @author Aidan McGowan
 */
public class LibrarySearch {

	/**
	 * Search by title
	 * 
	 * @param title - String
	 * @return ArrayList of found books matching search criteria
	 */
	public static ArrayList<Book> searchByTitle(ArrayList<Book> allBooks, String title) {
		ArrayList<Book> results = new ArrayList<Book>();
		for (int loop = 0; loop < allBooks.size(); loop++) {
			if (allBooks.get(loop).getTitle().equals(title)) {
				// add book to search
				results.add(allBooks.get(loop));
			}
		}
		// if results list empty tell user?
		return results;
	}

	/**
	 * Search by Author
	 * 
	 * @param author - string
	 * @return ArrayList of found books matching search criteria
	 */
	public static ArrayList<Book> searchByAuthor(ArrayList<Book> allBooks, String author) {
		ArrayList<Book> results = new ArrayList<Book>();

		for (int loop = 0; loop < allBooks.size(); loop++) {
			if (allBooks.get(loop).getAuthor().equals(author)) {
				// add book to search
				results.add(allBooks.get(loop));
			}
		}
		return results;
	}
	
	/**
	 * Search by ISBN number
	 * 
	 * @param iSBN - string
	 * @return ArrayList of found books matching search criteria
	 */
	public static ArrayList<Book> searchByISBN(ArrayList<Book> allBooks, String iSBN) {
		ArrayList<Book> results = new ArrayList<Book>();

		for (int loop = 0; loop < allBooks.size(); loop++) {
			if (allBooks.get(loop).getISBN().equals(iSBN)) {
				// add book to search
				results.add(allBooks.get(loop));
			}
		}
		return results;
	}
	
	/**
	 * Search by rating - returns all books with rating equal to search rating
	 * 
	 * @param rating - int
	 * @return ArrayList of found books matching search criteria
	 */
	public static ArrayList<Book> searchByRating(ArrayList<Book> allBooks, int rating) {
		ArrayList<Book> results = new ArrayList<Book>();

		for (int loop = 0; loop < allBooks.size(); loop++) {
			if (allBooks.get(loop).getRating() == rating) {
				// add book to search
				results.add(allBooks.get(loop));
			}
		}
		return results;
	}
	
	
	

}
