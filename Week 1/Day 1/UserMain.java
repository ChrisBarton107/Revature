package assignment;

public class UserMain {
	
	public static void main (String [] args) {
		User U1 = new User();
		
		U1.setIsbn(1234567891);
		U1.setPrice(128.00);
		U1.setAuthor("Chris Barton");
		
		System.out.println(U1.getAuthor());
		
		
	}

}
