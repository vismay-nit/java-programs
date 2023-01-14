package basic;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// 16. Write a Java program to enter marks of five subjects and calculate total,
		// average and percentage.
		Scanner sc = new Scanner(System.in);
		int maths, chemistry, physics, biology, social, total;
		System.out.println("Enter Math,Chem,Phy,Bio,Social Marks: ");
		maths = sc.nextInt();
		chemistry = sc.nextInt();
		physics = sc.nextInt();
		biology = sc.nextInt();
		social = sc.nextInt();

		total = maths + chemistry + physics + biology + social;
		double avg, percentage;
		avg = (double) total / 5;
		percentage = ((double) total / 500) * 100;

		System.out.println("Total: " + total + "\nAverage: " + avg + "\nPercentage: " + percentage);
		sc.close();
	}

}
