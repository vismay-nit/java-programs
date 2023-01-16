package function;

import java.util.Scanner;

public class Min {
	public static int maxi(int n1, int n2) {

		if (n1 >= n2)
			return n1;
		return n2;
	}
	public static int mini(int n1, int n2) {

		if (n1 >= n2)
			return n2;
		return n1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3. Write a Java program to find maximum and minimum between two numbers using
		// functions.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers 1&2:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		System.out.println("Max: " + maxi(n1, n2));

		System.out.println("Max: " + mini(n1, n2));
		
		sc.close();
	}

}
