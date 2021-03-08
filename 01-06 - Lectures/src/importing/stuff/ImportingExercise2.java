/**
 * 
 */
package importing.stuff;

import java.util.Scanner;

/**
 * @author Hugh
 *
 */
public class ImportingExercise2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double side, area, perimeter ;
		Scanner scanner = new Scanner(System.in);
		
		//ask user for length of square
		System.out.println("Enter the length of the side (in cm): ");
		side = scanner.nextDouble();
		
		//calculate and output perimeter and area
		perimeter = side*4 ;
		area = Math.pow(side, 2);
		
		// print results
		System.out.printf("Square of Side Length: %.2fcm \n", side);
		System.out.printf("Perimeter length: %.2fcm \n", perimeter);
		System.out.printf("Area: %.2fcm^2", area);
		
		scanner.close();
	}

}
