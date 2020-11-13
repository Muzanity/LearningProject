package Arroyo6;
//Chrystal Arroyo   ID:2396581
//create book array to create new book 6 times



public class TestBook {
        static Book[] bookArray = new Book[6];

	public static void main(String[] args) {
		
        bookArray[0] = new Book("title1","author1",30,19);
        bookArray[1] = new Book("title2","author2",120,49);
        bookArray[2] = new Book("title3","author3",10,89);
        bookArray[3] = new Book("title4","author4",60,50);
        
        bookArray[4] = new Book();
        bookArray[5] = new Book();

        for (Book item : bookArray) {
            System.out.println(item.getCurrentState());
        }
                
        finishArray(bookArray);
        bookArray = reduceBooks(bookArray);    
		
	}
	
	public static void finishArray(Book[] array) {
		bookArray[4].setTitle("title5");
		bookArray[4].setAuthor("author5");
		bookArray[4].setPages(44);
		bookArray[4].setPrice(19);
		
		bookArray[5].setTitle("title6");
		bookArray[5].setAuthor("author6");
		bookArray[5].setPages(223);
		bookArray[5].setPrice(49);
	}

	public static Book[] reduceBooks(Book[] array) {
		double current_highest = 0;
        Book highestBook = null;
		
		for (Book item : array) {
			item.setPrice(item.getPrice()-(40.0/100.0)*item.getPrice());
			if(item.getPrice()>current_highest) {
				highestBook = item;
			}
        }
		
        System.out.println();
		
        for (Book item : array) {
            System.out.println(item.getCurrentState());
        }		
		
        System.out.println("\nHere is the most expensive book after discounts");
        System.out.println(array[2].getCurrentState());
		
		return array;
	}
}
