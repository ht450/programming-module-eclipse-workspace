package systemToBeFixed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {

	// test data
	String title;
	String titleInvalid;
	
	String author;
	String authorInvalid;
	
	String iSBN10;
	String iSBN13;
	String iSBNInvalid;
	
	int rating;
	
	Book book;
	
	@BeforeEach
	void setUp() throws Exception {
		title = "Valid Title";
		titleInvalid = "";
		
		author = "Valid Author";
		authorInvalid = "";
		
		iSBN10 = "valISBN10.";
		iSBN13 = "validISBN13..";
		iSBNInvalid = "invalidISBN";

		book = new Book();
	}

	@Test
	void testBook() {
		assertNotNull(book);
	}

	@Test
	void testBookConstructorValidArgs() {
		rating = 1;
		book = new Book(iSBN10, author, title, rating);
		
		assertEquals(book.getISBN(), iSBN10);
		assertEquals(book.getAuthor(), author);
		assertEquals(book.getTitle(), title);
		assertEquals(book.getRating(), rating);
	}
	
	@Test
	void testBookConstructorInvalidArgs() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			Book book = new Book(iSBNInvalid, author, title, rating); 
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			Book book = new Book(iSBN10, authorInvalid, title, rating);
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			Book book = new Book(iSBN10, author, titleInvalid, rating);
		});
		
		assertThrows(NumberFormatException.class, () -> {
			Book book = new Book(iSBN10, author, title, 0);
		});
	}

	@Test
	void testGetSetValidISBN() {
		book.setISBN(iSBN10);
		assertEquals(iSBN10, book.getISBN());
		
		book.setISBN(iSBN13);
		assertEquals(iSBN13, book.getISBN());
	}


	@Test
	void testGetSetValidAuthor() {
		book.setAuthor(author);
		assertEquals(author, book.getAuthor());
	}

	@Test
	void testGetSetValidTitle() {
		book.setTitle(title);
		assertEquals(title, book.getTitle());
	}

	@Test
	void testGetSetValidRating() {
		for (int rating=1; rating<=5; rating++) {
			book.setRating(rating);
			assertEquals(rating, book.getRating());
		}
	}

	@Test
	void testGetSetInvalidISBN() {
		assertThrows(IllegalArgumentException.class, () -> {
			book.setISBN(iSBNInvalid);
		});
	}


	@Test
	void testGetSetInvalidAuthor() {
		assertThrows(IllegalArgumentException.class, () -> {
			book.setAuthor(authorInvalid);
		});
	}

	@Test
	void testGetSetInvalidTitle() {
		assertThrows(IllegalArgumentException.class, () -> {
			book.setTitle(titleInvalid);
		});
	}

	@Test
	void testGetSetInvalidRating() {
		assertThrows(NumberFormatException.class, () -> {
			book.setRating(0);
		});
		assertThrows(NumberFormatException.class, () -> {
			book.setRating(6);
		});
	}

}
