/**
 * 
 */
package five;

import java.util.Random;

/**
 * class with solutions to Practical 5: Methods (Part 2)
 * @author Hugh
 *
 */
public class Five_Part2_MethodsWithReturns {

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
//		System.out.println(areaRectangle(15, 6));
//		System.out.println(monthName(2));
//		System.out.println(averageCalculator(3,4,5));
//		System.out.println(g8CapitalCity("Canada"));
		System.out.println(coinToss("heads"));
	}// end of main

	/**
	 * #1
	 * method that takes the base and the height and returns the area
	 * @param base
	 * @param height
	 * @return
	 */
	public static double areaRectangle (double base, double height) {
		double area = base*height;		
		return area;
	}// end of areaRectangle
	
	/**
	 * #2
	 * method that takes a int 1-12 and returns the name of the month
	 * @param monthNumber
	 * @return
	 */
	public static String monthName (int monthNumber) {
		String name;
		switch(monthNumber) {
			case 1:
				name = "Janurary";
				break;
			case 2:
				name = "Feburary";
				break;
				// and so on...
			default:
				name = "Invalid";
		}//end of switch
		return name;
	}//end of monthName method
	
	/**
	 * #3
	 * method that takes three ints and returns their average
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return
	 */
	public static double averageCalculator(int num1, int num2, int num3) {
		double average;
		average = ((double)num1+(double)num2+(double)num3)/3;
		return average;
	}//end of averageCalculator
	
	/**
	 * #4
	 * method takes the name of a g8 country and returns its capital city
	 * @param g8Country
	 * @return
	 */
	public static String g8CapitalCity(String g8Country) {
		String capital;
		switch (g8Country) {
			case "Canada":
				capital = "Ottawa";
				break;
			//and so on...
			default :
				capital = "Invalid";
		}
		return capital;
	}//end of g8CapitalCity
	
	/** #5
	 * method that randomly 'tosses a coin' and after taking a user guess it will return if they are right or wrong
	 * @param userCall
	 * @return
	 */
	public static String coinToss(String userCall) {
		int tossInt;
		String toss="";
		String rightOrWrong;
		Random rand = new Random();
		
		//do coin toss
		tossInt = rand.nextInt(3);
		if (tossInt==1) {
			toss = "heads";
		} else if (tossInt==2) {
			toss = "tails";
		}
		
		//check is user got it right
		if (
			(userCall.equalsIgnoreCase("heads") && toss.equals("heads"))
			||
			(userCall.equalsIgnoreCase("tails") && toss.equals("tails"))
			) {
			rightOrWrong = "right";
		} else {
			rightOrWrong = "wrong";
		}
		
		return rightOrWrong;
	}//end of coinToss
	
	
	
	
}// end of class
