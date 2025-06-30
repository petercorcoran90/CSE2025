package weekTwo;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        final double PI = 3.14;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();

        double diameter = 2 * radius;
        double circumference = 2 * PI * radius;
        double area = PI * radius * radius;

        System.out.println("The diameter is " + diameter);
        System.out.println("The circumference is " + circumference);
        System.out.println("The area is " + area);

        sc.close();
    }
}
