package basic;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 11. Write a Java program to find power of any number x ^ y.

		Scanner sc = new Scanner(System.in);
		long x, y;
		System.out.println("Enter x:");
		x = sc.nextInt();
		System.out.println("Enter y:");
		y = sc.nextInt();

		long pow = x;
		for (int i = 1; i < y; i++) {
			pow *= x;
		}
		System.out.println(x + "^" + y + " = " + pow);

		sc.close();
	}

}
