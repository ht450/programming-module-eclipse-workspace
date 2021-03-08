/**
 * 
 */
package abstraction;

/**
 * @author Hugh
 *
 */
public class Reader extends Employee {

	private String research;
	
	/**
	 * 
	 */
	public Reader() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param firstName
	 * @param lastName
	 */
	public Reader(String firstName, String lastName, String research) {
		super(firstName, lastName);
		this.research = research;
	}

	/**
	 * @return the research
	 */
	public String getResearch() {
		return research;
	}

	/**
	 * @param research the research to set
	 */
	public void setResearch(String research) {
		this.research = research;
	}

	/**
	 * 
	 */
	@Override
	public void calSalary(int hrs, int rate) {
		System.out.println(this.getFirstName()+" "+this.getLastName()+" is getting £"+(hrs*rate*1.9));
	}
	
	

}
