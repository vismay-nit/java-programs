package loops;

import java.util.Scanner;

public class Pascal {

	public static int factorial(int n) {
		int f;

		for (f = 1; n > 1; n--) {
			f *= n;
		}
		return f;
	}

	static int ncr(int n, int r) {
		return factorial(n) / (factorial(n - r) * factorial(r));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N:/");
		
		int n, i, j;
		n = sc.nextInt();
		System.out.println();
		for (i = 0; i <= n; i++) {
			for (j = 0; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print(" " + ncr(i, j));
			}
			System.out.println();
		}
		sc.close();
	}

}
