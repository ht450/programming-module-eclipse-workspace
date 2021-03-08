/**
 * 
 */
package staff2;

/**
 * @author Hugh
 *
 */
public class OfficeManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StaffMember sm1 = new StaffMember();
		sm1.setFirstName("George");
		sm1.setLastName("Best");
		System.out.println(sm1.toString());
		
		StaffMember sm2 = new StaffMember("John", "Smyth");
		System.out.println(sm2.toString());
		
		Footballer f1 = new Footballer();
		f1.setFirstName("Jimmy");
		f1.setLastName("Joe");
		f1.setGoalsScored(34);
		System.out.println(f1.toString());
		
		Footballer f2 = new Footballer("Gareth","Bale",1);
		System.out.println(f2.toString());
		
		
	}

}
