/**
 * 
 */
package animal;

/**
 * @author Hugh
 *
 */
public class Bird extends Animal {

	private double wingSpan;
	private boolean fly;
	
	/**
	 * default constructor;
	 */
	public Bird() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param noise
	 * @param eyeColour
	 */
	public Bird(String name, String noise, String eyeColour, double wingSpan, boolean fly) {
		super(name, noise, eyeColour);
		this.wingSpan = wingSpan;
		this.fly = fly;
	}

	/**
	 * @return the wingSpan
	 */
	public double getWingSpan() {
		return wingSpan;
	}

	/**
	 * @param wingSpan the wingSpan to set
	 */
	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}

	/**
	 * @return the fly
	 */
	public boolean isFly() {
		return fly;
	}

	/**
	 * @param fly the fly to set
	 */
	public void setFly(boolean fly) {
		this.fly = fly;
	}
	
	/**
	 * method that makes the bird fly away. If it can't fly it prints a message.
	 */
	public void flyAway() {
		if (isFly()) {
			System.out.println(this.getName()+" is flying away!");
		} else {
			System.out.println(this.getName()+" can't fly!!!");
			this.makeNoise();
		}
	}

	
}
