package ifelse;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6. Write a Java program to check whether a year is leap year or not.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year: ");
		int year = sc.nextInt();

		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not Leap Year");
		}

		// 7. Write a Java program to check whether a character is alphabet or not.
		System.out.println("Enter Character: ");
		char ch = sc.next().charAt(0);
		if((ch>='A'&& ch<='Z') || (ch>='a' && ch<='z')) {
			System.out.println("Alphabet");
		}else {
			System.out.println("Not an Alphabet");

		}
			
		
		
		sc.close();
	}

}
