package ifelse;

import java.util.Scanner;

public class MaxTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num1, num2, max;
		System.out.println("Enter number 1: ");
		num1 = sc.nextInt();

		System.out.println("Enter number 2: ");
		num2 = sc.nextInt();
		
		if(num1==num2) {
			System.out.println("Both are Same");
			max=num1;
		}else if(num1>num2){
			max=num1;
		}else {
			max=num2;
		}
		
		System.out.println("Max : "+ max);
		sc.close();

	}

}
