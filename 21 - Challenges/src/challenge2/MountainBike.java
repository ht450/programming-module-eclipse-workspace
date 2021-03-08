package challenge2;

public class MountainBike extends Bike {

	private boolean suspension;
	
	public MountainBike() {
		
	}
	
	public MountainBike(int numberOfWheels, Material material, boolean suspension) {
		super(numberOfWheels, material);
		this.setSuspension(suspension);
	}

	/**
	 * @return the suspension
	 */
	public boolean isSuspension() {
		return suspension;
	}

	/**
	 * @param suspension the suspension to set
	 */
	public void setSuspension(boolean suspension) {
		this.suspension = suspension;
	}
	
	
}
