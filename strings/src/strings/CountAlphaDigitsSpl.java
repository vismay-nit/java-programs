package strings;

import java.util.Scanner;

public class CountAlphaDigitsSpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 8. Write a Java program to find total number of alphabets, digits or special
		// character in a string.
		System.out.println("Enter String:");
		String s1 =sc.next();
		int alpha=0,dig=0,spl=0;
		for(int i=0;i<s1.length();i++) {
			
			if(Character.isAlphabetic(s1.charAt(i)))
				alpha++;
			else if(Character.isDigit(s1.charAt(i)))
				dig++;
			else
				spl++;
		}
		System.out.println("Alphabets: " + alpha);

		System.out.println("Digitss: " + dig);
		System.out.println("Spl char: " + spl);
		
		
		sc.close();
	}

}
