package function;

import java.util.Scanner;

public class SumDigit {
	public static int sumDig(int n) {

		if (n == 0)
			return 0;

		return n % 10 + sumDig(n / 10);
	}

	public static long factorial(long n) {

		if (n == 1)
			return 1;

		return n * factorial(n - 1);
	}

	public static long fib(long n) {
		if (n <= 1) {
			return n;
		}

		return fib(n - 1) + fib(n - 2);
	}

	public static int gcd(int x, int y) {
		if (y == 0)
			return x;
		else
			return gcd(y, x % y);
		
	}
	public static int lcm(int x, int y) {
		
		return x*y/gcd(x,y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N to SumDig:");
		int n = sc.nextInt();

		int ans = sumDig(n);
		System.out.println("Sum of Digits: " + ans);

		System.out.println("Enter N for factorial:");
		long x = sc.nextInt();
		long fact = factorial(x);
		System.out.println("Factorial: " + fact);

		System.out.println("Enter N for fibonacci:");
		x = sc.nextInt();
		long fTerm = fib(x);
		System.out.println("Fib(n): " + fTerm);

		System.out.println("Enter a,b for gcd:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcdAns = gcd(a, b);
		System.out.println("Gcd : " + gcdAns);
		
		System.out.println("Enter a,b for lcm:");
		a = sc.nextInt();
		b = sc.nextInt();
		int lcmAns = lcm(a, b);
		System.out.println("LCM : " + lcmAns);

		sc.close();

	}

}
