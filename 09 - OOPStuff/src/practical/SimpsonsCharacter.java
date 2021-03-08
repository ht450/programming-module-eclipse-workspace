/**
 * 
 */
package practical;

/**
 * @author Hugh
 *
 */
public class SimpsonsCharacter {

	private String name;
	private String catchPhrase;
	
	/**
	 * default constructor
	 */
	public SimpsonsCharacter() {
		
	}
	
	/**
	 * @param name
	 * @param catchPhrase
	 */
	public SimpsonsCharacter(String name, String catchPhrase) {
		this.name = name;
		this.catchPhrase = catchPhrase;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the catchPhrase
	 */
	public String getCatchPhrase() {
		return catchPhrase;
	}

	/**
	 * @param catchPhrase the catchPhrase to set
	 */
	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}

	/**
	 * method that prints the character saying their catchphrase
	 */
	public void sayCatchPhrase() {
		System.out.println(this.name+" says "+getCatchPhrase());
	}
}
