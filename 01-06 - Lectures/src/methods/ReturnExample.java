/**
 * 
 */
package methods;

/**
 * @author Hugh
 *
 */
public class ReturnExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Main start");
		System.out.println(biggestNumber(10, 20));
		
		int bigOne = biggestNumber(11, 12);
		System.out.println(bigOne);
	}//end of main

	/**
	 * Method will return the biggest number when given two numbers to compare (assuming the two numbers are different)
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static int biggestNumber (int num1, int num2) {
		int biggestNumber;
		if (num1>num2) {
			biggestNumber = num1;
		} else {
			biggestNumber = num2;
		}
		return biggestNumber;
	}//end of biggestNumber
	
	
	
}//end of class
