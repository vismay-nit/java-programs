package loops;

import java.util.Scanner;

public class Strong {

	public static long factorial(long n) {

		long fact = 1l;
		for (long i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}
	public static boolean isStrong(long n) {

		long temp=n;
		long sum=0,rem=0;
		while(temp!=0) {
			rem=temp%10;
			sum+=factorial(rem);
			temp/=10;
		}
		if(sum==n)
			return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//34.	Write a Java program to check whether a number is Strong number or not.
		System.out.println("Enter N: ");
		long n=sc.nextLong();
		String ans = isStrong(n)?"Strong":"Not Strong";
		System.out.println(ans);
		
		//35.	Write a Java program to print all Strong numbers between 1 to n.
		System.out.println("Enter N to check Strong Nos from 1 -N: ");
		n=sc.nextLong();
		for(long i=1;i<=n;i++) {
			if(isStrong(i))
				System.out.println(i+" ");
		}
		sc.close();
	}

}
