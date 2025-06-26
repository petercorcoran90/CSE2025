package weekOne;

import java.util.Scanner;

public class InvoiceApplicationV2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int noOfInvoices = 0;
		double totalInvoice = 0;
		double totalDiscount= 0;
		System.out.println("Welcome to the Invoice Total Calculator");
		System.out.println(); 

		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter subtotal: ");
			double subtotal = sc.nextDouble();
			double discountPercent = 0;
			if(subtotal>=500) { discountPercent = 0.25;}
			else if(subtotal>=200) { discountPercent = 0.2;}
			else if(subtotal>=100) { discountPercent = 0.1;}

			double discountAmount = subtotal * discountPercent;
			totalDiscount += discountAmount;
			double total = subtotal - discountAmount;
			totalInvoice += total;

			System.out.println("Discount percent:       " + discountPercent);
			System.out.println("Discount amount:        " + discountAmount);
			System.out.println("Total:                  " + total);

			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			noOfInvoices +=1;
			System.out.println();
		}
		System.out.println("Number of invoices: " + noOfInvoices);
		System.out.println("Average invoice: " + totalInvoice/noOfInvoices);
		System.out.println("Average discount: " + totalDiscount/noOfInvoices);

		sc.close();
	}
}
