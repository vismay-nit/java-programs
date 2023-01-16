package function;

import java.util.Scanner;

public class cube {

	public static long cubeSolve(long n) {

		return n * n * n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Write a Java program to find cube of any number using function.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N for Cube:");
		long n = sc.nextLong();
		long ans = cubeSolve(n);
		System.out.println("Cube: " + ans);
		sc.close();
	}

}
