package oops;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringSplit {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence:");
		StringTokenizer st1 = new StringTokenizer(sc.nextLine(), " ");
		while (st1.hasMoreTokens())
			 
         
            System.out.println(st1.nextToken());

	}

}
