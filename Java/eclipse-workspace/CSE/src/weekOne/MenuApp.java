package weekOne;

import java.util.Scanner;

public class MenuApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("----- MENU -----");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("1. Say Hello");
			System.out.println("2. Show your name");
			System.out.println("3. Exit");
			System.out.println("Enter your choice (1-3): ");

			int menu = sc.nextInt();

			if (menu == 1)
				System.out.println("Hello there!");
			else if (menu == 2)
				System.out.println("My name is MenuApp.");
			else {
				System.out.println("Goodbye!");
				break;
			}

			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}

		sc.close();

	}
}
