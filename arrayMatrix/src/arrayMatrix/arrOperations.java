package arrayMatrix;

import java.util.Scanner;

public class arrOperations {
	public static int negativeCnt(int[] arr, int n) {
		int c = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0)
				c++;
		}
		return c;
	}
	public static void printArray(int[] arr,int n) {
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int n = sc.nextInt();

		int[] arr = new int[n+1];

		System.out.println("Enter Elements of Array: ");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		// 5. Write a Java program to find second largest element in an array.
		System.out.print("2nd Max Element in Array:");
		int firstLarge = Integer.MIN_VALUE;
		int secondLarge = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			firstLarge = Math.max(arr[i], firstLarge);
		}
		for (int i = 0; i < n; i++) {

			if (arr[i] > secondLarge && arr[i] < firstLarge) {
				secondLarge = arr[i];
			}
		}
		if (secondLarge == Integer.MIN_VALUE)
			secondLarge = arr[0];
		System.out.print(secondLarge);

		// 6. Write a Java program to count total number of even and odd elements in an
		// array.

		int evenCnt = 0, oddCnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				oddCnt++;
				continue;
			}
			evenCnt++;
		}
		System.out.println();
		System.out.println("Even Number Count: " + evenCnt);
		System.out.println("Odd Number Count: " + oddCnt);

		int negCnt = negativeCnt(arr, n);
		System.out.println("Negative Number Count: " + negCnt);

		// 8. Write a Java program to copy all elements from an array to another array.
		
		int[] newArr = new int[n+1];
		for(int i=0;i<n;i++) {
			newArr[i] = arr[i];
		}
		System.out.println("After Copying arr to newArr: ");
		printArray(newArr,n);

		sc.close();
	}

}
