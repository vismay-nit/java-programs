package basic;

import java.util.Scanner;

import java.lang.Math;
public class Squareroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//12.	Write a Java program to enter any number and calculate its square root.
		
		Scanner sc = new Scanner(System.in);
		double num,squrt;
		System.out.println("Enter Number: ");
		num = sc.nextDouble();
		
		squrt = Math.pow(num,0.5);

		System.out.println("Square Root of "+num+" is "+squrt);
		sc.close();
	}

}
