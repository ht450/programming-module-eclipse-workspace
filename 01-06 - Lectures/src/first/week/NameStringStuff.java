/**
 * 
 */
package first.week;

/**
 * @author Hugh
 *
 */
public class NameStringStuff {

	/** 
	 * @param args
	 */
	public static void main(String[] args) {
		//declare a string
		String myForename, mySurname;
		
		//assign a value (called initialising when done first)(= is the assignment operator)
		myForename = "Hugh";
		mySurname = "Tiernan";
		
		System.out.println("My name is "+myForename+" "+mySurname);
		System.out.printf("My name is %s %s\n", myForename, mySurname);
		
		//number of chars in the name
		System.out.println(myForename.length());
		
		//make full name (includes space between)(my method)
		String myFullname = myForename+" "+mySurname; //include declaration at the top
		System.out.println(myFullname+"\nName length: "+myFullname.length()+" including space");
		
		//alternatively (not including space between)(class demo)
		int fullNameLength = myForename.length() + mySurname.length(); //include at the top
		System.out.println("Name length: "+fullNameLength+" excluding space");
		
		//find a way to use my method but not include the space
		
	}

}
