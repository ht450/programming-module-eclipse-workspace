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
	 * constructor with all args
	 * @param firstName
	 * @param lastName
	 * @param baseRate
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
	 * method for calculating porter weekly salary
	 */
	@Override
	public void calculateWeeklySalary(double hours) {
		double salary = (this.getBaseRate()*hours);
		System.out.printf("%-10s %-10s [%-10s] : %.2fhrs * £%.2f = £%.2f\n", getFirstName(), getLastName(), "Porter", hours, getBaseRate(), salary);
	}
	@Override
	public void printAll() {
		System.out.printf("[%-10s] %-10s %-10s %.2f Site: %s\n", "Porter", getFirstName(), getLastName(), getBaseRate(), this.site);
	}
	

}
