package Arroyo2;

import java.util.Scanner;

//Chrystal Arroyo   ID:2396581
//prompt user to input number of shirts needed
//calculate the price
//calculate the shipping
//calculate the total

public class Duke {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of shirts required: ");
		int quantity = input.nextInt();		
		if (quantity <= 2) {
			double price = (quantity * 24.95);
			System.out.println("Price: $" + price);
			int shipping = 10;
			System.out.println("Shipping: $" + shipping);
			double total = price + shipping;
			System.out.println("Total: $" + total);
		}
		else if (quantity <= 5) {
			double newPrice = (24.95 * .9);
			double price = (quantity * newPrice);
			System.out.println("Price: $" + price);
			int shipping = 8;
			System.out.println("Shipping: $" + shipping);
			double total = price + shipping;
			System.out.println("Total: $" + total);
				
			}
		else if (quantity <= 10) {
			double newPrice = (24.95 * .8);
			double price = (quantity * newPrice);
			System.out.println("Price: " + price);
			int shipping = 5;
			System.out.println("Shipping: $" + shipping);
			double total = price + shipping;
			System.out.println("Total: $" + total);
				
			}
		else if (quantity <= 11) {
			double newPrice = (24.95 * .7);
			double price = (quantity * newPrice);
			System.out.println("Price: " + price);
			System.out.println("Shipping: FREE");
			System.out.println("Total: $" + price);
				
			}
			
		input.close();


	}
}
