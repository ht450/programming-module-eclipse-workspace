package exercise.three;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KindleBookTest {

	// test data
	KindleBook book;
	
	String bookNameValid;
	String bookNameInvalid;
	
	int numberOfPagesValidLower;
	int numberOfPagesValidMid;
	int numberOfPagesValidUpper;
	int numberOfPagesInvalidLower;
	int numberOfPagesInvalidUpper;
	
	String authorNameValid;
	String authorNameInvalid;
	
	/**
	 * initialising test data
	 * 
	 * @throws Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		book = new KindleBook();
		
		bookNameValid = "Valid Book Name";
		bookNameInvalid = "";
		
		numberOfPagesValidLower = 1;
		numberOfPagesValidMid = 180;
		numberOfPagesValidUpper = 360;
		numberOfPagesInvalidLower = 0;
		numberOfPagesInvalidUpper = 361;
		
		authorNameValid = "Valid Authorname";
		authorNameInvalid = "";
	}

	/**
	 * testing default constructor
	 */
	@Test
	void testDefaultConstructorKindleBook() {
		assertNotNull(book);
	}
	
	/**
	 * testing the construtor with args for valid arguments
	 */
	@Test
	void testConstructorWithArgsValidKindleBook() {
		KindleBook bookTestArgsConstructor = new KindleBook(bookNameValid, numberOfPagesValidMid, authorNameValid);
		assertEquals(bookNameValid, bookTestArgsConstructor.getBookName());
		assertEquals(numberOfPagesValidMid, bookTestArgsConstructor.getNumberOfPages());
		assertEquals(authorNameValid, bookTestArgsConstructor.getAuthorName());
	}
	
	@Test
	void testConstructorWithArgsInvalidKindleBook() {
		// invaid bookName
		assertThrows(IllegalArgumentException.class, () -> {
			KindleBook bookTestArgsConstructor = new KindleBook(bookNameInvalid, numberOfPagesValidMid, authorNameValid);
		});		
		
		// invalid numberOfPages
		assertThrows(IllegalArgumentException.class, () -> {
			KindleBook bookTestArgsConstructor = new KindleBook(bookNameValid, numberOfPagesInvalidLower, authorNameValid);
		});
		
		// invalid 
		assertThrows(IllegalArgumentException.class, () -> {
			KindleBook bookTestArgsConstructor = new KindleBook(bookNameValid, numberOfPagesValidMid, authorNameInvalid);
		});
	}
	
	/**
	 * testing getter and setter for bookName for valid argument
	 */
	@Test
	void testGetSetValidBookName() {
		book.setBookName(bookNameValid);
		assertEquals(bookNameValid, book.getBookName());
	}
	
	/**
	 * testing setter for bookName throws exception for invalid argument
	 */
	@Test
	void testSetInvalidBookName() {
		assertThrows(IllegalArgumentException.class, () -> {
			book.setBookName(bookNameInvalid);			
		});
	}
	
	/**
	 * testing getter and setter for numberOfPages for valid arguments
	 */
	@Test
	void testGetSetValidNumberOfPages() {
		book.setNumberOfPages(numberOfPagesValidLower);
		assertEquals(numberOfPagesValidLower, book.getNumberOfPages());
		
		book.setNumberOfPages(numberOfPagesValidMid);
		assertEquals(numberOfPagesValidMid, book.getNumberOfPages());
		
		book.setNumberOfPages(numberOfPagesValidUpper);
		assertEquals(numberOfPagesValidUpper, book.getNumberOfPages());
	}
	
	/**
	 * testing setter for numberOfPages throws exception for invalid arguments
	 */
	@Test
	void testSetInvalidNumberOfPages() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			book.setNumberOfPages(numberOfPagesInvalidLower);
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			book.setNumberOfPages(numberOfPagesInvalidUpper);
		});
	}
	
	/**
	 * testing getter and setter for authorName for valid arguments
	 */
	@Test
	void testGetSetAuthorNameValid() {
		book.setAuthorName(authorNameValid);
		assertEquals(authorNameValid, book.getAuthorName());
	}
	
	/**
	 * testing setter for authorName throw exception for invalid arguments
	 */
	@Test
	void testSetAuthorNameInvalid() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			book.setAuthorName(authorNameInvalid);
		});
		
	}
	
	@Test
	void testCalculateEPages() {
		
		book.setNumberOfPages(numberOfPagesValidMid);
		
		double expected =  book.getNumberOfPages()*2.5;
		
		assertEquals(expected, book.calculateEPages());
		
	}
}
