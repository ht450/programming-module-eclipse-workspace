/**
 * 
 */
package simsgame;

/**
 * @author Hugh
 *
 */
public class Baby extends Person implements IPest {

	/**
	 * default constructor
	 */
	public Baby() {
		
	}

	/**
	 * constructor with args
	 * 
	 * @param name
	 */
	public Baby(String name) {
		super(name);
	}

	/**
	 * method makes the baby be annoying (calls cry method)
	 */
	@Override
	public void beAnnoying() {
		this.cry();
	}
	
	/**
	 * method makes the baby cry
	 */
	private void cry() {
		System.out.println("Whaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	}
	
}
