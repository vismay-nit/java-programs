package function;

import java.util.Scanner;

public class Recursion {

	public static double power(double x, double y) {

		if (y == 0)
			return 1;
		return x * power(x, y - 1);
	}

	public static void printNatural(int n) {

		if (n == 0)
			return;
		printNatural(n - 1);

		System.out.println(n);

	}

	public static int sumNatural(int n) {

		if (n != 0)
			return n + sumNatural(n - 1);
		else
			return n;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x, y;
		System.out.println("Enter X:");
		x = sc.nextDouble();
		System.out.println("Enter Y:");
		y = sc.nextDouble();

		double ans = power(x, y);
		System.out.println(x + "^" + y + " = " + ans);

		System.out.println("Enter n:");
		int n = sc.nextInt();
		printNatural(n);
		System.out.println("Sum of Natural Numbers 1-n: ");
		System.out.println(sumNatural(n));
		sc.close();
	}

}
