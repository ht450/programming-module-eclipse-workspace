/**
 * 
 */
package present;

import java.io.ObjectInputStream.GetField;

/**
 * @author Hugh
 *
 */
public class Headphones {

	private String make;
	private String model;
	private double price;
	private String colour;
	private boolean wireless = false;
	private boolean noiseCancel = false;
	private String driverSize;
	
	
	/**
	 * 
	 */
	public Headphones() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param make
	 * @param model
	 * @param price
	 * @param colour
	 * @param wireless
	 * @param noiseCancel
	 * @param driverSize
	 */
	public Headphones(String make, String model, double price, String colour, boolean wireless, boolean noiseCancel,
			String driverSize) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
		this.colour = colour;
		this.wireless = wireless;
		this.noiseCancel = noiseCancel;
		this.driverSize = driverSize;
	}


	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}


	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
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
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}


	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}


	/**
	 * @return the wireless
	 */
	public boolean isWireless() {
		return wireless;
	}


	/**
	 * @param wireless the wireless to set
	 */
	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}


	/**
	 * @return the noiseCancel
	 */
	public boolean isNoiseCancel() {
		return noiseCancel;
	}


	/**
	 * @param noiseCancel the noiseCancel to set
	 */
	public void setNoiseCancel(boolean noiseCancel) {
		this.noiseCancel = noiseCancel;
	}


	/**
	 * @return the driverSize
	 */
	public String getDriverSize() {
		return driverSize;
	}


	/**
	 * @param driverSize the driverSize to set
	 */
	public void setDriverSize(String driverSize) {
		this.driverSize = driverSize;
	}
	
	public void playMusic() {
		System.out.println("Music playing...");
	}
	
	public void pauseMusic() {
		System.out.println("Musics paused");
	}
	
	public void wirelessConnect() {
		boolean wireless = isWireless();
		if (wireless) {
			System.out.println("Wireless connecting");
		}
	}
	
	

}
