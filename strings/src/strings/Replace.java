package strings;

import java.util.Scanner;

public class Replace {

	static void replaceFirstLast(String s, char ch1, char ch2) {
		// Traverse the given String from
		// the beginning
		String temp1 = "";
		String temp2 = "";
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == ch1) {
				temp1 = s.substring(0, i) + ch2 + s.substring(i + 1);
				break;
			}
		}

		for (int i = s.length() - 1; i > -1; i--) {

			if (s.charAt(i) == ch1) {
				temp2 = s.substring(0, i) + ch2 + s.substring(i + 1);

				break;
			}
		}

		System.out.println("After Replacing First occurence of " + ch1 + " with " + ch2);
		System.out.println(temp1);

		System.out.println("After Replacing Last occurence of " + ch1 + " with " + ch2);
		System.out.println(temp2);
	}
	
	public static String replaceAll(String s,char ch1,char ch2) {
		
		String temp="";
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)==ch1) {
				temp+=ch2;
				continue;
			}
			temp+=s.charAt(i);
			
		}
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		25.	Write a Java program to replace first occurrence of a character with another in a string.
//		26.	Write a Java program to replace last occurrence of a character with another in a string.
//		27.	Write a Java program to replace all occurrences of a character with another in a string.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String str1 = sc.next();

		System.out.println("Enter ch1 & ch2: ");
		char ch1 = sc.next().charAt(0);
		char ch2 = sc.next().charAt(0);

		replaceFirstLast(str1, ch1, ch2);
		
		String rAll =replaceAll(str1,ch1,ch2);
		System.out.println("After Replacing all "+ch1 +" with "+ ch2);
		System.out.println(rAll);
		sc.close();
	}

}
