package challenge1;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {

		int userOption;
		Scanner scanner = new Scanner(System.in);
		boolean menuAgain = false;

		do {
			menuAgain = false;
			
			System.out.println("Menu ");
			System.out.println("1 - File");
			System.out.println("2 - Edit");
			System.out.println("3 - Quit");
			System.out.println("Enter option ");

			userOption = scanner.nextInt();

			switch (userOption) {
			case 1:
				System.out.println("Filing...");
				menuAgain = true;
				break;
			case 2:
				System.out.println("Editing");
				menuAgain = true;
				break;
			case 3:
				System.out.println("Quitting");
				menuAgain = false;
				break;
			default:
				System.out.println("Try again...");
				break;
			}

		} while (menuAgain);

		scanner.close();
	}
}
