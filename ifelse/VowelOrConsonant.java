package ifelse;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//8.	Write a Java program to input any alphabet and check whether it is vowel or consonant.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alphabet: ");
		char ch = sc.next().charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println("Vowel");
		} else {
			System.out.println("Consonant");
		}
		
		

		sc.close();
	}

}
