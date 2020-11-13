package Arroyo5;

import java.util.Arrays;
//Chrystal Arroyo   ID:2396581

//set sum to 0
//set up new array - intarray
//print out passing alone with the array.tostring
//create for loop that will create your string of numbers
//transform string into integers using .parseint
// create another for loop with the summation of the integers previously chosen
//print line with the summation
public class arraySum {

	static int sum = 0;
	
	public static void main(String[] args) {
	
		int[] intArray = new int[args.length];
				
		System.out.print("Passing ");
		System.out.println(Arrays.toString(args));
		
		for(int i = 0; i < args.length;i++){
			intArray[i] = Integer.parseInt(args[i]);
		}
		
		sumInts(intArray);
	}
	
	public static void sumInts(int[] arguments) {
		for(int i = 0; i < arguments.length;i++){
			sum +=arguments[i];
 		}
		System.out.println("\nSum is "+sum);
	}

}
