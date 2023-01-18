package arrayMatrix;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter Arr size:");
		n=sc.nextInt();
		int[] arr=new int[n],even =new int[n],odd =new int[n];
		int j=0,k=0;
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
			if(arr[i]%2==0)
				even[j++]=arr[i];
			else
				odd[k++]=arr[i];
		}
		System.out.println();
		System.out.print("Even Arr: " );
		for(int i=0;i<j;i++) {
			System.out.print(even[i]+" ");
		}
		System.out.print("\nOdd Arr: " );
		for(int i=0;i<k;i++) {
			System.out.print(odd[i]+" ");
		}
	}

}
