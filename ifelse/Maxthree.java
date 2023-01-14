package ifelse;

import java.util.Scanner;

public class Maxthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, max;
		System.out.println("Enter number 1: ");
		num1 = sc.nextInt();

		System.out.println("Enter number 2: ");
		num2 = sc.nextInt();

		System.out.println("Enter number 3: ");
		num3 = sc.nextInt();

		if (num1 >= num2 && num1 >= num3) {
			max = num1;
		} else if (num2 >= num1 && num2 >= num3) {
			max = num2;
		} else {
			max = num3;
		}

		System.out.println("Max : " + max);

	}

}
