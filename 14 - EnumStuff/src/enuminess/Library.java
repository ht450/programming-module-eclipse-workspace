/**
 * 
 */
package enuminess;

import java.util.ArrayList;

/**
 * @author Hugh
 *
 */
public class Library {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setName("War and Peace");
		b1.setGenre(Genre.COMEDY);
		
		Book b2 = new Book();
		b2.setName("Catch 22");
		b2.setGenre(Genre.COMEDY);
		
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		
		searchBookGenre(Genre.COMEDY, books);
	}
	
	public static void searchBookGenre(Genre search, ArrayList<Book> books) {
		for (Book book: books) {
			if (book.getGenre().equals(search)) {
				System.out.println("Funny Book : "+book.getName());
			}
		}
	}

}
