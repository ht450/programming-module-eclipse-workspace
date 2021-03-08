/**
 * 
 */
package simsgame;

/**
 * @author Hugh
 *
 */
public class Telesales extends Person implements IPest {

	/**
	 * default constructor
	 */
	public Telesales() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * constructor with args
	 * 
	 * @param name
	 */
	public Telesales(String name) {
		super(name);
	}
	
	/**
	 * 
	 */
	@Override
	public void beAnnoying() {
		this.makePhoneRing();
	}
	
	/**
	 * 
	 */
	private void makePhoneRing() {
		System.out.println("Ring Ring Ring Ring");
	}
}
