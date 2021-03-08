/**
 * 
 */
package tiger.oop;

/**
 * @author Hugh
 *
 */
public class ZooKeeper {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("ZooKeeper start");
		
		//create an object from the Tiger class
		Tiger tiger1 = new Tiger();
		tiger1.age = 3;
		tiger1.gender = "male";
		tiger1.name = "Tony";
		
		System.out.println(tiger1.age);
		System.out.println(tiger1.gender);
		System.out.println(tiger1.name);
		
		tiger1.run();
		tiger1.stopRun();
		
		// another tiger
		Tiger tiger2 = new Tiger();
		tiger2.age = 66;
		tiger2.gender = "female";
		tiger2.name = "Annie";
		
		System.out.println(tiger2.age);
		System.out.println(tiger2.gender);
		System.out.println(tiger2.name);
		
		tiger2.run();
		tiger2.stopRun();
		
		

		System.out.println("ZooKeeper End");
		
	}//main

}//class
