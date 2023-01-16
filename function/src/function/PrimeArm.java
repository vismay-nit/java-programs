package function;

import java.util.Scanner;

public class PrimeArm {
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
		// 5. Write a Java program to check whether a number is prime, Armstrong or
		// perfect number using functions.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter for PrimeCheck:");
		int n = sc.nextInt();
		if (isPrime(n)) {
			System.out.println("Prime");
		} else
			System.out.println("Not Prime");

		System.out.println("Enter for ArmstrongCheck:");
		n = sc.nextInt();
		if (isArmstrong(n)) {
			System.out.println("Armstrong Number!");
		} else
			System.out.println("Not Armstrong Number!");

		System.out.println("To check for Perfect Number: ");
		System.out.println("Enter N: ");
		n = sc.nextInt();
		String ans = isPerfect(n) ? "Perfect" : "Not Perfect";
		System.out.println(ans);
		sc.close();
	}

}
