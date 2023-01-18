package arrayMatrix;

import java.util.Scanner;

public class readPrint {
	public static void printArray(int arr[], int start, int len) {
		if (start >= len)
			return;

		System.out.print(arr[start] + " ");

		printArray(arr, start + 1, len);
	}

	public static void printNegative(int arr[], int n) {

		for (int i = 0; i < n; i++) {
			if (arr[i] < 0)
				System.out.print(arr[i] + " ");
		}
	}

	public static int sumArray(int arr[], int n) {
		if (n <= 0)
			return 0;
		return (sumArray(arr, n - 1) + arr[n - 1]);
	}

	public static int minElement(int arr[], int n) {
		if (n == 1)
			return arr[0];

		return Math.min(arr[n - 1], minElement(arr, n - 1));
	}

	public static int maxElement(int arr[], int n) {
		if (n == 1)
			return arr[0];

		return Math.max(arr[n - 1], maxElement(arr, n - 1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 1. Write a Java program to read and print elements of array. - using
		// recursion.
		System.out.println("Enter Size of Array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter Elements of Array: ");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Elements In Array Using Recursion: ");
		printArray(arr, 0, n);
		System.out.println();
		// 2. Write a Java program to print all negative elements in an array.
		System.out.println("Negative Numbers in Array:");
		printNegative(arr, n);

		System.out.println();

		// 3. Write a Java program to find sum of all array elements. - using recursion.
		int sum = sumArray(arr, n);
		System.out.print("Sum of array Elements: " + sum);
		System.out.println();

		// 4. Write a Java program to find maximum and minimum element in an array. -
		// using recursion.
		int minEl = minElement(arr, n);

		int maxEl = maxElement(arr, n);

		System.out.println("Minimum : " + minEl + "\nMaximum: " + maxEl);
		
		
		sc.close();
	}

}
