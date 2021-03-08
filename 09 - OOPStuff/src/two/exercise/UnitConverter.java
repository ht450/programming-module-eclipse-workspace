/**
 * 
 */
package two.exercise;

/**
 * class that represents a measurement converter
 * @author Hugh
 *
 */
public class UnitConverter {
	
	/**
	 * method that takes centimetres and returns the equivalent inches
	 * @param cms
	 * @return
	 */
	public double cmToInches(double cms) {
		double inches = cms*0.394;
		return inches;
	}
	
	/**
	 * method that takes inches and returns the equivalent centimetres
	 * @param inches
	 * @return
	 */
	public double inchesToCms(double inches) {
		double cms = inches*2.54;
		return cms;
	}
	
	/**
	 * method that takes kilometres and returns the equivalent miles
	 * @param kms
	 * @return
	 */
	public double kmToMiles(double kms) {
		double miles = kms*0.621;
		return miles;
	}
	
	/**
	 * method that takes miles and returns the equivalent kilometres
	 * @param miles
	 * @return
	 */
	public double milesToKms(double miles) {
		double kms = miles*1.609;
		return kms;
	}
	
}//class
