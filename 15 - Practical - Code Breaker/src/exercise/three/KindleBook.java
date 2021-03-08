package exercise.three;

import java.security.InvalidParameterException;

public class KindleBook {

	private String bookName;
	private int numberOfPages;
	private String authorName;
	
	/**
	 * default constructor
	 */
	public KindleBook() {
		
	}
	
	/**
	 * constructor with args
	 * 
	 * @param bookName
	 * @param numberOfPages
	 * @param authorName
	 */
	public KindleBook(String bookName, int numberOfPages, String authorName) {
		this.setBookName(bookName);
		this.setNumberOfPages(numberOfPages);
		this.setAuthorName(authorName);
	}

	/**
	 * 
	 * @return
	 */
	public String getBookName() {
		return bookName;
	}
	
	/**
	 * Sets book name. Will return an error message is passed parameter is empty.
	 * 
	 * @param bookName
	 * @throws InvalidParameterException if bookName is empty
	 */
	public void setBookName(String bookName) throws IllegalArgumentException {
		if(bookName.isEmpty()  || bookName.trim().length()==0 || bookName == null) {
			throw new IllegalArgumentException("Book name cannot be empty!");
		} else {
			this.bookName = bookName;
		}
	}

	/**
	 * 
	 * @return
	 */
	public int getNumberOfPages() {
		return numberOfPages;
	}

	/**
	 * Sets the number of pages for the kindle book.
	 * Will return an error message of passed parameter is outside the range 0-360.
	 * 
	 * @param pages
	 */
	public void setNumberOfPages(int pages) throws IllegalArgumentException {
		if (pages <= 0 || pages > 360) {
			throw new IllegalArgumentException("Number of pages must be between 0-360.");
		} else {
			this.numberOfPages = pages;
		}
	}

	/**
	 * @return the authorName
	 */
	public String getAuthorName() {
		return authorName;
	}

	/**
	 * Sets Author name. Will return an error message is passed parameter is empty.
	 * 
	 * @param authorName the authorName to set
	 */
	public void setAuthorName(String authorName) throws IllegalArgumentException {
		if(authorName.isEmpty() || authorName.trim().length()==0 || authorName == null) {
			throw new IllegalArgumentException("Author name cannot be empty!");
		} else {		
			this.authorName = authorName;
		}
	}

	/**
	 * Calculates the number of epages based on the size of the screen used in the
	 * Kindle reader i.e. the number of pages * 2.5
	 * 
	 * @return the number of epages
	 */
	public double calculateEPages() {
		// if media device is ...
		double kindleReader = 2.5;
		
		// switch statement for different devices?
		// inside switch
		double deviceType = kindleReader;
		
		return numberOfPages*deviceType;
	}

}
