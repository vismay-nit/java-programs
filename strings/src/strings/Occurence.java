package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 17. Write a Java program to count occurrences of a character in given string.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String str = sc.next();
		char ch;
		ArrayList<Integer> occ = new ArrayList<Integer>();
		// 14. Write a Java program to find first occurrence of a character in a given
		// string.

		System.out.println("Enter Char: ");
		ch = sc.next().charAt(0);
		int lastOcc = -1, firstOcc = -1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				firstOcc = i;
				break;
			}
		}
		if (firstOcc != -1)
			System.out.println("First occurence of " + ch + " at : " + firstOcc + " index.");
		else
			System.out.println("Char not in String!");

		// 15. Write a Java program to find last occurrence of a character in a given
		// string.
		int k = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				lastOcc = i;
				occ.add(i);
			}
		}
		if (lastOcc != -1)
			System.out.println("Last occurence of " + ch + " at : " + lastOcc + " index.");
		else
			System.out.println("Char not in String!");

		// 16. Write a Java program to search all occurrences of a character in given
		// string.
		System.out.println("All occurences of " + ch);
		for (int i = 0; i < occ.size(); i++) {
			System.out.print(occ.get(i) + " ");
		}
		System.out.println();
		// 17. Write a Java program to count occurrences of a character in given string.
		System.out.println("Count of Occurences  of "+ch+" is " + occ.size());
	}

}
