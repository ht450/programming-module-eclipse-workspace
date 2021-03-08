/**
 * 
 */
package amazon;

/**
 * @author Hugh
 *
 */
public class AmazonWebApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AmazonBook theBody = new AmazonBook();
		theBody.setTitle("The Body: A Guide for Occupants");
		theBody.setAuthor("Bill Bryson");
		theBody.setPrice(16.74);
		theBody.setPages(464);
		theBody.setIsbn10("0857522418");
		theBody.setAvgCustRating(4.6);
		theBody.setLanguage("English");

		AmazonBook ulysses = new AmazonBook();
		theBody.setTitle("Ulysses");
		theBody.setAuthor("James Joyce");
		theBody.setPrice(17.99);
		theBody.setPages(736);
		theBody.setIsbn10("1840226358");
		theBody.setAvgCustRating(3.7);
		theBody.setLanguage("English");
		
//		System.out.println(theBody.toString());
//		System.out.println(ulysses.toString());
		
		System.out.println("The longer book is "+longestRead(theBody, ulysses));
		
	}

	/**
	 * method that compares two books and return the title and author of the longer one.
	 * @param book1
	 * @param book2
	 * @return
	 */
	public static String longestRead(AmazonBook book1, AmazonBook book2) {
		String longerBook=null;
		if (book1.getPages()>book2.getPages()) {
			longerBook = book1.getTitle()+" by "+book1.getAuthor();
		}
		return longerBook;
	}
}
