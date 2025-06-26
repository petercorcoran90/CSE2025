package weekOne;

import java.util.Scanner;

public class SpeedLimitCheckerApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter vehicle speed (km/h): ");
			int speed = sc.nextInt();
			if (speed > 0 && speed < 250) {
				if (speed > 120) {
					System.out.println("Over Speed Limit - Fined");
				} else if (speed >= 100) {
					System.out.println("Over Speed Limit - Warning");
				} else if (speed >= 60) {
					System.out.println("Normal Speed");
				} else if (speed >= 30) {
					System.out.println("Cautious Driving");
				} else {
					System.out.println("Too Slow - Hazardous");
				}
			}
			else
				System.out.println("Not a valid speed limit");
			System.out.print("Do you want to check another speed? (y/n): ");
			choice = sc.next();
		}
		sc.close();
	}
}
