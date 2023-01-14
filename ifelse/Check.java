package ifelse;

import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 9. Write a Java program to input any character and check whether it is
		// alphabet, digit or special character.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character: ");
		char ch = sc.next().charAt(0);
		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
			System.out.println("Alphabet");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println("Digit");
		} else {
			System.out.println("Special Character");
		}
		// 10. Write a Java program to check whether a character is uppercase or
		// lowercase alphabet.
		System.out.println("Checking if Lowercase or Uppercase char--");
		System.out.println("Enter Character: ");
		char ch1 = sc.next().charAt(0);
		if (ch1 >= 'A' && ch1 <= 'Z') {
			System.out.println("Uppercase");
		} else if (ch1 >= 'a' && ch1 <= 'z') {
			System.out.println("Lowercase");
		} else {
			System.out.println("Not valid alphabet");
		}
		
		sc.close();
	}

}
