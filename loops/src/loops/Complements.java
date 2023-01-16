package loops;

import java.util.Scanner;

public class Complements {
	
	public static String onesComplement(String n) {
		
		return "HELLO";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Binary Number: ");
		String n=sc.nextLine();
		System.out.println(n);
		System.out.println("1's Complement: "+ onesComplement(n));

//		System.out.println("2's Complement: "+ twosComplement(n));
		sc.close();
	}

}
