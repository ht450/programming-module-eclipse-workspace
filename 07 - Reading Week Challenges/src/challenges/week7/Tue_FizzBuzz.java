/**
 * 
 */
package challenges.week7;

/**
 * class that contains the solutions to the week 7 reading week daily coding challenge 
 * for Tuesday 29th
 * @author Hugh
 *
 */
public class Tue_FizzBuzz {

	/**
	 * Method implementing the FizzBuzz game
	 * @param args
	 */
	public static void main(String[] args) {
		// print numbers from 1 to 100
		// multiples of 3, print Fizz, instead of the number
		// multiples of 5, print Buzz, instead of the number
		// multiples of 3 AND 5, print Fizz Buzz, instead of the number
		
		for (int loop=1; loop<=100; loop++) {
			if (loop%3==0 && loop%5==0) {
				System.out.println("Fizz Buzz");
			} else if (loop%3==0) {
				System.out.println("Fizz");
			} else if (loop%5==0) {
				System.out.println("Buzz");
			} else {
				System.out.println(loop);
			}//if
		}//for
		
	}// main method
	
}//class 
