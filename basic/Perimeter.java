package basic;

import java.util.Scanner;

public class Perimeter {

	public static void main(String[] args) {
		//4.	Write a Java program to enter length and breadth of a rectangle and find its perimeter.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length of Rectangle: ");
		int len = sc.nextInt();
		System.out.print("Enter Breadth of Rectangle: ");
		int breadth = sc.nextInt();
		
		int perimeter = 2*(len+breadth);
		System.out.println("Perimter of Rectangle: " + perimeter);
		sc.close();
	}

}
