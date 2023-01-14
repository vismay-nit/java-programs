package conditional;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		//1.	Write a Java program to find maximum between two numbers using conditional operator.
		Scanner sc = new Scanner(System.in);
		int num1, num2, max;
		System.out.println("Enter number 1: ");
		num1 = sc.nextInt();

		System.out.println("Enter number 2: ");
		num2 = sc.nextInt();
		max = num1 > num2 ? num1 : num2;

		System.out.println("Maximum Number among 2: " + max);
		
		//2.	Write a Java program to find maximum between three numbers using conditional operator.
		
		int n1,n2,n3,mx;
		System.out.println("Enter number 1: ");
		n1 = sc.nextInt();

		System.out.println("Enter number 2: ");
		n2 = sc.nextInt();
		System.out.println("Enter number 3: ");
		n3 = sc.nextInt();
		
		mx= n1>n2?
				  n1>n3? n1:n3
				  :
				  n2>n3? n2:n3;
		

		System.out.println("Maximum Number among 3: " + mx);
			
		sc.close();

	}

}
