/**
 * 
 */
package tiger.oop;

/**
 * Represents a tiger in the system
 * @author Hugh
 *
 */
public class Tiger {
	
	// instance vars - attributes go here ... (normally always private)
	public int age;
	public String gender;
	public String name;
	
	// constructors go here (later...)

	// methods go here ...
	
	/**
	 * Makes the tiger run
	 */
	public void run() {
		System.out.println(name+"RUNNING >>>>>>>");
	}
	
	/**
	 * Stops the tiger run
	 */
	public void stopRun() {
		System.out.println(name+"NOT RUNNING <<<<<<");
	}
	
	
	
}
