package switchh;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3. Write a Java program to check whether an alphabet is vowel or consonant
		// using switch case.
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Alphabet: ");
		char ch = sc.next().charAt(0);

		switch (ch) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(ch + " is a Vowel");
			break;
		default:
			System.out.println(ch + " is a Consonant");

		}

		sc.close();

	}

}
