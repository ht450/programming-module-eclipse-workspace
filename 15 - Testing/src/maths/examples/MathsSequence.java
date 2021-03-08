/**
 * 
 */
package maths.examples;

/**
 * @author Hugh
 *
 */
public class MathsSequence {

	public int[] doubleUp(int seed, int number) {
		
		int[] nums = new int[number];
		nums[0] = seed;
		
		for(int loop = 1; loop < number; loop++) {
			nums[loop] = nums[loop - 1] * seed;
		}
		
		return nums;
	}
	
	
}
