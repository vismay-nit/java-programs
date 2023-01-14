package basic;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// 5. Write a Java program to enter length and breadth of a rectangle and find
		// its area.

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length of Rectangle: ");
		int len = sc.nextInt();

		System.out.print("Enter Breadth of Rectangle: ");
		int breadth = sc.nextInt();

		int area = len * breadth;

		System.out.println("Area => " + len + "*" + breadth + " = " + area);
		sc.close();
	}

}
