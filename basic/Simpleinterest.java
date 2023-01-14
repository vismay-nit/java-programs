package basic;

import java.awt.Component;
import java.util.Scanner;

import javax.swing.border.CompoundBorder;

public class Simpleinterest {

	public static void main(String[] args) {
		//17. Write a Java program to enter P, T, R and calculate Simple Interest.
		Scanner sc = new Scanner(System.in);
		double p, r, t;
		double simpleInterest,compoundInterest;
		System.out.println("Enter P,R,T");
		p = sc.nextInt();
		r = sc.nextInt();
		t = sc.nextInt();
		simpleInterest = ((double)p*r*t)/100;
		System.out.println("Simple Interest: " + simpleInterest);
		
		//18.	Write a Java program to enter P, T, R and calculate Compound Interest.
		compoundInterest = p*(Math.pow((1+r/100), t))-p;
		
		System.out.println("Compund Interest: "+compoundInterest);
		
		
		sc.close();
	}

}
