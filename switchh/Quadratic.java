package switchh;

import java.util.Scanner;

public class Quadratic {
	public static int detCheck(double det) {

		if (det > 0)
			return 1;
		else if (det == 0)
			return 0;
		else
			return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a, b, c, det;
		double root1, root2;
		int flag;
		System.out.println("enter a,b,c: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		det = (b * b) - 4 * a * c;
		flag = detCheck(det);

		switch (flag) {
		case 0:
			root1 = root2 = -b / 2 * a;
			System.out.println("Root 1: " + root1 + "\nRoot 2: " + root2);
			break;
		case 1:
			root1 = (-b + Math.sqrt(det)) / (2 * a);
			root2 = (-b - Math.sqrt(det)) / (2 * a);
			System.out.println("Root 1: " + root1 + "\nRoot 2: " + root2);
			break;
		case -1:
			double real = -b / (2 * a);
			double img = Math.sqrt(-det) / (2 * a);
			System.out.println("Root 1: " + real + " + " + img + "i");
			System.out.println("Root 2: " + real + " - " + img + "i");
			break;
		}

		sc.close();
	}

}
