package basic;

import java.util.Scanner;

public class Angle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 13. Write a Java program to enter two angles of a triangle and find the third
		// angle.
		Scanner sc = new Scanner(System.in);
		double angle_1, angle_2, angle_3;
		System.out.println("Enter Angle 1: ");
		angle_1 = sc.nextDouble();

		System.out.println("Enter Angle 2: ");
		angle_2 = sc.nextDouble();

		angle_3 = 180 - (angle_1 + angle_2);

		System.out.println("Angle 3 is: " + angle_3);

		
		//14.	Write a Java program to enter base and height of a triangle and find its area.
		
		double height,base,area;
		System.out.println("Enter Height : ");
		height = sc.nextDouble();

		System.out.println("Enter Base: ");
		base = sc.nextDouble();
		
		area = 0.5*base*height;

		System.out.println("Area: "+ area);
		
		
		//15.	Write a Java program to calculate area of an equilateral triangle.
		
		double side,eqArea;
		System.out.println("Enter Side : ");
		side = sc.nextDouble();
		
		eqArea = Math.pow(3,0.5)*(side*side)/4;
		System.out.println("Area of Equilateral Triangle: "+ eqArea);
		
		sc.close();
	}

}
