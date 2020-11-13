package Arroyo4;

import java.text.DecimalFormat;

//Chrystal Arroyo   ID:2396581
//I worked in pieces to create this
//create classes
//create main object class
//create method for finding meters
//create method for finding feet

//METERS METOD:
//create double s decimal integer and write out formula for finding distance in meters
//use math.pow for t^2
//return s

//FEET METHOD:
//create double f which divides s fromt eh meters method by .3048
//return f

//RETURN BACK TO MAIN VOID METHOD:
//create double g, m, f
//formatter will allow for decimal places
//print the table labels out using alignments left, right, right
//print out (also using alignment methods left right right) t and decimal formatters m and f


public class FallingObject {
	static DecimalFormat formatter = new DecimalFormat();

	public static void main(String[] arg) {  //creates the chart
		double g = 9.8;
		double m = 0.0;
		double f = 0.0;
		
		formatter.setMaximumFractionDigits(1);

		
		System.out.printf("%-5s %10s %10s\n", "SEC", "METERS", "FEET");
		
		for (int t=1 ; t<= 10; t++) {
			m = meters(g, t);
			f = feet(m);
			System.out.printf("%-5s %10s %10s\n", t, formatter.format(m), formatter.format(f));
		}
		
	}
	public static double meters(double g, int t) {  //creates the distance in meters
			double s = .5*(g*Math.pow(t, 2d));
			return s;
	}
	public static double feet(double s) {  //converts meters to feet
		double f = s/.3048;
		return f;
	}
	
}
