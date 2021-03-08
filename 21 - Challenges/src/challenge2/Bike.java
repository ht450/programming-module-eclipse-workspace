package challenge2;

enum Material {
	CARBON, STEEL, WOOD;
}

public abstract class Bike {
	private int numberOfWheels;
	private Material material;

	public Bike() {
	}
	/** 
	 * Constructor with args
	 * @param numberOfWheels
	 * @param material
	 */
	public Bike(int numberOfWheels, Material material) {
		this.setNumberOfWheels(numberOfWheels);
		this.setMaterial(material);
		}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) throws IllegalArgumentException {
		if (numberOfWheels >= 1 && this.numberOfWheels <= 3) {
			this.numberOfWheels = numberOfWheels;
		} else {
			throw new IllegalArgumentException("Bad value");
		}
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}
}
