package loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter N to check palindrome: ");
		int n=sc.nextInt();
		int rev=0;
		for(int i=n;i>0;i/=10) {
			rev = (rev*10) + (i%10);
		}
		if(rev==n) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		sc.close();
	}

}
