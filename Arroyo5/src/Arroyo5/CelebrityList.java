package Arroyo5;
import java.util.ArrayList; 
//Chrystal Arroyo   ID:2396581

//set up the array
//print out the list using names.add
//create for look establishing the output of each name
//create another for loop adding the new name
//print out "using and iterator, here is the list"
//reprint the string with new name added and remove 4th name

public class CelebrityList {
		static ArrayList<String> names = new ArrayList<String>(); 

	public static void main(String[] args) {
		System.out.println("Here is the list");
		names.add("Lionel");
		names.add("Drake");
		names.add("Adele");
		names.add("Dwayne");
		names.add("Beyonce");

		for(int i = 0; i < names.size();i++){
			System.out.println(names.get(i));
 		}
		
		modify(names);
		
		System.out.println("Here is the new list");
 		
		for(String name : names){
			System.out.print(" * "+name);
 		}
		System.out.println();
		System.out.println("Using an iterator, here is the list");

		for(String name : names){
			System.out.println(name);
 		}
	}
	
	public static void modify(ArrayList<String> names) {
		names.add(2, "Taylor");
		names.remove(4);
	}

}
