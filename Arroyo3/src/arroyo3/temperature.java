package arroyo3;
//Chrystal Arroyo   ID:2396581
//print description of chart
//create farenheit at -40
//create integer for celsius
//formulate a while loop that ends farenheit at 120
//create cesius conversion
//print out the chart for farenheit
//being over again with +5 degrees added to farenheit
public class temperature {
	public static void main(String[] arg) {
		System.out.println("Farenheit to Celsuis Chart");
		double farenheit = -40;
		double celsius;
		
		while (farenheit <= 120) {
				//celsius conversion = Deduct 32, then multiply by 5, then divide by 9
				celsius = (((farenheit -32)*5)/9);
				System.out.printf("%.1f %.1f", farenheit, celsius); 
				System.out.println();
							
			farenheit = farenheit + 5;
		}
	}
}
