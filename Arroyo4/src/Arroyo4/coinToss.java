package Arroyo4;

import java.util.Random;
import java.util.Scanner;

public class coinToss {

	static int tails = 0;
	static int heads = 0;

	public static void main(String[] arg) {

		Scanner input = new Scanner(System.in);
		System.out.println("How many times should I toss the coin?");
		int tossAmount = input.nextInt();

		for (int i = 0; i <= tossAmount; i++) {
			if (toss() == "tails") {
				tails++;
			}
		}
		System.out.println("Results of " + tossAmount + " tosses.");
		System.out.println("Heads: " + (tossAmount - tails) + ", Tails:" + tails);
	}

	public static String toss() {
		Random r = new Random();
		int result = r.nextInt(2);
		if (result == 1) {
			return "tails";
		} else {
			return "heads";
		}
	}
}
