/**
 * 
 */
package mountain.shorthand.exercise;

/**
 * @author Hugh
 *
 */
public class MountainRange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mountain m1 = new Mountain();
		m1.setName("Everest");
		m1.setHeight(88480000);
		System.out.println(m1.getName());
		System.out.println(m1.getHeight());		
		
		Mountain m2 = new Mountain();
		m2.setName("Slieve Donard");
		m2.setHeight(838);
	}

}
