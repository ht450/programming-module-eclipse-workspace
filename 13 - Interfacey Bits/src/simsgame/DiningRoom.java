/**
 * 
 */
package simsgame;

import java.util.ArrayList;

/**
 * @author Hugh
 *
 */
public class DiningRoom {

	public ArrayList<Person> diners = new ArrayList<Person>();
	public ArrayList<IPest> pestsList = new ArrayList<IPest>();
		
	/**
	 * default constructor
	 */
	public DiningRoom() {
		
	}
	
	/**
	 * constructor with args
	 * 
	 * @param diners
	 * @param pestsList
	 */
	public DiningRoom(ArrayList<Person> diners, ArrayList<IPest> pestsList) {
		this.diners = diners;
		this.pestsList = pestsList;
	}
	/**
	 * method that calls the beAnnoying method for each pest
	 */
	public void serveFood() {
		System.out.println("Serving Food.....");
		for (IPest pest: pestsList) {
			pest.beAnnoying();
		}
	}
	
}
