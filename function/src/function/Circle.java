package function;

import java.util.Scanner;

public class Circle {
	public static double diameter(double r) {
		return 2 * r;
	}

	public static double circ(double r) {
		return diameter(r) * 3.14;
	}

	public static double area(double r) {
		return 3.14 * (r * r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. Write a Java program to find diameter, circumference and area of circle
		// using functions.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius:");
		double r = sc.nextDouble();
		System.out.println("Diameter: " + diameter(r));
		System.out.println("Circumference: " + circ(r));
		System.out.println("circ: " + area(r));
		sc.close();
	}

}
