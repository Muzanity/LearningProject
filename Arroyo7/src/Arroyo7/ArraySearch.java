package Arroyo7;
//Chrystal Arroyo   ID:2396581
//create public class array search
//create intArray with values up to 10
//use return index method
//print out the index
//create haystack and need var
//if haystack is equal to needle then return I
public class ArraySearch {

	public static void main(String[] args) {		
		int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };//init array of 10 values
		int index = returnIndex(intArray, 3); //call method to go through array and find the index of the given value
		 System.out.println("Index: " + index);
	}
	
	public static int returnIndex(int[ ] haystack, int needle) {
		int index = 0;
		
		for (int i = 0; i < haystack.length; i++) {//iterate as many elements as there are in the array
			if(haystack[i] ==  needle) { // if found return the index
				return i;
			}
		}
		
		return index;
	}

}
