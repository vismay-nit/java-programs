package ifelse;

import java.util.Scanner;

public class Triangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 14. Write a Java program to input angles of a triangle and check whether
		// triangle is valid or not.
		Scanner sc = new Scanner(System.in);
		float ang1, ang2, ang3, sum;
		System.out.println("Enter 3 angles: ");
		ang1 = sc.nextFloat();
		ang2 = sc.nextFloat();
		ang3 = sc.nextFloat();
		sum = ang1 + ang2 + ang3;
		if (sum == 180)
			System.out.println("Valid triangle");
		else
			System.out.println("Invalid");

		// 15. Write a Java program to input all sides of a triangle and check whether
		// triangle is valid or not.

		int side1, side2, side3;
		System.out.println("Enter 3 sides:");
		side1 = sc.nextInt();
		side2 = sc.nextInt();
		side3 = sc.nextInt();

		if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2)) {
			System.out.println("Valid Trianlge");
		} else {
			System.out.println("Invalid Triangle");
		}
		
		
		// 16. Write a Java program to check whether the triangle is equilateral,
		// isosceles or scalene triangle.
		
		if(side1==side2 && side2==side3) {
			System.out.println("Equilateral");
		}else if(side1==side2 || side2==side3 || side1==side3) {
			System.out.println("Isosceles");
		}else {
			System.out.println("Scalene");
		}
			
		sc.close();

	}

}
