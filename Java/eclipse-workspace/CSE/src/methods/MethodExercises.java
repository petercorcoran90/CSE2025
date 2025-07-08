package methods;

import java.util.Scanner;

public class MethodExercises {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();
        System.out.println("The sum of " + x + " and " + y + " is " + calculateSum(x,y));
        System.out.println("The product of " + x + " and " + y + " is " + calculateProduct(x,y));
        System.out.println("The difference of " + x + " and " + y + " is " + calculateDifference(x,y));
        System.out.println("The quotient of " + x + " and " + y + " is " + calculateQuotient(x,y));
        System.out.print("\nEnter Length: ");
        int l = sc.nextInt();
        System.out.print("Enter Width: ");
        int w = sc.nextInt();
        System.out.print("Enter Height: ");
        int h = sc.nextInt();
        System.out.print("The volume is: " + calcVolume(l, w, h));
        calcVolume();
        coordGeomertry();
        System.out.print("\nEnter opposite side --> ");
        double opposite = sc.nextDouble();
        System.out.print("Enter adjacent side --> ");
        double adjacent = sc.nextDouble();
        double hypotenuse = calcHypotenuse(opposite, adjacent);
        System.out.println("The length of the hypotenuse is : " + hypotenuse);
        
        MethodExercises me = new MethodExercises();
        int sum = me.addNumbers(2, 3);
        System.out.println("Sum of 2 and 3 is: " + sum);
        
        int volume = MethodExercises.calcVolume(2, 3, 4);
        System.out.println("Volume (static call) is: " + volume);
	}
	
	public static int calculateSum(int num1, int num2) {
		return num1 + num2;
		
	}
	
	public static int calculateProduct(int num1, int num2) {
		return num1 * num2;
		
	}
	public static int calculateDifference(int num1, int num2) {
		return num1 - num2;
		
	}
	public static int calculateQuotient(int num1, int num2) {
		return num1 / num2;
		
	}
	public static int calcVolume(int num1, int num2, int num3) {
		return num1 * num2 * num3;
		
	}
	public static int calcVolume() {
		System.out.print("\nEnter Length: ");
        int l = sc.nextInt();
        System.out.print("Enter Width: ");
        int w = sc.nextInt();
        System.out.print("Enter Height: ");
        int h = sc.nextInt();
        System.out.print("The volume is: " + (l * w * h));
		return 0;
		
	}
	public static void coordGeomertry() {
		System.out.print("\nPlease enter x1 --> ");
        int x1 = sc.nextInt();
        System.out.print("Please enter y1 --> ");
        int y1 = sc.nextInt();
        System.out.print("Please enter x2 --> ");
        int x2 = sc.nextInt();
        System.out.print("Please enter y2 --> ");
        int y2 = sc.nextInt();
        System.out.print("Distance between the two points is: " + calcDistance(x1, y1, x2, y2));
		return;
		
	}
	
	public static double calcDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
		
	}
	
	public static double calcHypotenuse(double opposite, double adjacent) {
		return Math.sqrt(opposite * opposite + adjacent * adjacent);
		
	}
	
	public int addNumbers(int num1, int num2) {
		return num1 + num2;
	}
	

}
