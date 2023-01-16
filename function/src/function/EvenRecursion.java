package function;

import java.util.Scanner;

public class EvenRecursion {
	public static boolean isEven(int n) {
		if (n == 0) 
			return true;
	    if (n == 1) 
	    	return false;

	    return isEven(n - 2);
	}
	public static void EvenAndOdd(int l,int r) {
		
		System.out.println("Even in range "+l+"-"+r+" : ");
		for(int i=l;i<=r;i++) {
			if(isEven(i))
				System.out.println(i);
		}
		System.out.println("Odd in range "+l+"-"+r+" : ");
		for(int i=l;i<=r;i++) {
			if(!isEven(i))
				System.out.println(i);
		}
		
	}
	public static void sumEvenOdd(int l,int r) {
		
		int sumEven=0,sumOdd=0;
		System.out.println("Sum Even range "+l+"-"+r+" : ");
		for(int i=l;i<=r;i++) {
			if(isEven(i)) {
				sumEven+=i;
				System.out.println(i);
			}
		}
		System.out.println("SumEven : " + sumEven);
		System.out.println("Odd in range "+l+"-"+r+" : ");
		for(int i=l;i<=r;i++) {
			if(!isEven(i)) {
				sumOdd+=i;
				System.out.println(i);
			}
		}

		System.out.println("SumOdd : " + sumOdd);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num TO check for even odd: ");
		int n=sc.nextInt();
		
		if(isEven(n))
			System.out.println("EVEN");
		else
			System.out.println("ODD");
		
		int l,r;
		System.out.println("Enter Range for SUM of even/odd Numbers: ");
		l=sc.nextInt();
		r=sc.nextInt();
		EvenAndOdd(l, r);
		sumEvenOdd(l,r);
		sc.close();
	}

}
