package basic;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10. Write a Java program to convert days into years, weeks and days.
		Scanner sc = new Scanner(System.in);

		int temp, totalDays, years, weeks, days;
		System.out.println("Enter Days: ");
		temp = sc.nextInt();
		totalDays = temp;
		years = totalDays / 365;
		totalDays %= 365;

		weeks = totalDays / 7;
		totalDays %= 7;

		days = totalDays;

		System.out.println(temp + " days in: ");
		System.out.println("Years : " + years);
		System.out.println("Weeks : " + weeks);
		System.out.println("Days : " + days);

		sc.close();
	}

}
