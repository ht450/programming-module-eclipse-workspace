/**
 * 
 */
package two.exercise;

/**
 * class that is used to convert measurements
 * @author Hugh
 *
 */
public class BuilderHelperApp {

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		double testNum, multiplier;
		UnitConverter unitConverter = new UnitConverter();
		
		testNum=1;
		
		// cms to inches
		System.out.println("cms to inches");
		multiplier=0.394;
		System.out.println("in line: "+testNum*multiplier);
		testingConversions(unitConverter.cmToInches(testNum), testNum, multiplier);
		
		// inches to cms
		System.out.println("\ninches to cms");
		multiplier=2.54;
		System.out.println("in line: "+testNum*multiplier);
		testingConversions(unitConverter.inchesToCms(testNum), testNum, multiplier);

		// miles to kms
		System.out.println("\nmiles to kms");
		multiplier=1.609;
		System.out.println("in line: "+testNum*multiplier);
		testingConversions(unitConverter.milesToKms(testNum), testNum, multiplier);

		// kms to miles
		System.out.println("\nkms to miles");
		multiplier=0.621;
		System.out.println("in line: "+testNum*multiplier);
		testingConversions(unitConverter.kmToMiles(testNum), testNum, multiplier);

	}//main

	public static void testingConversions(Object converter, double testNum, double multiplier) {
		double convertedNum = (double) converter;
		System.out.println("method: "+convertedNum);
		if ( convertedNum == testNum*multiplier) {
			System.out.println("Test passed");
		} else {
			System.err.println("Test failed");
		}
	}
}//class
