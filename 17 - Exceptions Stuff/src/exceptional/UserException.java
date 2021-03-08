/**
 * 
 */
package exceptional;

/**
 * @author Hugh
 *
 */
public class UserException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private String originOfProblem;
	
	/**
	 * Constructor for the UserException. 
	 * Takes a string and add to the super class message
	 * 
	 * @param message
	 */
	public UserException(String message) {
		super("Aidan exception type : " + message);
	}

	/**
	 * @return the originOfProblem
	 */
	public String getOriginOfProblem() {
		return originOfProblem;
	}

	/**
	 * @param originOfProblem the originOfProblem to set
	 */
	public void setOriginOfProblem(String originOfProblem) {
		this.originOfProblem = originOfProblem;
	}

}
