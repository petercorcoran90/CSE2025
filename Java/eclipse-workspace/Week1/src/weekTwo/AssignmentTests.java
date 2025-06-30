package weekTwo;

import java.util.Scanner;

public class AssignmentTests {

	public static void main(String[] args) {
		int x = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer (1..10): ");
        x = sc.nextInt();

        if (x >= 1 && x <= 5) {
            int square = x * x;
            System.out.println("The square of " + x + " is: " + square);
        } else if (x >= 6 && x <= 10) {
            int cube = x * x * x;
            System.out.println("The cube of " + x + " is: " + cube);
        } else {
            System.out.println("The input value outside of range 1..10: " + x);
        }

        sc.close();
   
	}

}
