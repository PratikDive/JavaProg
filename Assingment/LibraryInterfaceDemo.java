package strings;

interface LibraryUser{
	void registerAccount();
	void requestBook();
	
	
}

class KidUser implements LibraryUser{
	
	int age ;
	String bookType;

	@Override
	public void registerAccount() {
		if(age<12) {
			System.out.println("You have successfully registered under a Kids Account");
		}
		else {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
		
	}
	@Override
	public void requestBook() {
		if(bookType == "kids") {
			System.out.println("Book Issued successfully, please return the book within 10 days" );
			
		}
		else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
		
		
	}

	
	
}


class AdultUser implements LibraryUser{
	int age;
	String bookType;
	
	public void registerAccount() {
		if(age>12) {
			System.out.println("You have successfully registered under an Adult Account");
		}
		else {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
		
		
	}
	
	public void requestBook() {
		if(bookType == "Fiction") {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else {
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
		
		
	}
}


public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KidUser k1 = new KidUser();
		KidUser k2 = new KidUser();
		k1.age = 10;
		k2.age =18;
		
		k1.bookType ="kids";
		k2.bookType = "Fiction";
		
		
		k1.registerAccount();
		k1.requestBook();
		System.out.println();
		
		k2.registerAccount();
		k2.requestBook();
		System.out.println();
		
		AdultUser a1 = new AdultUser();
		AdultUser a2 = new AdultUser();
		
		a1.age =5;
		a1.bookType = "kids";
		a1.registerAccount();
		a1.requestBook();
		System.out.println();
		
		a2.age =23;
		a2.bookType ="Fiction";
		a2.registerAccount();
		a2.requestBook();
		
		

	}

}
