package Arroyo6;
//Chrystal Arroyo   ID:2396581
//create all my values: title, author, pages, price and numbooks
//set up constructor for Book
//create setter and getters for title, author, pages and price
//using this.xxxxx
//return the listed book title, author, pages and price


public class Book {
	private String title = "";
	private String author ="";
	private int pages = 0;
	private double price =0;
	public static int numBooks = 0;
	
	public Book(String title, String author,int pages, double price) {
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.price = price;
		numBooks++;
		//price = newPrice;
	}
	
	public Book() {
		numBooks++;
	}	
	
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
 
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return this.pages;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }
    
    public String getCurrentState() {
    	
    	return "Book title="+this.title.toString()+", author="+this.author.toString()+", pages="+this.pages+",price = $"+this.price;    }
    
}
