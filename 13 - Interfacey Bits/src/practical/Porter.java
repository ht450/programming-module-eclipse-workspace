/**
 * 
 */
package practical;

/**
 * @author Hugh
 *
 */
public class Porter extends Employee {

	private String site;
	
	/**
	 * default constructor
	 */
	public Porter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * constructor with args
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 * @param site
	 */
	public Porter(String firstName, String lastName, double baseRate, String site) {
		super(firstName, lastName, baseRate);
		this.site = site;
	}

	/**
	 * @return the site
	 */
	public String getSite() {
		return site;
	}

	/**
	 * @param site the site to set
	 */
	public void setSite(String site) {
		this.site = site;
	}

	/**
	 * method that prints all the instance vars for this Porter.
	 */
	@Override
	public void printAll() {
		super.printAll();
		System.out.println("Site : " + site);
	}
	

}
