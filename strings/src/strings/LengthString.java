package strings;

import java.util.Scanner;

public class LengthString {
	public static int compare(String str1,String str2) {
		int l1 = str1.length();
        int l2 = str2.length();
        int lmin = Math.min(l1, l2);
  
        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int)str1.charAt(i);
            int str2_ch = (int)str2.charAt(i);
  
            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }
  
        if (l1 != l2) {
            return l1 - l2;
        }
        else {
            return 0;
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.	Write a Java program to find length of a string.
		Scanner sc =new Scanner(System.in);
		
		String str1,str2;
		System.out.println("Enter String:");
		str1=sc.next();
		System.out.println("String length : "+ str1.length());
		
		// 2. Write a Java program to copy one string to another string.

		System.out.println("String str1 copied to other str2 as:");
		str2 = str1;
		System.out.println(str2);
		// 3. Write a Java program to concatenate two strings.
		
		System.out.println("Enter String1: ");
		String s1 = sc.next();
		System.out.println("Enter String2: ");
		String s2 = sc.next();
		System.out.println("Concatenation: " + s1.concat(s2));
		// 4. Write a Java program to compare two strings.
		
		if(compare(s1,s2) ==0)
			System.out.println("Equal!");
		else
			System.out.println("Not Equal!");
		System.out.println();
		sc.close();
	}

}
