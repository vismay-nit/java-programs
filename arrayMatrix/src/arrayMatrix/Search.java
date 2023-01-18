package arrayMatrix;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter Arr size:");
		n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element to be Searched: ");
		int x=sc.nextInt();
		int flag=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==x)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("Element found!");
		else
			System.out.println("Element Not found!");
		
	}

}
