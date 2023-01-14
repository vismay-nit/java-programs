package switchh;

import java.util.Scanner;

public class NoOfDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 2. Write a Java program print total number of days in a month using switch
		// case.
		int month, year;
		System.out.print("Enter the Month Number(1-12) :");
		month = sc.nextInt();

		switch (month) {
		case 1:
			System.out.println("No.of Days: 31 days");
			break;
		case 2:
			System.out.println("No.of Days: 28 days");
			break;
		case 3:
			System.out.println("No.of Days: 31 days");
			break;
		case 4:
			System.out.println("No.of Days: 30 days");
			break;
		case 5:
			System.out.println("No.of Days: 31 days");
			break;
		case 6:
			System.out.println("No.of Days: 30 days");
			break;
		case 7:
			System.out.println("No.of Days: 31 days");
			break;
		case 8:
			System.out.println("No.of Days: 31 days");
			break;
		case 9:
			System.out.println("No.of Days: 30 days");
			break;
		case 10:
			System.out.println("No.of Days: 31 days");
			break;
		case 11:
			System.out.println("No.of Days: 30 days");
			break;
		case 12:
			System.out.println("No.of Days: 31 days");
			break;
		default:
			System.out.println("Invalid month");

		}

		sc.close();
	}

}
