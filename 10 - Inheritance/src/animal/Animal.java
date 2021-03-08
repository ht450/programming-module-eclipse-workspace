/**
 * 
 */
package animal;

/**
 * @author Hugh
 *
 */
public class Animal {

	private String name;
	private String noise;
	private String eyeColour;
	
	/**
	 * default constructor.
	 */
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * constructor with all arguments.
	 * @param name
	 * @param noise
	 * @param eyeColour
	 */
	public Animal(String name, String noise, String eyeColour) {
		this.name = name;
		this.noise = noise;
		this.eyeColour = eyeColour;
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
	 * @return the noise
	 */
	public String getNoise() {
		return noise;
	}

	/**
	 * @param noise the noise to set
	 */
	public void setNoise(String noise) {
		this.noise = noise;
	}

	/**
	 * @return the eyeColour
	 */
	public String getEyeColour() {
		return eyeColour;
	}

	/**
	 * @param eyeColour the eyeColour to set
	 */
	public void setEyeColour(String eyeColour) {
		this.eyeColour = eyeColour;
	}

	/**
	 * method that prints the animals name and the noise it makes.
	 */
	public void makeNoise() {
		System.out.println(this.name+" goes "+this.noise);
	}
}
