package weekThree;

import java.util.Scanner;

public class StringExercises {

	public static void main(String[] args) {
		stringMethodsExercise();
        stringConstantPoolExercise();
        stringComparisonExercise();
        stringImmutabilityExercise();
        stringFormattingExercise();

	}

	private static void stringFormattingExercise() {
		// TODO Auto-generated method stub
		
	}

	private static void stringImmutabilityExercise() {
		// TODO Auto-generated method stub
		
	}

	private static void stringComparisonExercise() {
		Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Enter the first string: ");
	    String str1 = scanner.nextLine();
	    
	    System.out.print("Enter the second string: ");
	    String str2 = scanner.nextLine();
	    
	    int comparison = str1.compareTo(str2);
	    
	    if (comparison < 0) {
	        System.out.println("The first string is lexicographically less than the second string.");
	    } else if (comparison > 0) {
	        System.out.println("The first string is lexicographically greater than the second string.");
	    } else {
	        System.out.println("Both strings are lexicographically equal.");
	    }
	    
	    System.out.println("The strings are equal using equals: " + str1.equals(str2));
	    System.out.println("The strings are equal ignoring case: " + str1.equalsIgnoreCase(str2));
		
	}

	private static void stringConstantPoolExercise() {
		String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello");

        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str3 == str4: " + (str3 == str4));

        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println("str3.equals(str4): " + str3.equals(str4));
	}

	private static void stringMethodsExercise() {
		String str = "JavaProgramming";
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 5: " + str.charAt(5));
        System.out.println("Substring from index 4 to 9: " + str.substring(4, 10));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Contains 'Prog': " + str.contains("Prog"));
        System.out.println("Replace string: " + str.replace("Java", "Python"));
	}
}
