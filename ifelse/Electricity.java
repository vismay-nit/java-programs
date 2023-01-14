package ifelse;

import java.util.Scanner;

public class Electricity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int unit;
		double surcharge,amount,totalAmount;
		
		System.out.println("Enter Units: ");
		unit=sc.nextInt();
		if(unit<=50) {
			amount=unit*0.50f;
		}else if(unit<=100) {
			amount=unit*0.75f;
		}else if(unit<=200) {
			amount=unit*1.20f;
		}else{
			amount=unit*1.50f;
		}
		
		surcharge=amount*0.2f;
		totalAmount = amount+surcharge;
		System.out.println("Electricity Bill: "+ totalAmount);
		sc.close();
	}

}
