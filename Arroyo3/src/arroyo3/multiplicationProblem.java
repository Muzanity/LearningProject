package arroyo3;

import java.util.Scanner;

//Chrystal Arroyo   ID:2396581
//create scanner input
//create integers for answer, response, correct and the total
//allow for the two integers num1 and num2 to be chosen at random
//print command prompting user to answer the question
//allow for answer input
//if state for the correct answer if the answer is correct print positive note
//print else statement that shows the correct answer
public class multiplicationProblem {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		
		int answer = 0;
		String response = "";
		int correct = 0;
		int total = 0;
		
		do {
			//generate values
			int num1 = (int)(Math.random() * 10);
			int num2 = (int)(Math.random() * 10);
			
			System.out.print("What is " + num1+ " * "+num2+ "? ");
			answer = input.nextInt(); 
			//check the answer

			if(answer == num1 * num2) {
				System.out.println("You are correct! Nice work!");
				correct++;
				//if correct; increment
			}else {
				System.out.println("Incorrect. The product is " + num1 * num2);
			}
			
			total++;
			//accumulate the amount for questions asked
			
			System.out.println("Want more questions? (y for yes & n for no)");

			response = input.nextLine();   
			response = input.nextLine();    

		} while (!response.equalsIgnoreCase("n"));
		//if the user puts n the score will display and the program will end
		
		System.out.print("You scored " + correct +  " out of "+total);
		}
	}