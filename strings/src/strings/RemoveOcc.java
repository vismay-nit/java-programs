package strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveOcc {
	public static String removeOccurences(String s,char ch) {

		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				s=s.substring(0, i)+s.substring(i+1);
				break;
			}
		}
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)==ch) {
				s=s.substring(0, i)+s.substring(i+1);
				break;
			}
		}
		return s;
	}
	public static String remAllOccr(String str,char ch) {
		
		ArrayList<Character> temp = new ArrayList<Character>();
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i) != ch) {
				temp.add(str.charAt(i));
			}
		}
		
		StringBuilder strBuild = new StringBuilder();
		
		for(char c:temp) {
			strBuild.append(c);
		}
		
		return strBuild.toString();
		
	}
	
	public static String remAllRep(String str) {
		
		HashSet<Character> set = new HashSet<Character>();
		String res="";
		char[] chars = str.toCharArray();
		for(char ch:chars) {
			if(!set.contains(ch)) {
				res+=ch;
				set.add(ch);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 21. Write a Java program to remove first occurrence of a character from
		// string.
		// 22. Write a Java program to remove last occurrence of a character from
		// string.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String str = sc.next();
		System.out.println("Enter Char: ");
		char ch = sc.next().charAt(0);
		String remOcc = removeOccurences(str,ch);
		
		System.out.println("After First Last removal of "+ch+" : " + remOcc);
		// 23. Write a Java program to remove all occurrences of a character from
		// string.
		
		String remAllOcc = remAllOccr(str,ch);

		System.out.println("After All of "+ch+" : ");
		System.out.println(remAllOcc);
		// 24. Write a Java program to remove all repeated characters from a given
		// string.
		
		System.out.println("Removing all repeated Characters from String: ");
		
		String ans=remAllRep(str);
		System.out.println(ans);

	}

}
