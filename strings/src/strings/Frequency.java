package strings;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 18. Write a Java program to find highest frequency character in a string.
		// 19. Write a Java program to find lowest frequency character in a string.
		// 20. Write a Java program to count frequency of each character in a string.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String str = sc.next();
		int[] freq = new int[256];
		
		for(int i=0;i<str.length();i++) {
			freq[str.charAt(i)]++;
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		char high=' ',low=' ';
		
		for(int i=0;i<str.length();i++) {
			
			if(max<freq[str.charAt(i)]) {
				max = freq[str.charAt(i)];
				high=str.charAt(i);
			}
			
			if(min>freq[str.charAt(i)]) {
				min=freq[str.charAt(i)];
				low=str.charAt(i);
			}
		}
		System.out.println("Highest Frequency Char: " + high +" Freq: " + max);
		System.out.println("Low Frequency Char: " + low +" Freq: " + min);
	}

}
