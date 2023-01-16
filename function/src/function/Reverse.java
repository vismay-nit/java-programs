package function;

import java.util.Scanner;

public class Reverse {
	public static int reverse( int num1, int num2){
		   if (num1 == 0){
		      return num2;
		   }
		   num2 *= 10;
		   num2 += (num1 % 10);
		   num1 = num1/10;
		   return reverse(num1, num2);
		}

	public static void isPalindrome(int n) {
		
		int rev = reverse(n,0);
		if(rev==n)
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N to reverse:");
		int n = sc.nextInt();
		int rev = reverse(n,0);
		System.out.println("Reverse Number: "+ rev);
		System.out.println("Enter N for palindrome: ");
		n = sc.nextInt();
		isPalindrome(n);
		sc.close();
	}

}
