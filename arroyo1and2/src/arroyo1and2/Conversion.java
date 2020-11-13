package arroyo1and2;

import java.util.Scanner;

//Chrystal Arroyo ID:2396581
//create your scanner object first
//prompt the user to enter a weight in kilograms
//compute the conversion of kilograms into pounds
//create output for the weight in lbs and include the computations
public class Conversion {
	public static void main(String[] arg) {
		//scanner object
		Scanner input = new Scanner(System.in);
		//user enters eight
		System.out.println("Please enter a weight in kilograms");
		double kilograms = input.nextDouble();
		//kilograms into pounds computation
		double pounds = kilograms * 2.2;
		//display weight in pounds
		System.out.println("The weight in pounds is " + pounds);
	}
}

