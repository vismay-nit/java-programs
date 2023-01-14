package conditional;

import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year: ");
		int year=sc.nextInt();
		
		String ans;
		
		ans = ((year%4==0)&& (year%100!=0) || (year%400==0))? "Leap":"Not Leap";
		System.out.println(ans);
		sc.close();
		
		
	}

}
