/**
 * 
 */
package practical;

/**
 * @author Hugh
 *
 */
public class HospitalPayroll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pharmacist pharma = new Pharmacist("Drew", "Ugman", 15.60, 4, 1234.56);
		Surgeon surg = new Surgeon("Serge", "Gione", 29.86, "Brain", 600.00);
		
		System.out.println("Surgeon : admin controlled drug : "+surg.adminControlledDrug());
		System.out.println("Surgeon : admin noncontrolled drug : "+surg.adminNoncontrolledDrug());
		
		System.out.println("Pharmacist : admin controlled drug : "+pharma.adminControlledDrug());
		System.out.println("Pharmacist : admin noncontrolled drug : "+pharma.adminNoncontrolledDrug());
		
	}

}
