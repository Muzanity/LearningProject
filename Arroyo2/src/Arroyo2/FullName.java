package Arroyo2;

import java.util.Scanner;

//Chrystal Arroyo   ID:2396581
//create your scanner object first
//prompt the user to enter their full name
//read each input an individual string using .next
//print full name
//print the amount of characters in the full name
//print amount of characters in the middle name
//print first character in each string
//print name in uppercase
public class FullName {
	public static void main(String[] arg) {
		//scanner object created
		Scanner input = new Scanner(System.in);
		//user prompted for full name
		System.out.println("Please enter a first name, middle name, and surname:");
		String first = input.next();
		String middle = input.next();
		String last = input.next();
		String fullName = (first + middle+ last);//created to calculate amount of characters
		String fullNamePrint = (first+ " " + middle +" "+ last);
		System.out.println(fullNamePrint);
		System.out.println("The length of your name: " + fullName.length() + " characters");
		System.out.println("The length of your middle name: " + middle.length() + " characters");
		System.out.println("Your initials are: " + first.charAt(0) + middle.charAt(0) + last.charAt(0));
		System.out.println(fullNamePrint.toUpperCase());

		input.close();

	}
}
