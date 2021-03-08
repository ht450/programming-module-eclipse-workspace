/**
 * 
 */
package race;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Hugh
 *
 */
public class MapRace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// map to hold race data
		SortedMap<Double, String> raceResults = new TreeMap<Double, String>();
		raceResults.put(9.81, "Usain Bolt");
		raceResults.put(10.06, "Trayvon Bromell");
		raceResults.put(9.91, "Andre De Grasse");
		raceResults.put(10.04, "Jimmy Vicaut");
		raceResults.put(9.89, "Justin Gatlin");
		raceResults.put(9.26, "Hugh Tiernan");
		raceResults.put(9.93, "Yohan Blake");
		raceResults.put(9.96, "Ben Yousseff Meite");
		raceResults.put(9.94, "Akani Simbine");
		raceResults.put(10.66, "Batla Hastings");
		raceResults.put(13.65, "Slowck Oach");

		// print starting messages with a time delay between
		System.out.println("2016 Olympic 100 meters race simulator\n");
		try {
			Thread.sleep(1000);
			System.out.println("ON YOUR MARKS");
			Thread.sleep(2000);
			System.out.println("GET SET");
			Thread.sleep(3000);
			System.out.println("BANG!");
		} catch (Exception e) {
		}
		System.out.println("Race started ....");

		// make each runner a separate thread to run simultaneously
		for (Double raceTime : raceResults.keySet()) {
			
			RacerThread racerThread = new RacerThread();
			
			// set racers data
			racerThread.setTimeTaken(raceTime);
			racerThread.setName(raceResults.get(raceTime));

			Thread runnerThread = new Thread(racerThread);
			runnerThread.start();
		}
		
	}

}
