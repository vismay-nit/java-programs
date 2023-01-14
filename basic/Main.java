package basic;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		// Q1. Write a Java program to perform input/output of all basic data types.
		
		System.out.println("Enter Integer: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Float: ");
		float num2 = sc.nextFloat();
		
		System.out.println("Enter Double: ");
		double num3 = sc.nextDouble();
		
		System.out.println("Enter Short: ");
		short num4 = sc.nextShort();
		
		System.out.println("Enter Byte: ");
		byte num5 = sc.nextByte();
		
		System.out.println("Enter long: ");
		long num6 = sc.nextLong();
		
		System.out.println("Enter Character: ");
		char ch = sc.next().charAt(0);
		
		System.out.println("Enter Boolean Value: ");
		boolean flag = sc.nextBoolean();
		
		System.out.println("Integer: " + num1);		
		System.out.println("Float value: " + num2);		
		System.out.println("Double value: " + num3);		
		System.out.println("Short value: " + num4);		
		System.out.println("Byte value: " + num5);		
		System.out.println("Long value: " + num6);		
		System.out.println("Character Value: " + ch);		
		System.out.println("Boolean Value: " + flag);
		
		
		sc.close();
		
	
	}

}
