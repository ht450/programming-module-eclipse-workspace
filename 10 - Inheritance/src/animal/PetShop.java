/**
 * 
 */
package animal;

/**
 * @author Hugh
 *
 */
public class PetShop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bird tweety = new Bird("Tweety", "SQUEAK", "blue", 0.30, true);
		tweety.flyAway();
		
		System.out.println();
		tweety.setFly(false);
		tweety.flyAway();
	}

}
