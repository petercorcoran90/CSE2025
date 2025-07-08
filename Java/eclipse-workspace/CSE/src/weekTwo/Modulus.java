package weekTwo;

import java.util.Scanner;

public class Modulus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();


        if(x%y == 0) System.out.println(x + " is a multiple of " + y);
        else System.out.println(x + " is not a multiple of " + y);}
}
