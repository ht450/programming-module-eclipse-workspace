/**
 * 
 */
package monkey.oop;

/**
 * @author Hugh
 *
 */
public class ZooFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Monkey m1 = new Monkey();
		m1.name = "Coco";
		m1.colour = "Red";
		System.out.println(m1.name);
		System.out.println(m1.colour);
		m1.climb();
		
		Monkey m2 = new Monkey();
		m2.name = "George";
		m2.colour = "Blue";
		System.out.println(m2.name);
		System.out.println(m2.colour);
		m2.climb();
		
		
	}

}
