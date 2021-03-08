/**
 * 
 */
package carphone.warehouse;

/**
 * @author Katharine Gregg
 *
 */
public class Phone {
	
	private String make;
	private String model;
	private int rating;
	
	public Phone() {
		
	}
	
	/**
	 * 
	 * @param make
	 * @param model
	 * @param rating
	 */
	public Phone(String make, String model, int rating) {
		this.make = make;
		this.model = model;
		this.setRating(rating);
	}

	/**
	 * 
	 * @return
	 */
	public String getMake() {
		return make;
	}
	/**
	 * 
	 * @param make
	 */
	public void setMake(String make) {
		this.make = make;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getModel() {
		return model;
	}

	/**
	 * 
	 * @param model
	 */
	public void setModel(String model) {
		this.model = model;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getRating() {
		return rating;
	}
 
	/**
	 * 
	 * @param rating
	 */
	public void setRating(int rating) {
		if (rating >= 1 && rating <=5) {
			this.rating = rating;
		} else {
			System.err.println("Invalid rating!");
		}
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Phone [make=" + make + ", model=" + model + ", rating=" + rating + "]";
	}
	
}
