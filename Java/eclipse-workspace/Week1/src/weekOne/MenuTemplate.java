package weekOne;

import java.util.Scanner;

public class MenuTemplate {

	public static void main(String[] args) {
		System.out.println("Welcome to..."); // Welcome menu
		System.out.println(); // print a blank line

		// create the Scanner object
		Scanner sc = new Scanner(System.in);

		// perform conversions until choice isn't equal to "y" or "Y"
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			// Your application will run forever until you type something else
			

			// see if the user wants to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}

	}

}