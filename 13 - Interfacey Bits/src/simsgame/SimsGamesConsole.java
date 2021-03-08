/**
 * 
 */
package simsgame;

import java.util.ArrayList;

/**
 * @author Hugh
 *
 */
public class SimsGamesConsole {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// create people
		Person diner1 = new Person("Zayne");
		Person diner2 = new Person("Claire");
		
		ArrayList<Person> diners = new ArrayList<Person>();
		diners.add(diner1);
		diners.add(diner2);
		
		// create pests
		IPest pest1 = new HouseFly();
		IPest pest2 = new HouseFly();
		IPest pest3 = new HouseFly();
		
		IPest pest4 = new Telesales();
		IPest pest5 = new Telesales();
		
		IPest pest6 = new Baby("Neil");

		// how to see the underlying structure
		//HouseFly houseFly = (HouseFly) pest1;
		//houseFly.getInsectType();
		
		ArrayList<IPest> dinnerPests = new ArrayList<IPest>();
		dinnerPests.add(pest1);
		dinnerPests.add(pest2);
		dinnerPests.add(pest3);
		dinnerPests.add(pest4);
		dinnerPests.add(pest5);
		
		// dinner time
		DiningRoom dinnerTime = new DiningRoom(diners, dinnerPests);
		System.out.println("Dinner Time : ");
		dinnerTime.serveFood();
		
		// breakfast time
		ArrayList<IPest> breakfastPests = new ArrayList<IPest>();
		breakfastPests.add(pest1);
		
		DiningRoom breakfastTime = new DiningRoom(diners, breakfastPests);
		System.out.println("\nBreakfast : ");
		breakfastTime.serveFood();
		
		// added baby
		ArrayList<IPest> dinnerPestsWithChild = new ArrayList<IPest>();
		dinnerPestsWithChild.add(pest1);
		dinnerPestsWithChild.add(pest2);
		dinnerPestsWithChild.add(pest3);
		dinnerPestsWithChild.add(pest4);
		dinnerPestsWithChild.add(pest5);
		dinnerPestsWithChild.add(pest6);
		
		DiningRoom dinnerWithChild = new DiningRoom(diners, dinnerPestsWithChild);
		System.out.println("\nBaby is in bed... Time for food...");
		dinnerWithChild.serveFood();
		
		
	}

}
