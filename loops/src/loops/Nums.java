package loops;

import java.util.Scanner;

public class Nums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 5. Write a Java program to print all odd number between 1 to 100.
		System.out.println("Odd numbers between 1-100: ");
		int x = 1;
		while (x <= 100) {
			System.out.println(x);
			x += 2;
		}
		// 6. Write a Java program to find sum of all natural numbers between 1 to n.

		long n, sum = 0, temp;
		System.out.println("Enter N for Sum(1-N): ");
		n = sc.nextInt();
		temp = n;
		while (n > 0) {
			sum += n;
			n--;
		}
		System.out.println("Sum 1 to " + temp + "= " + sum);
		sum = 0;
		// 7. Write a Java program to find sum of all even numbers between 1 to n.
		System.out.println("Enter N for SumEven(1-N): ");
		n = sc.nextLong();
		temp = n;
		for (int i = 2; i <= n; i += 2) {
			sum += i;
		}
		System.out.println("Sum of Even num 1-" + temp + "= " + sum);

		// 8. Write a Java program to find sum of all odd numbers between 1 to n.
		sum = 0;
		System.out.println("Enter N for SumEven(1-N): ");
		n = sc.nextLong();
		temp = n;
		for (int i = 1; i <= n; i += 2) {
			sum += i;
		}
		System.out.println("Sum of Odd num 1-" + temp + "= " + sum);

		// 9. Write a Java program to print multiplication table of any number.
		System.out.println("Enter N for Table : ");
		n = sc.nextLong();
		System.out.println("Multiplication Table : ");
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + n * i);
		}
		sc.close();

	}

}
