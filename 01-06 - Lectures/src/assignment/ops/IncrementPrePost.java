/**
 * 
 */
package assignment.ops;

/**
 * @author Hugh
 *
 */
public class IncrementPrePost {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//increment operator
		int num;
		num=3 ;
		num++;
		System.out.println(num);
		
		// decrement operator
		num--;
		System.out.println(num);
		System.out.println();
		
		//prefix and postfix operators
		// ++num pre and num++ post
		
		int anotherNum=2;
		System.out.println(anotherNum);
		System.out.println(anotherNum++);
		System.out.println(anotherNum);
		
		System.out.println();
		
		anotherNum=2;
		System.out.println(anotherNum);
		System.out.println(++anotherNum);
		System.out.println(anotherNum);
		
	}

}
