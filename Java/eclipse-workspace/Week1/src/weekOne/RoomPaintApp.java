package weekOne;

import java.util.Scanner;

public class RoomPaintApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter room height (m): ");
		double h = sc.nextDouble();
		System.out.print("Enter room width (m): ");
		double w = sc.nextDouble();
		System.out.print("Enter room length (m): ");
		double l = sc.nextDouble();
		double area = 2 * h * (l + w);
		System.out.println("Wall surface area: " + area + "m\u00B2");
		System.out.println("Paint required: " + Math.ceil(area / 10));
		System.out.println("Total cost: €" + 14.50 * Math.ceil(area / 10));

		sc.close();

	}

}
