
package Arroyo6;
//Chrystal Arroyo   ID:2396581
//set up scanner
//prompt user to enter a hexadecimal
//input hex dec.
//using Integer.parseInt convert to base 10
//usingt Integer.toBinaryString convert to binary and print out the number
//convert binary back into base 10 (Integer.parseInt((binary)...)

import java.util.Scanner;

public class Hex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter a Hexadecimal: ");
		String hex = input.nextLine();
		
		int baseTen = Integer.parseInt(hex, 16);
		System.out.println("Base 10: "+ baseTen);

		String binary = Integer.toBinaryString(baseTen);
		System.out.println("Binary: "+binary);

		int basetenagain = Integer.parseInt((binary), 2);
		System.out.println("Base 10: "+ basetenagain);

	}
	
}
