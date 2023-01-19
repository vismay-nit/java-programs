package strings;

import java.util.Scanner;

public class WordsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 10. Write a Java program to count total number of words in a string.
		System.out.println("Enter String:");
		String s1 = sc.nextLine();
		int words = 1;

		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) == ' ' && s1.charAt(i + 1) != ' ')
				words++;
		}
		System.out.println(words);
		sc.close();
	}

}
