package switchh;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double num1, num2, result;
		char op;
		System.out.println("Enter Num1: ");
		num1 = sc.nextDouble();

		System.out.println("Enter Num2: ");
		num2 = sc.nextDouble();

		System.out.println("Enter Operation: ");
		op = sc.next().charAt(0);

		switch (op) {
		case '+':
			result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + result);
			break;
		case '/':
			result = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + result);
			break;
		case '%':
			result = num1 % num2;
			System.out.println(num1 + " % " + num2 + " = " + result);
			break;

		}
		sc.close();
	}

}
