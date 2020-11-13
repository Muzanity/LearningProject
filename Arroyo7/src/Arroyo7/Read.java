package Arroyo7;
//Chrystal Arroyo   ID:2396581
// create public class
// use try methos to read from the text file
//set stream and input to null
//use try method for new file input stream
//create sum and set it to zero
//create while loop that will continue to run as long as there is data
//print out the summation

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Read {

	public static void main(String[] args) {

		try {
			readFromFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readFromFile() throws IOException {

		InputStream stream = null;
		DataInputStream input = null;
		
		try {
			stream = new FileInputStream("test.txt");

			input = new DataInputStream(stream);
			
			
			double sum = 0;
			while(input.available()>0) {
				double c = input.readDouble();
				System.out.println(c + " ");
				sum += c;
			}
			System.out.println("The total is: "+sum);


		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(stream!=null) {
				stream.close();
			}
			if(input!=null) {
				input.close();
			}

		}

	}

}
