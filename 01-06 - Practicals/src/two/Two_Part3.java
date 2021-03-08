/**
 * 
 */
package two;

/**
 * @author Hugh
 *
 */
public class Two_Part3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//int
		//1
		int side;
		side = 6;
		System.out.println("Area is "+(side*side));
		
		//double
		//2
		double radius;
		radius = 9;
		System.out.printf("Circle area is %f\n",(radius*radius*3.1415));
		
		//IF statement
		//3
		int num1 = 10, num2 = 10;
		if (num1 > num2) {
			System.out.println(num1);
		}
		if (num2 > num1) {
			System.out.println(num2);
		}
		if (num1 == num2) {
			System.out.println("numbers are the same");
		}
		
		//4
		int yearOfBirth, yearWhenITurn21, yearWhenITurn40, yearWhenIRetireAt60;
		yearOfBirth = 1997;
		yearWhenITurn21 = yearOfBirth + 21;
		yearWhenITurn40 = yearOfBirth + 40;
		yearWhenIRetireAt60 = yearOfBirth + 60;
		System.out.println("Birth: "+yearOfBirth);
		System.out.println("Turn 21: "+yearWhenITurn21);
		System.out.println("Turn 40: "+yearWhenITurn40);
		System.out.println("Retire : "+yearWhenIRetireAt60);
	}

}
