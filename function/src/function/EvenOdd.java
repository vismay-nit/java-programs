package function;

import java.util.Scanner;

public class EvenOdd {
	public static String check(int n) {

		if (n % 2 == 0)
			return "Even";
		return "Odd";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4. Write a Java program to check whether a number is even or odd using
		// functions.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number To check EVEN/ODD:");
		int n = sc.nextInt();

		System.out.println(check(n));

		sc.close();
	}

}
