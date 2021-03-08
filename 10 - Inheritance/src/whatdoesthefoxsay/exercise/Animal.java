/**
 * 
 */
package whatdoesthefoxsay.exercise;

/**
 * @author laura
 *
 */
public class Animal {
	
	//vars
	private String name;
	private String noise;
	private String eyeColour;
	private String noseType;
	private String pawSize;
	private String furColour;
	
	//constructor
	public Animal() {

	}
	
	public Animal(String name, String noise, String eyeColour, String noseType, String pawSize, String furColour) {
		this.name = name;
		this.setNoise(noise);
		this.eyeColour = eyeColour;
		this.noseType = noseType;
		this.pawSize = pawSize;
		this.furColour = furColour;
	}
	
	/**
	 * @param name
	 * @param noise
	 */
	public Animal(String name, String noise) {
		this.name = name;
		this.setNoise(noise);
	}

	//getter and setter
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
		this.noise = noise.toUpperCase();
	}
	/**
	 * @return the eyeColor
	 */
	public String getEyeColor() {
		return eyeColour;
	}
	/**
	 * @param eyeColor the eyeColor to set
	 */
	public void setEyeColor(String eyeColor) {
		this.eyeColour = eyeColor;
	}
	/**
	 * @return the noseType
	 */
	public String getNoseType() {
		return noseType;
	}
	/**
	 * @param noseType the noseType to set
	 */
	public void setNoseType(String noseType) {
		this.noseType = noseType;
	}
	/**
	 * @return the pawSize
	 */
	public String getPawSize() {
		return pawSize;
	}
	/**
	 * @param pawSize the pawSize to set
	 */
	public void setPawSize(String pawSize) {
		this.pawSize = pawSize;
	}
	/**
	 * @return the furColour
	 */
	public String getFurColour() {
		return furColour;
	}
	/**
	 * @param furColour the furColour to set
	 */
	public void setFurColour(String furColour) {
		this.furColour = furColour;
	}

	/**
	 * method that prints the animal and its noise
	 */
	public void makeNoise() {
		System.out.println(this.name+" goes "+this.noise);
	}
	
	@Override
	public String toString() {
		return "Animal [name = " + name + ", noise = " + noise + ", eyeColour = " + eyeColour + ", noseType = " + noseType
				+ ", pawSize = " + pawSize + ", furColour = " + furColour + "]";
	}
	
	
	
	
	

}
