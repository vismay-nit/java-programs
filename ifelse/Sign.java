package ifelse;

import java.util.Scanner;

public class Sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter Number :");
		n = sc.nextInt();
		if(n==0) {
			System.out.println("Number is Zero");
		}else if(n>0) {
			System.out.println("Number is Positive");
		}else {
			System.out.println("Number is Negative");
		}
			
		sc.close();
	}

}
