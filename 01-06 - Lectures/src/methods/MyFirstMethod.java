/**
 * 
 */
package methods;

/**
 * class for practicing invoking my first method
 * @author Hugh
 *
 */
public class MyFirstMethod {

	/**
	 * main method invoking another methods
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Start");
		
		invokeMe();
		
		System.out.println("End");
	}//end of main
	
	/**
	 * method printing out a message
	 */
	public static void invokeMe() {
		System.out.println("Ouch, that hurt!");
	}//end of invokeMe

}
