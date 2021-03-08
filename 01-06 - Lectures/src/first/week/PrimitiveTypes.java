/**
 * 
 */
package first.week;

/**
 * @author Hugh
 *
 */
public class PrimitiveTypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	//for non-floating point numbers
		
		//declare a byte
		byte myByte;
		//give it an initial value (also known as an initialisation
		myByte = 25; //(a vlaue that is too big is called overflow)
		System.out.println("byte: "+myByte);
		
		// declare short
		short myShort;
		myShort = 30000;
		System.out.println("short: "+myShort); //+ operator is the Concatenation operator
		
		//declare int
		int myInt = 1209323;
		System.out.println("my int is... "+myInt+" and that's magic");
		
		// Long
		long myLong = 1234567890123L;
		System.out.println("big long boi: "+myLong);
		
		
	//for floating point numbers
		
		//float
		float myFloat = 3.1415926f;
		System.out.println("my float: "+myFloat);
		
		//double
		double myD = 1.23456789;
		System.out.printf("My double is ... %.4f",myD);

	//for single character
		
		//char
		char myChar;
		myChar = 'a';
		System.out.println(myChar);
		
	//Boolean
		boolean myBool;
		myBool = true; //only options are true or false
		System.out.println("I love programming: "+myBool);
		
		myBool = false;
		System.out.println("I hate programming: "+myBool);
		
	}

}
