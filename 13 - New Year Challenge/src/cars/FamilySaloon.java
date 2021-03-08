/**
 * 
 */
package cars;

/**
 * @author Hugh
 *
 */
public class FamilySaloon extends Car {

	private boolean metallicPaint;
	
	/**
	 * default constructor
	 */
	public FamilySaloon() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * constructor with args
	 * @param make
	 * @param model
	 * @param horsePower
	 */
	public FamilySaloon(String make, String model, int horsePower, boolean metallicPaint) {
		super(make, model, horsePower);
		this.metallicPaint = metallicPaint;
	}

	/**
	 * @return the metallicPaint
	 */
	public boolean isMetallicPaint() {
		return metallicPaint;
	}

	/**
	 * @param metallicPaint the metallicPaint to set
	 */
	public void setMetallicPaint(boolean metallicPaint) {
		this.metallicPaint = metallicPaint;
	}

	/**
	 * method prints all the details about the family saloon
	 */
	@Override
	public void displayAll() {
		System.out.println("Family Saloon");
		super.displayAll();
		System.out.printf("%-20s: %b\n","MetallicPaint",this.metallicPaint);
	}
	
}
