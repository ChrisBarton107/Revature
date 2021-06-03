package assignment;

public class User {
	int isbn;
	String name;
	String author;
	double price;
	int noOfCopies;
	
	public User() {}
	
	public User(int isbn, String name, String author, double price, int noOfCopies) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.price = price;
		this.noOfCopies = noOfCopies;
	}
	
	
	
	public int getIsbn() {
		return isbn;
	}



	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double d) {
		this.price = d;
	}



	public int getNoOfCopies() {
		return noOfCopies;
	}



	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	
	
}
