/**
 * 
 */
package staff;

/**
 * @author Hugh
 *
 */
public class StaffRoom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Doctor dr1 = new Doctor();
		dr1.setFirstName("Martin");
		dr1.setLastName("Ellingham");
		dr1.setWard("Portwenn");
		
		System.out.println(dr1.toString());
	}

}
