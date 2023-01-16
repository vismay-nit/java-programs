package function;

import java.util.Scanner;

public class SumPrintElement {
	public static void printArray(int arr[], int start, int len) {
		if (start >= len)
			return;

		System.out.println(arr[start]);

		printArray(arr, start + 1, len);
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
		int n;
		System.out.print("Enter the number of elements you want to store: ");
		n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		printArray(array, 0, n);

		int sum = sumArray(array, n);
		System.out.println("Sum of array ELements: " + sum);
		
		int minEl = minElement(array,n);

		int maxEl = maxElement(array,n);
		
		System.out.println("Minimum : "+minEl+"\nMaximum: "+maxEl);
		sc.close();

	}

}
