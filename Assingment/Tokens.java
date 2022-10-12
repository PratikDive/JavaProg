package oops;

import java.util.Scanner;

public class Tokens {

	public static void main(String[] args) {
	
		
		   Scanner sc = new Scanner(System.in); 
		   System.out.println("Enter The Sentence:");
		   String str = sc.nextLine();
	        String[] arrOfStr = str.split(" "); 
	  
	        for (String a : arrOfStr) 
	            System.out.println(a); 
	    }
			
		}

	


