package weekTwo;

import java.util.Scanner;

public class MathsOps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        int product = num1 * num2;
        int difference = num1 - num2;


        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        System.out.println("The product of " + num1 + " and " + num2 + " is " + product);
        System.out.println("The difference of " + num1 + " and " + num2 + " is " + difference);
        if(num2 == 0) System.out.println("num 2 is " + num2 + "; cannot divide by 0: 0");
        else {
            int quotient = num1 / num2;
        	System.out.println("The quotent of " + num1 + " and " + num2 + " is " + quotient);        		
        }
	}

}
