package arrayMatrix;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("Enter the number of elements you want to store: ");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Reverse of Array:");
		for(int i=n-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
