package oops;

interface LibraryUser{

	 static void registerAccount() {
		 
	 }
	 
	 static void requestBook() {
		 
	 }
	 
	 
	
}

class KidUser implements LibraryUser{
	int age ;
	String BookType;
	
	void registerAccount(int age) {
		if(age < 12) {
			System.out.println("You have sucessfully registerd for kids user ");
		}else {
			System.out.println("Age must be less than 12 to register ");
		}
		this.age = age;
		
		
	}
	
	void requestBook(String BookType) {
		if (BookType == "Kids") {
			System.out.println("Book issued sucessfully return in 10 days ");
		}
		else {
			System.out.println("You are allowed to take kids book only ");
		}
		
	}
	
	
}

class AdultUser implements LibraryUser{
	int age ;
	String Booktype;
	
	void registerAccount(int age) {
		if(age > 12) {
			System.out.println("You have sucessfully registerd for adult user ");
		}else {
			System.out.println("Age must be greater than 12 to register ");
		}
		this.age = age;
		
		
	}
	
	void requestBook(String BookType) {
		if (BookType == "Fiction") {
			System.out.println("Book issued sucessfully return in 7 days ");
		}
		else {
			System.out.println("You are allowed to take fiction book only ");
		}
		
	}
	
	
}


public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KidUser obj = new KidUser();
		
		obj.registerAccount(10);
		obj.requestBook("Kids");
		
		System.out.println();
		obj.registerAccount(15);
		obj.requestBook("Adult");

		System.out.println();
		AdultUser obj1 = new AdultUser();
		obj1.registerAccount(15);
		obj1.requestBook("Fiction");

		System.out.println();
		obj1.registerAccount(11);
		obj1.requestBook("Kids");
	}

}
