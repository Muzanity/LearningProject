package Arroyo7;
//Chrystal Arroyo   ID:2396581
//create empty array of 10 doubles
//generate the array with 10 random values
//create random object
//assign to each index in the array
//set streams with null
//for each element in the array, each element will be written as a new line 
//use the writedouble method on the outputStream

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Write {

	public static void main(String[] args) {

		double[] dArray = new double[10];

		for (int i = 0; i < 10; i++) { 
			Random r = new Random(); 
			double randomDouble = 1 + (11 - 0) * r.nextDouble();
			dArray[i] = randomDouble;

		}

		try {
			writeToFile(dArray);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeToFile(double[] dArray) throws IOException {
		FileOutputStream stream = null;
		DataOutputStream outputStream = null;
		try {
			stream = new FileOutputStream("test.txt");
			outputStream = new DataOutputStream(stream);
			for (double d:dArray) {
				outputStream.writeDouble(d);    
			}

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(stream!=null)
				stream.close();
			System.out.println("Double array now written to file!");
		}

	}

}
