/**
 * 
 */
package exceptional;

/**
 * @author Hugh
 *
 */
public class UncheckedException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		UncheckedException unc = new UncheckedException();
		
		try {
			unc.checkNumber(6, 0);
		} catch (Exception e) {
			System.out.println("That was a zero");
			System.err.println("REALLY BAD THING JUST HAPPENED!");
		}
		
	}
	
	/**
	 * this method divides num1 by num2
	 * 
	 * @param num1
	 * @param num2
	 * @throws ArithmeticException - if a zero is passed as num2
	 */
	public void checkNumber(int num1, int num2) throws ArithmeticException {
		if (num2==0) {
			throw new ArithmeticException("A Zero");
		} else {
			System.out.println(num1/num2);
		}
	}

}
