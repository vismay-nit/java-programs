package loops;

import java.util.Scanner;

public class Star {

	public static void printTitle(String title) {
		System.out.println();
		System.out.println(title);
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 5;

		printTitle("Square Start Pattern");
		for (int i = 0; i < n; i++) {// row

			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}

		printTitle("Hollow Square Star Pattern");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((j == n - 1 || j == 0) || (i == 0 || i == n - 1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		printTitle("Hollow Square Star Pattern with Diagonal");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == j || i + j == n - 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		printTitle("Rhombus Star Pattern");
		for (int i = n; i > 0; i--) {

			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k < n; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		printTitle("Hollow Rhombus Star Pattern");
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i + 1; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k < n; k++) {
				if (k == 0 || k == n - 1 || i == 0 || i == n - 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		printTitle("Mirrored Rhombus Star Pattern");
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k < n; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		printTitle("Hollow Mirrored Rhombus Star Pattern");
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k < n; k++) {
				if (k == 0 || k == n - 1 || i == 0 || i == n - 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		printTitle("Right Triangle Star Pattern");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		printTitle("Hollow Right Triangle Star Pattern");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (i == j || j == 0 || i == n - 1 || j == n - 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}

			System.out.println();
		}

		printTitle("Mirrored Right Triangle Star Pattern");
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("  ");
			}
			for (int k = n - i - 1; k < n; k++) {
				System.out.print("* ");
			}

			System.out.println();

		}

		printTitle("Hollow Mirrored Right Triangle Star Pattern");
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("  ");
			}
			for (int k = n - i - 1; k < n; k++) {
				if (i + k < n || k == n - 1 || i == n - 1) {
					System.out.print("* ");
					continue;
				}
				System.out.print("  ");
			}

			System.out.println();

		}

		printTitle("Inverted Right Triangle Star Pattern");

		for (int i = 0; i < n; i++) {

			for (int j = 0; j <= n - i - 1; j++) {
				System.out.print("* ");
			}

			System.out.println();

		}

		printTitle("Hollow Inverted Right Triangle Star Pattern");
		for (int i = 0; i < n; i++) {

			for (int j = 0; j <= n - i - 1; j++) {
				if (j == 0 || i == 0 || i + j == n - 1) {
					System.out.print("* ");
					continue;
				}
				System.out.print("  ");
			}
			System.out.println();

		}

		printTitle("Inverted Mirrored Right Triangle Star Pattern");
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				if (i <= j) {
					System.out.print("* ");
					continue;
				}
				System.out.print("  ");
			}

