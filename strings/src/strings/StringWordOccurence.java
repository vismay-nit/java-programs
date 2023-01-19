package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringWordOccurence {

	public static String getString() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();
		return s;
	}

	public static int getOccurence(String s1, String s2) {

		String temp[] = s1.split(" ");
		int cnt = 0;

		for (int i = 0; i < temp.length; i++) {

			if (s2.equals(temp[i]))
				cnt++;
		}

		return cnt;
	}

	public static void remFirstOcc(String str, String word) {

		int pos = str.indexOf(word);
		String newString = "";
		if (pos > -1) {
			newString = str.substring(0, pos) + str.substring(pos + word.length(), str.length());
		}
		System.out.println("First Occurence Deleted: ");
		System.out.println(newString);
	}

	public static void remLastOcc(String str, String word) {

		int pos = str.lastIndexOf(word);
		String newString = "";
		if (pos > -1) {
			newString = str.substring(0, pos) + str.substring(pos + word.length(), str.length());
		}
		System.out.println("Last Occurence Deleted: ");
		System.out.println(newString);
	}

	public static String remAll(String str,String word) {
		
		String[] ss = str.split(" ");
		String newString="";
		for(String words:ss) {
			if(!words.equals(word)) {
				newString+=words+" ";
			}
		}
		return newString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 28. Write a Java program to find first occurrence of a word in a given
		// string.

		String s1 = getString();
		System.out.println("Enter String to get First Index: ");
		String s2 = getString();
		System.out.println("First Index: " + s1.indexOf(s2));

		// 29. Write a Java program to find last occurrence of a word in a given string.
		System.out.println("Enter String to get Last Index: ");
		String s3 = getString();
		System.out.println("Last Index: " + s1.lastIndexOf(s3));

		// 30. Write a Java program to search all occurrences of a word in given string.
		// 31. Write a Java program to count occurrences of a word in a given string.

		System.out.println("Enter String For All occurences of word:");
		String s4 = getString();
		System.out.println("Enter which word to search for: ");
		String s5 = sc.next();
		int occ = getOccurence(s4, s5);

		System.out.println(s5 + " Occurs in " + "String " + occ + " Times");

//		32.	Write a Java program to remove first occurrence of a word from string.

		String s6 = getString();
		System.out.println("Enter Which word first occurence to be removed: ");
		String word = sc.next();
		remFirstOcc(s6, word);
//		33.	Write a Java program to remove last occurrence of a word in given string.
		word = "";
		String s7 = getString();
		System.out.println("Enter Which word Last occurence to be removed: ");
		word = sc.next();
		remLastOcc(s7, word);
//		34.	Write a Java program to remove all occurrence of a word in given string.
		String s8 = getString();
		System.out.println("enter word whose all occurence to be removed: ");
		word = sc.next();
		String[] ss = s8.split(" ");
		String ans = remAll(s8, word);
		System.out.println("String after All occurences of " + word+ " removed:");
		System.out.println(ans);

		sc.close();
	}

}
