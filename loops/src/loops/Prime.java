package loops;

import java.util.Scanner;

public class Prime {
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

	public static void primeFactors(int n) {

		for (int i = 2; i <= n; i++) {

			if (isPrime(i)) {
				int x = n;
				while (x % i == 0) {
					System.out.println(i + " ");
					x /= i;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 26. Write a Java program to check whether a number is Prime number or not.

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number: ");
		int n = sc.nextInt();

		boolean check = isPrime(n);
		if (check) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}

		// 27. Write a Java program to print all Prime numbers between 1 to n.
		// 28. Write a Java program to find sum of all prime numbers between 1 to n.
		System.out.println("Enter Number N: ");
		n = sc.nextInt();
		int primeSum = 0;
		System.out.println("Prime Numbers Between 1-" + n + " :");
		for (int i = 1; i <= n; i++) {
			if (isPrime(i)) {
				System.out.println(i + " ");
				primeSum += i;
			}
		}
		System.out.println("Sum of Prime Nos 1-" + n + " : " + primeSum);

		// 29. Write a Java program to find all prime factors of a number.
		System.out.println("Enter Number N: ");
		n = sc.nextInt();
		System.out.println("Prime Factors of " + n + " are: ");
		primeFactors(n);
		sc.close();

	}

}
