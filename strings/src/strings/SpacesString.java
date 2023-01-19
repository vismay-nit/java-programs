package strings;

import java.util.Scanner;

public class SpacesString {
	public static String getString() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 35. Write a Java program to trim leading white space characters from given
		// string.

		String s1 = getString();
		System.out.println("Remove Leading Spaces: ");
		System.out.println(s1.replaceAll("^\\s+", ""));
		
		// 36. Write a Java program to trim trailing white space characters from given
		// string.

		System.out.println("Remove Trailing Spaces: ");
		System.out.println(s1.replaceFirst("\\s++$", ""));
		// 37. Write a Java program to trim both leading and trailing white space
		// characters from given string.
		
		System.out.println("Remove both leading and trailing spaces: ");
		System.out.println(s1.trim());
		// 38. Write a Java program to remove all extra blank spaces from given string.

		System.out.println("Remove All extra blank spaces: ");
		System.out.println(s1.replaceAll("\\s+"," ").trim());

		sc.close();
	}

}
