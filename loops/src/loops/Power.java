package loops;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//21.	Write a Java program to find power of a number using for loop.
		Scanner sc = new Scanner(System.in);
		long x,y,pow;
		System.out.println("Enter x: ");
		x=sc.nextInt();

		System.out.println("Enter y: ");
		y=sc.nextInt();
		pow=x;
		for(long i=1;i<y;i++) {
			pow*=x;
		}
		System.out.println(x+"^"+y+" is "+pow);
		
		sc.close();
	}

}
