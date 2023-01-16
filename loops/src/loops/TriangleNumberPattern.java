package loops;

import java.util.Scanner;

public class TriangleNumberPattern {
	public static void printTitle(String title) {
		System.out.println();
		System.out.println(title);
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 5;

		printTitle("Number Pattern 20");

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		printTitle("Number Pattern 21");

		for (int i = n; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		printTitle("Number Pattern 22");

		for (int i = n; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print(n - i + 1);
			}
			System.out.println();
		}

		printTitle("Number Pattern 23");

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(n - i + 1);
			}
			System.out.println();
		}

		printTitle("Number Pattern 24");

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		printTitle("Number Pattern 25");

		for (int i = n; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		printTitle("Number Pattern 26");

		for (int i = 1; i <= n; i++) {
			int t = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(t);
				t--;
			}
			System.out.println();
		}

		printTitle("Number Pattern 27");

		for (int i = n; i >= 1; i--) {
			int t = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(t);
				t--;
			}
			System.out.println();
		}

		printTitle("Number Pattern 28");

		for (int i = 1; i <= n; i++) {
			int t = n;
			for (int j = 1; j <= i; j++) {
				System.out.print(t);
				t--;
			}
			System.out.println();
		}

		printTitle("Number Pattern 29");

		for (int i = n; i >= 1; i--) {
			int t = n;
			for (int j = 1; j <= i; j++) {
				System.out.print(t);
				t--;
			}
			System.out.println();
		}

		printTitle("Number Pattern 30");

		for (int i = 1; i <= n; i++) {
			int t = n;
			for (int j = 1; j <= i; j++) {
				System.out.print(t - i + 1);
				t++;

			}
			System.out.println();
		}

		printTitle("Number Pattern 31");

		for (int i = 1; i <= n; i++) {
			int t = i;
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print(t);
				t++;

			}
			System.out.println();
		}

		printTitle("Number Pattern 32");

		for (int i = 1; i <= n; i++) {
			int t = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(t);
				t++;

			}
			System.out.println();
		}

		printTitle("Number Pattern 33");

		for (int i = 1; i <= n; i++) {
			int t = n - i + 1;
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print(t);
				t++;

			}
			System.out.println();
		}
		printTitle("Number Pattern 34");

		for (int i = 1; i <= 9; i += 2) {

			for (int j = i; j <= 9; j += 2) {
				System.out.print(j);
			}
			System.out.println();
		}
		printTitle("Number Pattern 35");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 == 0)
					System.out.print(0);
				else
					System.out.print(1);

			}
			System.out.println();
		}
		printTitle("Number Pattern 36");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0)
					System.out.print(0);
				else
					System.out.print(1);

			}
			System.out.println();
		}
		printTitle("Number Pattern 37");
		int flag = 0;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				if (flag == 0) {
					System.out.print(1);
					flag = 1;
				} else {
					System.out.print(0);
					flag = 0;
				}

			}
			System.out.println();
		}
		printTitle("Number Pattern 38");
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				if (i == 1 || i == n || j == 1 || j == i)
					System.out.print(1);
				else
					System.out.print(0);

			}
			System.out.println();
		}
		printTitle("Number Pattern 39");
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		printTitle("Number Pattern 40");
		for (int i = 1; i <= n; i++) {

			if (i % 2 == 0) {
				for (int j = 2; j <= 2 * (i); j += 2) {
					System.out.print(j);
				}
			} else {
				for (int j = 1; j <= 2 * (i); j += 2) {
					System.out.print(j);
				}
			}

			System.out.println();
		}
		printTitle("Number Pattern 41");

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i * 2 - 1; j += 2) {
				System.out.print(j);
			}
			for (int k = (i - 1) * 2 - 1; k >= 1; k -= 2) {
				System.out.print(k);
			}
			System.out.println();
		}

		printTitle("Number Pattern 42");

		for (int i = 1; i <= n; i++) {

			for (int j = 2; j <= i * 2; j += 2) {
				System.out.print(j);
			}
			for (int k = (i - 1) * 2; k >= 1; k -= 2) {
				System.out.print(k);
			}
			System.out.println();
		}

		printTitle("Number Pattern 43");

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
		printTitle("Number Pattern 44");

		for (int i = 1; i <= n; i++) {
			int t = i + 1;
			// Prints the first part of pattern
			for (int j = 3; j <= i; j++) {
				System.out.print(t);
				t++;
			}

			// Prints the second part of pattern
			for (int j = (i * 2) - 1; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

		printTitle("Number Pattern 45");
		int num = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
		printTitle("Number Pattern 46");

		for (int i = 1; i <= n; i++) {

			if (i % 2 == 0) {
				for (int j = i; j >= 1; j--) {
					System.out.print(j);
				}
			} else {
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}
			}
			System.out.println();
		}

		printTitle("Number Pattern 47");
		int colCnt = 1, val = 1;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= colCnt; j++) {
				if (val == 10)
					val = 1;
				System.out.print(val);
				val++;
			}
			colCnt *= 2;

			System.out.println();
		}

		printTitle("Number Pattern 48");
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int sp = 2 * (n - i); sp > 0; sp--) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}

			System.out.println();
		}

		printTitle("Number Pattern 49");

		for (int i = 1; i <= n; i++) {
			int diff = n - 1;
			int t = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(t + " ");
				t += diff;
				diff--;
			}

			System.out.println();
		}
		printTitle("Number Pattern 50");
		int diff = 1, t = 1;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(t + " ");
				t += diff;
				diff++;
			}

			System.out.println();
		}
		printTitle("Number Pattern 51");
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(t + " ");
				t += diff;
				diff++;
			}

			System.out.println();
		}
		printTitle("Number Pattern 52");
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				if (i <= (n / 2))
					System.out.print(i);
				else
					System.out.print(n - i + 1);
			}

			System.out.println();
		}
		printTitle("Number Pattern 53");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print(j);

			}

			System.out.println();
		}
		printTitle("Number Pattern 54");
		for (int i = 1; i <= n; i++) {
			int p = i;
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print(p);
				p++;
			}

			System.out.println();
		}

		printTitle("Number Pattern 54");
		for (int i = 1; i <= n; i++) {
			int p = i;
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print(p);
				p++;
			}

			System.out.println();
		}

		printTitle("Number Pattern 55");
		for (int i = 0; i < 2 * n; i++) {
			int end = i;
			if (i >= n) {
				if (i == n)
					continue;
				end = (2 * n) - i - 1;
			}
			for (int k = 0; k <= end; k++) {
				System.out.print(k + 1);
			}

			System.out.println();
		}
		printTitle("Number Pattern 56");
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		printTitle("Number Pattern 57");

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

		printTitle("Number Pattern 58");

		System.out.println("*");
		for (int i = 1; i <= n; i++) {

			System.out.print("*");
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.print("*");
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
			System.out.print("*");
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.print("*");
			System.out.println();
		}

		System.out.println("*");

		

		printTitle("Number Pattern 59");
		 for(int i=1; i<=n; i++)
		    {
		        
		        for(int j=1; j<i; j++)
		        {
		            System.out.print(" ");
		        }

		        System.out.print(i);
		        for(int j=1; j<=((n - i) * 2 - 1); j++)
		        {
		            System.out.print(" ");
		        }
		        if(i != n)
		            System.out.print(i);

		        System.out.println();
		    }

		    for(int i=n-1; i>=1; i--)
		    {
		        for(int j=1; j<i; j++)
		        {
		            System.out.print(" ");
		        }

		        System.out.print(i);

		        for( int j=1; j<=((n - i ) * 2 - 1); j++)
		        {
		            System.out.print(" ");
		        }

		        System.out.print(i);

		        System.out.println();
		    }
	}

}
