package strings;
//Write a program which creates a String “Welcome to Java World” and performs the following 
//•	Returns the character at 5th position and display it.
//•	Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.
//•	Concatenates “- Let us learn” to the above string and display it.
//•	Returns the position of the first occurrence of character ‘a’ and display it.
//•	Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
//•	Returns string between 4th position and 10th position and display it.
//•	Returns the lowercase of the string and display it



public class Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 ="welcome to Java World";
		System.out.println(s1.charAt(5));
		System.out.println(s1.compareTo("Welcome"));
		System.out.println(s1.concat(" Let us learn"));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.replace('a', 'e'));
		System.out.println(s1.substring(4, 10));
		System.out.println(s1.toLowerCase());
		
		
		
//		Write a program which creates a StringBuffer “This is StringBuffer” and performs the following. 
//		1.	Adds the string ”- This is a sample program” to existing string and display it.
//		2.	Inserts the string “Object” into the existing string at 21st postion and display it.
//		3.	Reverses the entire string and displays it.
//		4.	Replaces the word “Buffer” with “Builder” and display it
		
		
		 StringBuffer sb = new StringBuffer("This is StringBuffer");
	     System.out.println(sb.append(" this is a sample program"));
	     System.out.println(sb.insert(21," Object"));
        System.out.println(sb.reverse());
        System.out.println(sb.replace(14,20,"Builder"));
		
		
		

	}

}
