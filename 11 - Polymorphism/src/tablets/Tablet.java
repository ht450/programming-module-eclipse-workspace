/**
 * 
 */
package tablets;

/**
 * @author Hugh
 *
 */
public class Tablet {

	private String manufacturer;
	private String model;
	private double price;
	private boolean android;
	private double size;
	private String notes;

	/**
	 * 
	 */
	public Tablet() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param manufacturer
	 * @param model
	 * @param price
	 * @param android
	 * @param size
	 * @param notes
	 */
	public Tablet(String manufacturer, String model, double price, boolean android, double size, String notes) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.price = price;
		this.android = android;
		this.setSize(size);
		this.setNotes(notes);
	}


	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the android
	 */
	public boolean isAndroid() {
		return android;
	}

	/**
	 * @param android the android to set
	 */
	public void setAndroid(boolean android) {
		this.android = android;
	}

	/**
	 * @return the size
	 */
	public double getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(double size) {
		if (size > 5 && size < 21) {
			this.size = size;
		} else {
			System.err.println("Invalid size, defaulted to 10");
			this.size = 10;
		}
	}

	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		if (notes.length()>250) {
			System.err.println("Warning: notes will be truncated to 250 characters.");
		}
		this.notes = notes;
	}

	/**
	 * prints all details about this tablet.
	 */
	public void allDetails() {
		System.out.println("Tablet Details__________");
		System.out.println("Manufacturer : " + this.manufacturer);
		System.out.println("Model : " + this.model);
		System.out.println("Price : " + this.price);
		System.out.println("Android : " + this.android);
		System.out.println("Size : " + this.size);
		System.out.println("Notes : " + this.notes);
	}
}
