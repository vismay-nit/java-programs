package loops;

import java.util.Scanner;

public class HcfLcm {
	public static long gcd(long a,long b) {
		
		long i=1,ans=0;
		while(i<=a && i<=b) {
			
			if(a%i==0 && b%i==0)
				ans=i;
			
			i++;
		}
		return ans;
		
	}
	public static long lcm(long a,long b) {
		
		return (a*b)/gcd(a,b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 24. Write a Java program to find HCF (GCD) of two numbers.
		// 25. Write a Java program to find LCM of two numbers.

		Scanner sc = new Scanner(System.in);

		long a,b;
		System.out.println("Enter a : ");
		a = sc.nextLong();

		System.out.println("Enter b : ");
		b = sc.nextLong();
		
		System.out.println("HCF of ("+a+" "+b+") : " +gcd(a,b));

		System.out.println("LCM of ("+a+" "+b+") : " +lcm(a,b));
	}

}
