package strings;

import java.util.Scanner;

public class ChangeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// 5. Write a Java program to convert lowercase string to uppercase.

		String s1, low, upper;
		System.out.println("Enter lowercase String:");
		s1 = sc.next();
		upper = s1.toUpperCase();
		System.out.println("Lower case to uppercase: " + upper);

		// 6. Write a Java program to convert uppercase string to lowercase.
		System.out.println("Enter Upper Case String:");
		String s2 = sc.next();
		low = s2.toLowerCase();
		System.out.println("Upper case to lowercase: " + low);

		// 7. Write a Java program to toggle case of each character of a string.
		
		System.out.println("Enter String for toggle: ");
		String s3 = sc.next();
		String s = "";
		for(int i=0;i<s3.length();i++) {
			if(Character.isAlphabetic(s3.charAt(i))) {
				if(Character.isUpperCase(s3.charAt(i)))
					s+= Character.toLowerCase(s3.charAt(i));
				else
					s+= Character.toUpperCase(s3.charAt(i));
			}
			else
				s+=s3.charAt(i);			
		}
		System.out.println("String after Toggle: " + s);

		sc.close();
	}

}
