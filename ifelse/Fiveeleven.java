package ifelse;

import java.util.Scanner;

public class Fiveeleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4. Write a Java program to check whether a number is divisible by 5 and 11 or
		// not.
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter Number :");
		n = sc.nextInt();
		if ((n % 5 == 0) && (n % 11 == 0)) {
			System.out.println("Divisible by 5 and 11");
		} else {
			System.out.println("Not Divisible by 5 and 11");
		}

		// 5. Write a Java program to check whether a number is even or odd.
		System.out.println("Enter Number :");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("ODD");
		}

		sc.close();
	}

}
