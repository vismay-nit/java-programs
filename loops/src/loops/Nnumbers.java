package loops;

import java.util.Scanner;

public class Nnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//1.	Write a Java program to print all natural numbers from 1 to n. - using while loop
		
		int n,i=1,j;
		System.out.println("Enter N: ");
		n=sc.nextInt();
		j=n;
		while(i<=n) {
			System.out.print(i+ " ");
			i++;
		}
		System.out.println();
		//2.	Write a Java program to print all natural numbers in reverse (from n to 1). - using while loop
		while(j>0) {
			System.out.print(j+" ");
			j--;
		}
		
		//3.	Write a Java program to print all alphabets from a to z. - using while loop

		System.out.println();
		char ch='a';
		while(ch<='z') {
			System.out.print(ch+" ");
			ch++;
		}
		
		//4.	Write a Java program to print all even numbers between 1 to 100. - using while loop
		System.out.println("Numbers from 1 to 100: ");
		int x=1;
		while(x<=100) {
			System.out.println(x);
			x++;
		}

		sc.close();
	}

}
