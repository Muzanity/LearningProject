package arroyo3;

//Chrystal Arroyo   ID:2396581
//print what will happen
//create integers using number(300), totalNumber(0), i(5) and sum(0)
//for loop sets  number to be greater than 200
//create equation to find multiples of 11 != 13
//use sum++ to add numbers listed together
//create for loop to print the numbers out
//use %8d to create spacing
//print total integers and sum
public class multiplesChart {
	public static void main(String[] arg) {
		//display written explanation of table
		System.out.print("Numbers Divisible by 11 & 13");
		System.out.println();
		//set up your integer I am using the word number
		int number = 300;
		final int i = 5;
		int amount = 0;
		int sum = 0;
		int[] values = new int[15];

		//set up your loop	
		for (;number >= 200;) {
			if((number % 11 == 0) != (number % 13 == 0)) { 
				values[amount] = number;
				amount++;
			}
			number--;
		}
		
		for( int x = 0; x < values.length; x++) {
			if(x % 5 != 0) {
				System.out.printf("%-8s", values[x]);
			}else {
				System.out.printf("%-8s", values[x]);
				System.out.println();
			}
		}
		System.out.println("\nFound " + amount + " integers totalling");

	}
}
