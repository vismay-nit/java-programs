package loops;

import java.util.Scanner;

public class Factors {
	public static void factors(int l, int r, int n) {

		System.out.println("Factors of "+n+": ");
		for (int i = l; i <= r; i++) {
			if (i == 0) {
				continue;
			} else {
				if (n % i == 0) {
					System.out.print(i + " ");
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 22. Write a Java program to find all factors of a number.
		Scanner sc = new Scanner(System.in);

		int num;
		System.out.println("Enter Number: ");
		num = sc.nextInt();

		if (num >= 0) {
			factors(1, num, num);
		} else {
			factors(num, Math.abs(num), num);
		}

		sc.close();
	}

}
