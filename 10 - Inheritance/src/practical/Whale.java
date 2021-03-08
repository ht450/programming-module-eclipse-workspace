/**
 * 
 */
package practical;

/**
 * @author Hugh
 *
 */
public class Whale extends Animal {

	private String mainOcean;
	private int weight;
	private int maxSpeed;
	private int length;

	/**
	 * 
	 */
	public Whale() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param mainOcean
	 * @param weight
	 * @param maxSpeed
	 * @param length
	 */
	public Whale(String name, String mainOcean, int weight, int maxSpeed, int length) {
		super(name);
		this.setMainOcean(mainOcean);
		this.setWeight(weight);
		this.setMaxSpeed(maxSpeed);
		this.setLength(length);
	}

	/**
	 * @return the mainOcean
	 */
	public String getMainOcean() {
		return mainOcean;
	}

	/**
	 * @param mainOcean the mainOcean to set
	 */
	public void setMainOcean(String mainOcean) {
		switch (mainOcean) {
		case "Atlantic":
		case "Pacific":
		case "Indian":
		case "Artic":
		case "Southern":
			this.mainOcean = mainOcean;
			break;
		default:
			System.err.println("Invalid Ocean!");
		}
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		if (weight > 0 && weight < 200) {
			this.weight = weight;
		} else {
			System.err.println("Invalid weight!");
		}
	}

	/**
	 * @return the maxSpeed
	 */
	public int getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * @param maxSpeed the maxSpeed to set
	 */
	public void setMaxSpeed(int maxSpeed) {
		if (maxSpeed > 0 && maxSpeed < 25) {
			this.maxSpeed = maxSpeed;
		} else {
			System.err.println("Invalid speed!");
		}
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		if (length > 0 && length < 35) {
			this.length = length;
		} else {
			System.err.println("Invalid length!");
		}
	}

	@Override
	public String toString() {
		return "Whale [mainOcean=" + mainOcean + ", weight=" + weight + ", maxSpeed=" + maxSpeed + ", length=" + length
				+ ", getName()=" + getName() + "]";
	}

}
