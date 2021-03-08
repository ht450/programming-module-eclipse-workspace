/**
 * 
 */
package carphone.warehouse;

/**
 * @author Katharine Gregg
 *
 */
public class CarphoneWarehouse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.setMake("Apple iPhone");
		p1.setModel("11");
		p1.setRating(4);
		System.out.println(p1.toString());
		
		Phone p2 = new Phone("Samsung Galaxy","S10",2);
		System.out.println(p2.toString());
	}

}
