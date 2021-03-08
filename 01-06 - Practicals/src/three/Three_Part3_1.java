/**
 * 
 */
package three;

import java.util.Scanner;

/**
 * @author Hugh
 *
 */
public class Three_Part3_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int age ;
		String name = "";
		Scanner scanner = new Scanner(System.in);

		
		// ask user for age
		System.out.println("Hi, what age are you?");
		age = scanner.nextInt();
		
		// check age is valid - print "sorry don't recognise your input"
		if (age <= 0 || age > 150) {
			System.out.println("Sorry, I don't recognise your input.");
		} else if (age < 18 ) { // if not over 17 print 'too young to continue'
			System.out.println("Sorry, too young to continue!");
		} else { // if over 17 ask for name
			System.out.println("What is your name?");
			name = scanner.next();
			// print name and age
			System.out.println("Your name is "+name+" and you are "+age+" years old.");
		}
		
		scanner.close();
	}

}
