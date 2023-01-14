package basic;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		//2.	Write a Java program to enter two numbers and find their sum.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Number 2: ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println("Sum of "+ num1 + " + " + num2 + " is " + sum);
		sc.close();
	}

}
