/**
 * 
 */
package loops;

/**
 * @author Hugh
 *
 */
public class NestedFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for (int outer=1 ; outer<4; outer++) {
			
			for (int inner=1 ; inner<5 ; inner++) {
				System.out.println("Outer: "+outer+" Inner: "+inner);
			}//end of inner
			
			System.out.println();
			
		}//end of outer
		
	}//main method

}
