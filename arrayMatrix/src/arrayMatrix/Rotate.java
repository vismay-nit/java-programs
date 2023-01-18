package arrayMatrix;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate {

	public static void leftRotate(int[] arr, int n, int d) {
		
		if (d< 0) {
	        return;
	    }
		d%=n;
		int[] temp = new int[n];
		int k=0;
		for(int i=d;i<n;i++) {
			temp[k++]=arr[i];
		}
		for(int i=0;i<d;i++) 
			temp[k++]=arr[i];
		for(int i=0;i<n;i++) {
			arr[i]=temp[i];
		}

	    System.out.println(Arrays.toString(arr));
	}

	public static void rightRotate(int[] arr, int n, int d) {
		
		d%=n;
		int[] temp=new int[n];
		int j=0;
		for(int i=d;i<n;i++) {
			temp[i]=arr[j++];
		}
		
		for(int i=0;i<d;i++) {
			temp[i]=arr[j++];
		}
		
		
	    System.out.println(Arrays.toString(temp));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//6.	Write a Java program to left rotate an array.
		//
		//7.	Write a Java program to right rotate an array.
		int n, d;
		System.out.print("Enter the number of elements you want to store: ");
		n = sc.nextInt();
		int[] arr1 = new int[n];
		int [] arr2 =new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
			arr2[i]=arr1[i];
		}
		System.out.println("Enter How many rotations: ");
		d = sc.nextInt();
		System.out.println("Left rotation: ");
		leftRotate(arr1, n, d);

		System.out.println("Right rotation: ");
		rightRotate(arr2, n, d);

		sc.close();
	}

}
