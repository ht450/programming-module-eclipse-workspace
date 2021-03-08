package systemToBeFixed;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibrarySearchTest {

	// test data
	Book b1, b2, b3;
	
	String b1ISBN, b1Author, b1Title;
	int b1Rating;
	
	String b2ISBN, b2Author, b2Title;
	int b2Rating;
	
	String b3ISBN, b3Author, b3Title;
	int b3Rating;
	
	ArrayList<Book> books;

	@BeforeEach
	void setUp() throws Exception {
		
		b1ISBN = "book1ISBN.";
		b1Author = "Book1 Author";
		b1Title = "Book1 Title";
		b1Rating = 1;
		b1 = new Book(b1ISBN, b1Author, b1Title, b1Rating);
		
		b2ISBN = "book2ISBN.";
		b2Author = "Book2 Author";
		b2Title = "Book2 Title";
		b2Rating = 2;
		b2 = new Book(b2ISBN, b2Author, b2Title, b2Rating);
		
		b3ISBN = "book3ISBN.";
		b3Author = "Book3 Author";
		b3Title = "Book3 Title";
		b3Rating = 3;
		b3 = new Book(b3ISBN, b3Author, b3Title, b3Rating);		
		
		books = new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);

	}

	@Test
	void testSearchByTitle() {

		ArrayList<Book> searchResults = LibrarySearch.searchByTitle(books, b1Title);

		assertTrue(searchResults.contains(b1));
		assertFalse(searchResults.contains(b2));
	}

	@Test
	void testSearchByAuthor() {
		
		ArrayList<Book> searchResults = LibrarySearch.searchByAuthor(books, b1Author);
		
		assertTrue(searchResults.contains(b1));
		assertFalse(searchResults.contains(b2));
	}

	@Test
	void testSearchByISBN() {
		
		ArrayList<Book> searchResults = LibrarySearch.searchByISBN(books, b1ISBN);
		
		assertTrue(searchResults.contains(b1)); 
		assertFalse(searchResults.contains(b2));
	}

	@Test
	void testSearchByRating() {
		
		ArrayList<Book> searchResults = LibrarySearch.searchByRating(books, b1Rating);
		
		assertTrue(searchResults.contains(b1)); 
		assertFalse(searchResults.contains(b2));
	}

}
