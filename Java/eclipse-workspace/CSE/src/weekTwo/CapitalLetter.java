package weekTwo;

import java.util.Scanner;

public class CapitalLetter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a letter (a-zA-Z): ");
		String input = sc.next();

		char ch = input.charAt(0);

		if (Character.isUpperCase(ch)) {
			System.out.println("Ascii value of " + ch + " is " + (int) ch);
			System.out.println("Uppercase: " + ch);
		} else if (Character.isLowerCase(ch)) {
			System.out.println("Ascii value of " + ch + " is " + (int) ch);
			System.out.println("Lowercase: " + ch);
		} else {
			System.out.println("Error in input: "+ ch);
		}

		sc.close();

	}

}
