/**
 * 
 */
package amazon;

/**
 * @author Hugh
 *
 */
public class AmazonBook {

	private String title;
	private String author;
	private double price;
	private int pages;
	private String isbn10;
	private double avgCustRating;
	private String language;
	
	/**
	 * 
	 */
	public AmazonBook() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param title
	 * @param author
	 * @param price
	 * @param pages
	 * @param isbn10
	 * @param avgCustRating
	 * @param language
	 */
	public AmazonBook(String title, String author, double price, int pages, String isbn10, double avgCustRating,
			String language) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.pages = pages;
		this.isbn10 = isbn10;
		this.avgCustRating = avgCustRating;
		this.language = language;
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
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the pages
	 */
	public int getPages() {
		return pages;
	}

	/**
	 * @param pages the pages to set
	 */
	public void setPages(int pages) {
		this.pages = pages;
	}

	/**
	 * @return the isbn10
	 */
	public String getIsbn10() {
		return isbn10;
	}

	/**
	 * @param isbn10 the isbn10 to set
	 */
	public void setIsbn10(String isbn10) {
		this.isbn10 = isbn10;
	}

	/**
	 * @return the avgCustRating
	 */
	public double getAvgCustRating() {
		return avgCustRating;
	}

	/**
	 * @param avgCustRating the avgCustRating to set
	 */
	public void setAvgCustRating(double avgCustRating) {
		this.avgCustRating = avgCustRating;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "AmazonBook [title=" + title + ", author=" + author + ", price=" + price + ", pages=" + pages
				+ ", isbn10=" + isbn10 + ", avgCustRating=" + avgCustRating + ", language=" + language + "]";
	}

	
}
