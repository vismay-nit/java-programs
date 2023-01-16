package loops;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//36.	Write a Java program to print Fibonacci series up to n terms.
		int n,a=0,b=1,temp=0;
		System.out.println("Enter N for Fibonacci:");
		n=sc.nextInt();
		System.out.println(a+"\n"+b);
		for(int i=2;i<=n;i++) {
			temp = a + b;
			System.out.println(temp);
			a=b;
			b=temp;
		}
		
		sc.close();
	}

}
