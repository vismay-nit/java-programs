package basic;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		// 3. Write a Java program to enter two numbers and perform all arithmetic
		// operations.
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number 1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter Number 2: ");
		int num2 = sc.nextInt();

		int addn = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		float div = (float)num1 / num2;
		int mod = num1 % num2;

		System.out.println("Addition: " + addn);
		System.out.println("Subtraction: " + sub);
		System.out.println("Multiplication: " + mul);
		System.out.println("Division: " + div);
		System.out.println("Modulo: " + mod);

		sc.close();

	}

}
