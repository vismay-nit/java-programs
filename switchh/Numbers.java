package switchh;

import java.util.Scanner;

public class Numbers {
	public static int check(int number) {
		if (number > 0) {
			return 1;
		} else if (number < 0) {
			return 0;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// 4. Write a Java program to find maximum between two numbers using switch
		// case.

		int num1, num2;

		System.out.println("Enter Both Numbers:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		int ans = num1 > num2 ? 0 : 1;
		if (num1 == num2) {
			System.out.println("Both are equal");
		} else {
			switch (ans) {
			case 0:
				System.out.println("Max : " + num1);
				break;
			case 1:
				System.out.println("Max : " + num2);
				break;
			}

		}
		// 5. Write a Java program to check whether a number is even or odd using switch
		// case.
		System.out.println("Enter Number: ");
		int num = sc.nextInt(), check;

		switch (num % 2) {
		case 0:
			System.out.println("Even");
			break;
		case 1:
			System.out.println("Odd");
			break;
		}
		// 6. Write a Java program to check whether a number is positive, negative or
		// zero using switch case.

		System.out.println("Enter Number to check sign: ");
		int n , res;
		n = sc.nextInt();
		res = check(n);

		switch (res) {
		case 0:
			System.out.println("Negative");
			break;
		case 1:
			System.out.println("Positive");
			break;
		case -1:
			System.out.println("Zero");
			break;
		}

		sc.close();
	}

}
