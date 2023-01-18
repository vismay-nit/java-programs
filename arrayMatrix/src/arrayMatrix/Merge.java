package arrayMatrix;

import java.util.Scanner;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 15. Write a Java program to merge two array to third array.
		Scanner sc=new Scanner(System.in);
		int n,m,x;
		System.out.println("Enter Arr1 size:");
		n=sc.nextInt();

		int[] arr1 = new int[n];

		System.out.println("Enter the elements of the array1: ");
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter Arr2 size:");
		
		m=sc.nextInt();
		int[] arr2 = new int[m];

		System.out.println("Enter the elements of the array2: ");
		for(int i=0;i<m;i++) {
			arr2[i]=sc.nextInt();
		}
		x=n+m;
		int[] merged=new int[x];
		int k=0;
		System.out.println("Merged Array3: ");
		for(int i=0;i<n;i++) {
			merged[k++] = arr1[i];
		}
		for(int i=0;i<m;i++) {
			
			merged[k++]=arr2[i];
		}
		
		for(int i=0;i<x;i++) {
			System.out.print(merged[i]+" ");
		}
		
		sc.close();
	}

}
