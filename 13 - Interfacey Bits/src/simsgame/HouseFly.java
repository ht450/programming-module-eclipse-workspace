/**
 * 
 */
package simsgame;

/**
 * @author Hugh
 *
 */
public class HouseFly extends Insect implements IPest {

	/**
	 * default constructor
	 */
	public HouseFly() {

	}

	/**
	 * constructor with args
	 * 
	 * @param insectType
	 */
	public HouseFly(String insectType) {
		super(insectType);
	}

	/**
	 * 
	 */
	@Override
	public void beAnnoying() {
		this.flyAroundYourHead();
		this.sitOnFood();
	}

	/**
	 * 
	 */
	private void flyAroundYourHead() {
		System.out.println("Buzzzzzzzzzzzzzzzzzzzzz!");
	}
	
	/**
	 * 
	 */
	private void sitOnFood() {
		System.out.println("Haha - just sat on your food.");
	}
}
