package strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 11. Write a Java program to find reverse of a string.
		System.out.println("Enter String:");
		String s1 = sc.nextLine();
		StringBuilder s = new StringBuilder();
		s.append(s1);
		s.reverse();
		
		System.out.println("Reversed String: " + s);
		sc.close();
	}

}
