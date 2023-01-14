package basic;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// 8. Write a Java program to enter temperature in Celsius and convert it into
		// Fahrenheit.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temp in Celsius: ");
		double cel = sc.nextDouble();

		double fah = ((cel * 9) / 5) + 32;

		System.out.println("Temp in Fahrenheit: " + fah);
		
		// 9. Write a Java program to enter temperature in Fahrenheit and convert to
		// Celsius
		System.out.print("Enter Temp in Fahrenheit: ");
		double newFah = sc.nextDouble();

		double newCel =  ((newFah-32)*5)/9;

		System.out.println("Temp in Celsius: " + newCel);
		sc.close();
	}

}
