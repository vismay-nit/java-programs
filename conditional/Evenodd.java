package conditional;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num =sc.nextInt();
		String s;
		s = (num%2==0)? "Even":"Odd";
		System.out.println(s);
		sc.close();

	}

}
