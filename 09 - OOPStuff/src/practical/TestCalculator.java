/**
 * 
 */
package practical;

/**
 * @author Hugh
 *
 */
public class TestCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		System.out.println(calc.addNumbers(3, 4));
		System.out.println(calc.subtract(5, 2));
		System.out.println(calc.multiply(2, 7));
		System.out.println(calc.divide(9, 3));
		System.out.println(calc.sqrRoot(25));
		
	}

}
