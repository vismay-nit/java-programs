package basic;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		// 7. Write a Java program to enter length in centimeter and convert it into
		// meter and kilometer.

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Length in cm: ");
		double len = sc.nextDouble();

		double meter = len / 100;
		double kilometer = meter / 1000;
		
		System.out.println(len + "cm in meter: "+ meter +" m & in kilometer: "+ kilometer+" km");
		sc.close();
	}

}