			System.out.println();

		}

		printTitle("Hollow Inverted Mirrored Right Triangle Star Pattern");
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				if (i == 0 || j == n - 1 || i == j) {
					System.out.print("* ");
					continue;
				}
				System.out.print("  ");
			}

			System.out.println();

		}

		printTitle("Pyramid Start Pattern");
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k <= 2 * i; k++) {
				System.out.print("* ");
			}

			System.out.println();

		}
		printTitle("Hollow Pyramid Start Pattern");
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k <= 2 * i; k++) {
				if (i == 0 || i == n - 1 || k == 2 * i || k == 0) {
					System.out.print("* ");
					continue;
				}
				System.out.print("  ");

			}

			System.out.println();

		}
		printTitle("Inverted Pyramid Star Pattern");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k <= 2 * (n - i - 1); k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		printTitle("Hollow Inverted Pyramid Star Pattern");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k <= 2 * (n - i - 1); k++) {
				if (k == 0 || k == 2 * (n - i - 1) || i == 0) {
					System.out.print("* ");
					continue;
				}

				System.out.print("  ");
			}
			System.out.println();
		}

		printTitle("Half Diamond Star Pattern");
		for (int i = 0; i < 2 * n; i++) {
			int end = i;
			if (i >= n) {
				if (i == n)
					continue;
				end = (2 * n) - i - 1;
			}
			for (int k = 0; k <= end; k++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		printTitle("Mirrored Half Diamond Star Pattern");
		for (int i = 0; i < 2 * n; i++) {

			int x = n - i - 1;
			if (i >= n) {
				if (i == n)
					continue;
				x = i - n;
			}

			for (int j = 0; j < x; j++) {
				System.out.print("  ");
			}
			for (int k = x; k < n; k++) {
				System.out.print("* ");
			}
			System.out.println();

		}

		printTitle("Diamond Star Pattern");

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i - 1; j++)
				System.out.print("  ");
			for (int k = 0; k <= 2 * i; k++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		for (int i = 1; i < n; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k <= 2 * (n - i - 1); k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		printTitle("Hollow Diamond Star Pattern");
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i - 1; j++)
				System.out.print("  ");
			for (int k = 0; k <= 2 * i; k++) {
				if (k == 0 || k == 2 * i) {
					System.out.print("* ");
					continue;
				}
				System.out.print("  ");

			}

			System.out.println();
		}

		for (int i = 1; i < n; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k <= 2 * (n - i - 1); k++) {
				if (k == 0 || k == 2 * (n - i - 1)) {

					System.out.print("* ");
					continue;
				}
				System.out.print("  ");
			}
			System.out.println();
		}

		printTitle("Right Arrow Star Pattern");
		// Upper Part
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < 2 * i; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k < n - i; k++) {
				System.out.print("x ");
			}
			System.out.println();
		}
		// lower part
		for (int i = 1; i < n; i++) {

			for (int j = 0; j < 2 * (n - i - 1); j++) {
				System.out.print("  ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("x ");
			}
			System.out.println();
		}

		printTitle("Left Arrow Star Pattern");
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k < n - i; k++) {
				System.out.print("x ");
			}
			System.out.println();
		}
		// lower part
		for (int i = 2; i <= n; i++) {

			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k > 0; k--) {
				System.out.print("x ");
			}
			System.out.println();
		}

		printTitle("Plus Star Pattern");
		for (int i = 0; i < 2 * n - 1; i++) {

			if (i == n - 1) {

				for (int j = 0; j < 2 * n - 1; j++) {
					System.out.print("+ ");
				}
			} else {

				for (int j = 0; j < n - 1; j++) {
					System.out.print("  ");
				}
				System.out.print("+ ");
			}

			System.out.println();
		}

		printTitle("X Star Pattern");

		int k = n * 2 - 1;

		for (int i = 1; i <= k; i++) {

			for (int j = 1; j <= k; j++) {

				if (i == j || j == k - i + 1) {
					System.out.print("* ");

				}
				System.out.print("  ");
			}
			System.out.println();
		}

		printTitle("Eight Star Pattern");

		for (int i = 0; i < 2 * n; i++) {

			for (int j = 0; j < n; j++) {

				if (((i == 0) && (j == 0 || j == n - 1)) || (i == 2 * n - 1) && (j == 0 || j == n - 1)
						|| ((i == n - 1) && (j == 0 || j == n - 1))) {

					System.out.print("   ");
				} else if ((i == 0) || (i == n - 1) || (i == (n * 2) - 1) || (j == 1) || (j == n - 1)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
		n = 10;
		printTitle("Heart Star Pattern");
		for (int i = n / 2; i <= n; i += 2) {
			for (int j = 1; j < n - i; j += 2) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// below inverted pyramid

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int z = 0; z <= 2 * (n - i - 1); z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		printTitle("Heart Star Pattern with Name");
		
		System.out.println("Enter Name: ");
		String str = sc.nextLine();
		int len = str.length();
		for (int i = n / 2; i <= n; i += 2) {
			for (int j = 1; j < n - i; j += 2) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// below inverted pyramid

		for(int i=n; i>=1; i--)
	    {
	        for(int j =i; j<n; j++)
	        {
	            System.out.print(" ");
	        }
	        if(i == n)
	        {
	            for(int j=1; j<=((n * 2)-len)/2; j++)
	            {
	            	System.out.print("*");
	            }
	            System.out.print(str);
	            for(int l =((n * 2)-len)/2; l< n; l++)
	            {
	                System.out.print("*");
	            }
	        }
	        else
	        {
	            for(int j=1; j<=(i*2)-1; j++)
	            {System.out.print("*");
	            }
	        }
	        System.out.println();
	    }
		sc.close();
	}

}
