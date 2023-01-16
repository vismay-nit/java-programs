package loops;

import java.util.Scanner;

public class Factorial {

	public static long factorial(long n) {

		long fact = 1l;
		for (long i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 23. Write a Java program to calculate factorial of a number.
		Scanner sc = new Scanner(System.in);

		long n;
		System.out.println("Enter Number: ");
		n = sc.nextLong();

		System.out.println("Factorial " + n + ": " + factorial(n));
		sc.close();
	}

}
