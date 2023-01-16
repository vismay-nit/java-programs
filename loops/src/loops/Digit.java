package loops;

import java.util.Scanner;

public class Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 10. Write a Java program to count number of digits in a number.
		// 11. Write a Java program to find first and last digit of a number.
		// 12. Write a Java program to find sum of first and last digit of a number.
		// 14.	Write a Java program to calculate sum of digits of a number.
		System.out.println("Enter N: ");
		int num = sc.nextInt();
		int dig = 0, firstDig = 0, lastDig, sumFirstLast = 0,temp=num;
		int sumDig=0,prodDig=1;
		lastDig = num % 10;
		while (num != 0) {
			firstDig = num % 10;
			sumDig+=num%10;
			prodDig*=(num%10);
			num /= 10;
			dig++;
		}
		sumFirstLast = firstDig + lastDig;
		System.out.println("No of Digits: " + dig);

		System.out.println("First Digit: " + firstDig + "\nLast Digit : " + lastDig);

		System.out.println("Sum of First Last Digits: " + sumFirstLast);
		
		// 13. Write a Java program to swap first and last digits of a number.
		int rev=0,r,tempDig=dig,revNum;
		for(int i=temp;i>0;i/=10)
			rev=(rev*10)+(i%10);
//		System.out.println(rev);
		r=revNum=rev;
		rev=0;
//		System.out.println(temp);
		for(int i=temp;i>0;i/=10) {
			
			if(tempDig==dig || tempDig==1)
				rev = (rev*10) + (i%10);
			else
				rev = (rev*10) + (r%10);
			r/=10;
			tempDig--;
		}
		System.out.println("First & Last Digit Swapped: " + rev);
		System.out.println("Sum of Digits : " + sumDig);
		System.out.println("Product of Digits : " + prodDig);
		System.out.println("Reverse of Number: " + revNum);
		sc.close();
	}

}
