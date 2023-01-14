package basic;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// 6. Write a Java program to enter radius of a circle and find its diameter,
		// circumference and area.
		final double pi = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius of Circle: ");
		int radius = sc.nextInt();

		int diameter = 2 * radius;
		double circumference = pi * diameter;
		double area = pi * (radius * radius);

		System.out.println("Diameter : " + diameter);

		System.out.println("Circumference : " + circumference);

		System.out.println("Area : " + area);
		sc.close();
	}

}
