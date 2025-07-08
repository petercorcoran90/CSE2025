package weekTwo;

import java.util.Scanner;

public class AsciiValues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String choice = "";

		while (!choice.equalsIgnoreCase("x")) {

			System.out.print("Enter char: ");
			choice = sc.next();
			System.out.println("Ascii value of " + choice + " is " + (int) choice.charAt(0));
		}
		sc.close();

	}

}
