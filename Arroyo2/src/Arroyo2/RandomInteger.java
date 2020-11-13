package Arroyo2;
//Chrystal Arroyo   ID:2396581
//create two random integers with Math.random
//print int a & b
//create a boolean to find the greater integer
//subtract integers to create a positive difference
//print the difference in a math equation

public class RandomInteger {
	public static void main(String[] arg) {
		int a = (int) (51 + Math.random() * 50);
		int b = (int) (51 + Math.random() * 50);
		System.out.println(a + " & "+ b);
		if (a>b) { //used to find the greater integer
			int difference = a - b;
			System.out.println(a + " - " + b + "= " + difference);
		}
		else {
			int otherDifference = b - a;
			System.out.println(b + " - " + a + " = " + otherDifference);
		}
	}

}
