package Arroyo5;
import java.util.Random;
//Chrystal Arroyo   ID:2396581

//set up variables even, odd, sum
//create a for loop using math.random to establish your random variables
//print the lowest element, highest element and here is the array
//foreach loop will be created starting i at zero and not going beyond 8
//it will in crease by 1
//set sorted to even and odd by using remainder. if there is a remainder it is even else it is odd
//print the amount of evens and the amount of odds
//create a for loop that will calculate the summation of all the numbers
public class ArrayEvenOdd {

	public static void main(String[] args) {

		int[] intArray = new int[8];
		int even=0;
		int odd=0;
		int sum =0;

		for(int i = 0; i < 8;i++){
			int randomValue = (int)(Math.random()*50+50);
			intArray[i] = randomValue;
 		}
		
		int[] sorted = sorted(intArray);
		
		System.out.println("The lowest element is " + sorted[0]);
		System.out.println("The highest element is " + sorted[7]);
		System.out.println("Here is the array ");
		
		for(int element : sorted) {
			System.out.print(element + "  ");
		}
		
		for(int i = 0; i < 8;i++){
			if(sorted[i] % 2 ==0) {
				even++;
			}else {
				odd++;
			}
		}
		
		System.out.printf("\nEvens: %d, ", even);
		System.out.printf("Odds: %d", odd);

		for(int i = 0; i < 8;i++){
			sum +=sorted[i];
 		}
		
		System.out.printf("\nTotal: %d", sum);

	}

	public static int[] sorted(int[] intArray){
		int n = intArray.length;  
		int temp = 0;  
		for(int i=0; i < n; i++){  
			for(int j=1; j < (n-i); j++){  
				if(intArray[j-1] > intArray[j]){  
					//trade elements in the array
					temp = intArray[j-1];  
					intArray[j-1] = intArray[j];  
					intArray[j] = temp;  
				}  

			}
		}

		return intArray;
	}

}
