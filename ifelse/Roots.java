package ifelse;

import java.util.Scanner;

public class Roots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a, b, c, det;
		double root1, root2;

		System.out.println("enter a,b,c: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		det = (b * b) - 4 * a * c;

		if (det > 0) {

			root1 = (-b + Math.sqrt(det)) / (2 * a);
			root2 = (-b - Math.sqrt(det)) / (2 * a);

			System.out.println("Root 1: " + root1 + "\nRoot 2: " + root2);
		} else if (det == 0) {

			root1 = root2 = -b / 2 * a;
			System.out.println("Root 1: " + root1 + "\nRoot 2: " + root2);
		} else {
			double real = -b / (2 * a);
			double img = Math.sqrt(-det) / (2 * a);
			System.out.println("Root 1" + real +" + " + img+"i");

			System.out.println("Root 1" + real +" - " + img+"i");
		}
		sc.close();
	}

}
