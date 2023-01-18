package arrayMatrix;

import java.util.Scanner;

public class deleteElement {
	public static void printArray(int[] arr,int n) {
		
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		
		System.out.println();
		
	}
	public static int[] deleteElem(int[] arr,int ind) {
		
		if(arr == null || ind<0 || ind>=arr.length) 
			return arr;
		
		int[] newArr = new int[arr.length-1];
		for(int i=0,k=0;i<arr.length;i++) {
			
			if(i==ind)
				continue;
			
			newArr[k++]=arr[i];
		}
		
		return newArr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//10.	Write a Java program to delete an element from an array at specified position.
		
		int n, pos, x;
		System.out.print("Enter no. of elements you want in array:");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter all the elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the position where you want to delete element:");
		pos = sc.nextInt();
		int[] delArray = deleteElem(arr,pos);
		System.out.println("After Deleting element from pos :"+pos);
		printArray(delArray,delArray.length);
		sc.close();
	}

}
