package strings;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 9. Write a Java program to count total number of vowels and consonants in a
		// string.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s1 =sc.next();
		int vow=0,cons=0;
		for(int i=0;i<s1.length();i++) {
			
			if(Character.isAlphabetic(s1.charAt(i))) {
				char ch = Character.toLowerCase(s1.charAt(i));
				if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					vow++;
				}else
					cons++;
			}
			
		}
		System.out.println("Vowels : " + vow);

		System.out.println("Consonant : " + cons);
		sc.close();
	}

}
