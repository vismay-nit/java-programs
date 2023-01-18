package arrayMatrix;

import java.util.Scanner;

public class InsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 9. Write a Java program to insert an element in an array.
		int n, pos, x;
		System.out.print("Enter no. of elements you want in array:");
		n = sc.nextInt();
		int a[] = new int[n + 1];
		System.out.println("Enter all the elements:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("Enter the position where you want to insert element:");
		pos = sc.nextInt();
		System.out.print("Enter the element you want to insert:");
		x = sc.nextInt();
		for (int i = (n - 1); i >= (pos - 1); i--) {
			a[i + 1] = a[i];
		}
		a[pos - 1] = x;
		System.out.print("After inserting:");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.print(a[n]);

		sc.close();
	}

}
