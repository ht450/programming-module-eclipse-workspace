/**
 * 
 */
package wrap;

import java.util.ArrayList;

/**
 * @author Hugh
 *
 */
public class Wrappers {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int pInt = 999;
		
		Integer wrapperInt = new Integer(8383);
		
		Integer int1 = new Integer("43");
		System.out.println(int1);

		//Integer int2 = new Integer("ten");
		//System.out.println(int2);
		
		// wrapper with collections...
		ArrayList<Integer> arrayInt = new ArrayList<Integer>();
		arrayInt.add(new Integer("101"));
		arrayInt.add(new Integer(25));
		
		// not better?
		Integer myInt = new Integer(32);
		arrayInt.add(myInt);		
		
		System.out.println(arrayInt.toString());
		
		// other useful methods...
		
		Integer intW = new Integer(40);
		// get the int value
		int weeInt = intW.intValue();
		// convert to a double
		double weeD = intW.doubleValue();
		// parse from string
		Integer intFromStr = Integer.parseInt("66");
		// addition of Integer with double/float
		Double weeD2 = intW.doubleValue() + 3.123;
		
	}

}
