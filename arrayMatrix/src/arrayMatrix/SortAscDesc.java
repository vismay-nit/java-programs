package arrayMatrix;

import java.util.Scanner;

public class SortAscDesc {
	public static void printArray(int[] arr, int n) {
		for (int i = 0; i < n; i++) {

			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void sortAscending(int[] arr, int n) {

		int temp;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		printArray(arr, n);
	}

	public static void sortDescending(int[] arr, int n) {
		int temp;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {

				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		printArray(arr, n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter Arr size:");
		n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = sc.nextInt();
		}
		sortAscending(arr, n);
		sortDescending(arr, n);
	}

}
