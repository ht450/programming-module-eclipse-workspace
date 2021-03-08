/**
 * 
 */
package constructor;

/**
 * @author Hugh
 *
 */
public class FootballFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Footballer f1 = new Footballer();
		f1.setFirstName("Gareth");
		f1.setLastName("Bale");
		f1.setSquadNumber(11);
		f1.setEmployeeNumber(24242);
		System.out.println(f1.getFirstName()+" "+f1.getLastName());
		
		Footballer f2 = new Footballer("Leo", "Messi", 10, 10101);
		System.out.println(f2.getFirstName());
		System.out.println(f2.getLastName());
		
		Footballer f3 = new Footballer("George", "Best", 999);
		System.out.println(f3.getFirstName());
		System.out.println(f3.getLastName());
		
	}

}
