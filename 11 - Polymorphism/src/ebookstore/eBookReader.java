/**
 * 
 */
package ebookstore;

/**
 * @author Hugh
 *
 */
public class eBookReader {

	/**
	 * 
	 */
	public eBookReader() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		KindleBook k1 = new KindleBook("Catch 22",true);
		
		KindleBook k2 = new KindleBook("Illegaly downloading eBooks for dummies",false);
		
		NexusBook n1 = new NexusBook("Nexus");
		
		k1.readBook();
		k2.readBook();
		n1.readBook();
		
	}

}
