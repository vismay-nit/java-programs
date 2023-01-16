package loops;

import java.util.Scanner;

public class NumberPattern {
	public static void printTitle(String title) {
		System.out.println();
		System.out.println(title);
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		printTitle("Number Pattern 1");
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(1);
			}
			System.out.println();
		}

		printTitle("Number Pattern 2");

		for (int i = 0; i < n; i++) {
			int x = 0;
			if (i % 2 == 0)
				x = 1;
			for (int j = 0; j < n; j++) {
				System.out.print(x);
			}
			System.out.println();
		}
		printTitle("Number Pattern 3");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
					System.out.print(1);
				else
					System.out.print(0);
			}
			System.out.println();
		}

		printTitle("Number Pattern 4");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j % 2 == 0)
					System.out.print(0);
				else
					System.out.print(1);
			}
			System.out.println();
		}

		printTitle("Number Pattern 5");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (i == j && j == n / 2)
					System.out.print(0);
				else
					System.out.print(1);
			}
			System.out.println();
		}

		printTitle("Number Pattern 6");
		int k = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (k == 1) {
					System.out.print(1);
				} else {
					System.out.print(0);
				}
				k *= -1;
			}

			if (n % 2 == 0) {
				k *= -1;
			}
			System.out.println();
		}
		printTitle("Number Pattern 7");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (j == n / 2 || i == n / 2)
					System.out.print(0);
				else
					System.out.print(1);
			}
			System.out.println();
		}

		printTitle("Number Pattern 8");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (i + j == n - 1 || i == j)
					System.out.print(1);
				else
					System.out.print(0);
			}
			System.out.println();
		}

		printTitle("Number Pattern 9");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (((i == 0 || i == n - 1) && (j == 0 || j == n - 1)))
					System.out.print(0);
				else if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
					System.out.print(1);
				else
					System.out.print(0);
			}
			System.out.println();
		}

		printTitle("Number Pattern 10");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				System.out.print(i + 1);
			}
			System.out.println();
		}
		printTitle("Number Pattern 11");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				System.out.print(j + 1);
			}
			System.out.println();
		}

		printTitle("Number Pattern 12");

		for (int i = 0; i < n; i++) {
			int x = i;
			for (int j = 0; j < n; j++) {

				System.out.print(x + 1);
				x++;
			}
			System.out.println();
		}

		printTitle("Number Pattern 13");
		for (int i = 0; i < n; i++) {
			int x = n * i + 1;
			for (int j = 0; j < n; j++) {
				System.out.print(x + " ");
				x++;
			}
			System.out.println();
		}

		printTitle("Number Pattern 14");
		for (int i = 0; i < n; i++) {

			for (int j = n; j > n - i - 1; j--) {
				System.out.print(j);
			}
			for (int l = 1; l < n - i; l++) {
				System.out.print(n - i);
			}

			System.out.println();
		}

		printTitle("Number Pattern 15");
		for (int i = 0; i < n; i++) {
			int t = i + 1;
			for (int j = 0; j < n - i - 1; j++) {

				System.out.print(t);
				t++;
			}

			for (int p = n - i - 1; p < n; p++) {
				System.out.print(n);
			}

			System.out.println();
		}

		printTitle("Number Pattern 16");
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(j);
			}
			for (int p = i - 1; p >= 1; p--) {
				System.out.print(p);
			}
			System.out.println();
		}

		printTitle("Number Pattern 17");
		for (int i = 1; i <= n; i++) {
			int t = i;
			for (int j = 1; j < i; j++) {
				System.out.print(t);
				t--;
			}
			for (int p = 1; p <= n - i + 1; p++) {
				System.out.print(p);
			}

			System.out.println();
		}

		printTitle("Number Pattern 18");
		for (int i = n; i > 1; i--) {
			for (int j = n; j >= 1; j--) {
				if (j > i)
					System.out.print(j);
				else
					System.out.print(i);
			}
			for (int j = 2; j <= n; j++) {
				if (j > i)
					System.out.print(j);
				else
					System.out.print(i);
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if (j > i)
					System.out.print(j);
				else
					System.out.print(i);
			}
			for (int j = 2; j <= n; j++) {
				if (j > i)
					System.out.print(j);
				else
					System.out.print(i);
			}
			System.out.println();
		}
		
		

		printTitle("Number Pattern 19");
		
		int[][] pattern =new int[n][n];
		int i, j, m,low , p, q, s, num;
		s=n;
		num = 1; // starting number
		i = 0; // 2d array row index
		j = 0; // 2d array column index
		m = 0; // to store row index lower limit
		low = s - 1; // to store row index upper limit
		p = 0; // to store column index lower limit
		q = s - 1; // to store column index upper limit

		while (num <= n * n) {
			// fill horizontally left to right
			for (j = p; j <= q; j++) {
				pattern[m][j] = num;
				num++;
			}

			// update row index lower limit
			m++;

			// fill vertically top to bottom
			for (i = m; i <= low; i++) {
				pattern[i][q] = num;
				num++;
			}

			// update column index upper limit
			q--;

			// fill horizontally right to left
			for (j = q; j >= p; j--) {
				pattern[low][j] = num;
				num++;
			}

			// update row index upper limit
			low--;

			// fill vertically bottom to top
			for (i = low; i >= m; i--) {
				pattern[i][p] = num;
				num++;
			}

			// update column index lower limit
			p++;
		}
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				System.out.print(pattern[i][j]+ " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
