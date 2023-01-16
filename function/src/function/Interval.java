package function;

import java.util.Scanner;

public class Interval {
	public static boolean isArmstrong(int n) {

		int dig = 0, temp = n;
		while (temp > 0) {
			temp /= 10;
			dig++;
		}
		temp = n;

		int sum = 0, rem = 0;
		while (temp != 0) {
			rem = temp % 10;
			sum += Math.pow(rem, dig);
			temp /= 10;
		}

		if (sum == n)
			return true;

		return false;

	}
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
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
	public static boolean isPerfect(int n) {

		int i = 1, sum = 0;
		while (i < n) {
			if (n % i == 0) {
				sum += i;
			}
			i++;
		}
		if (sum == n)
			return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int l,r;
		System.out.println("Enter range of Prime No: ");
		l = sc.nextInt();
		r=sc.nextInt();
		System.out.println("Prime Numbers Between "+l +" & "  + r+ " :");
		for (int i = l; i <= r; i++) {
			if (isPrime(i)) 
				System.out.println(i + " ");
		}
		

		System.out.println("Enter range of Strong No: ");
		l = sc.nextInt();
		r=sc.nextInt();

		System.out.println("Strong Numbers Between "+l +" & "  + r+ " :");
		for(long i=l;i<=r;i++) {
			if(isStrong(i))
				System.out.println(i+" ");
		}
		
		System.out.println("Enter range of Armstrong No: ");
		l = sc.nextInt();
		r=sc.nextInt();
		System.out.println("Armstrong Numbers Between "+l +" & "  + r+ " :");
		for (int i = l; i <= r; i++) {
			if (isArmstrong(i)) {
				System.out.println(i + " ");
			}
		}
		
		System.out.println("Enter range of Perfect No: ");
		l = sc.nextInt();
		r=sc.nextInt();
		System.out.println("Perfect Numbers Between "+l +" & "  + r+ " :");
		for (int i = l; i <= r; i++) {
			if (isPerfect(i))
				System.out.println(i + " ");
		}
		
		sc.close();
		
		
	}

}
