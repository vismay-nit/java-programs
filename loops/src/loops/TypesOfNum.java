package loops;

import java.util.Scanner;

public class TypesOfNum {
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
		// 30. Write a Java program to check whether a number is Armstrong number or
		// not.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = sc.nextInt();
		if (isArmstrong(n)) {
			System.out.println("Armstrong Number!");
		} else {
			System.out.println("Not Armstrong Number!");
		}

		// 31. Write a Java program to print all Armstrong numbers between 1 to n.
		System.out.println("Armstrong Numbers Between 1-" + n + ": ");
		for (int i = 1; i <= n; i++) {
			if (isArmstrong(i)) {
				System.out.println(i + " ");
			}
		}

		// 32. Write a Java program to check whether a number is Perfect number or not.
		System.out.println("To check for Perfect Number: ");
		System.out.println("Enter N: ");
		n = sc.nextInt();
		String ans = isPerfect(n) ? "Perfect" : "Not Perfect";
		System.out.println(ans);

		// 33. Write a Java program to print all Perfect numbers between 1 to n.
		System.out.println("Perfect Numbers Between 1-" + n + ": ");
		for (int i = 1; i <= n; i++) {
			if (isPerfect(i))
				System.out.println(i + " ");
		}
		sc.close();
	}

}
