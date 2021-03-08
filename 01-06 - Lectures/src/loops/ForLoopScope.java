/**
 * 
 */
package loops;

/**
 * @author Hugh
 *
 */
public class ForLoopScope {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Start");
		for (int loop = 1 ; loop <= 10 ; loop++ ) {
			System.out.println(loop);
			int score = 56;
			System.out.println(score);
		}//end of for loop
		
		// var 'loop' would be out of scope here
		
		System.out.println("End");
	
	}//end of main

}
