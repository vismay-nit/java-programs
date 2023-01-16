package loops;

import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 20. Write a Java program to print all ASCII character with their values.
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= 255; i++) {
			System.out.println("Ascii of " + (char) i + ": " + i);
		}
		sc.close();
	}

}
