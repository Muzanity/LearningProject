package Arroyo6;

import java.util.Scanner;
//Chrystal Arroyo   ID:2396581
//create password class
//create your variables
//prompt user to enter password
//use for look to set your speficis with .isUpperCase, .isLowerCase, .isDigit
//and special characters with specialChar
//print whether the password is valid or not

public class Password {
	public static void main(String[] args) {
		int digit = 0;
		int specialChar = 0;
		int upLetter = 0;
		int upLetter2 = 0;
		int lowLetter = 0;
		String password;
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter Your Password:");
		String pass = input.nextLine();

		for (int i = 0; i < pass.length(); i++) {
			char c = pass.charAt(i);
			if (Character.isUpperCase(c)) {
				upLetter++;
			} else if (Character.isLowerCase(c)) {
				lowLetter++;
			} else if (Character.isDigit(c)) {
				digit++;
				
			} else if (c >= 33 && c <= 46 || c == 64) {
				specialChar++;
			}
		}
		if (upLetter>=1 && lowLetter==2 &&  (digit ==1 || digit==2) && specialChar>0) {
			System.out.println(" Password is good");
		}else {
			System.out.println(" Password isnt good");
		}
	}
}