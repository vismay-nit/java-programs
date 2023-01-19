package strings;

import java.util.Scanner;

public class Palindrome {
	
	public static boolean checkPalindrome(String str) {
		
		int len=str.length();
		for(int i=0;i<len;i++) {
			
			if(str.charAt(i)!=str.charAt(len-i-1))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 11. Write a Java program to find reverse of a string.
		System.out.println("Enter String:");
		String s1 = sc.next();
		
		if(checkPalindrome(s1)) {
			System.out.println("Palindrome!");
		}else
			System.out.println("Not Palindrome!");
		
		sc.close();
	}

}
