package ifelse;

import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 18. Write a Java program to calculate profit or loss.
		Scanner sc = new Scanner(System.in);
		int cp, sp, profit, loss;
		System.out.println("Enter Cost Price: ");
		cp = sc.nextInt();

		System.out.println("Enter Selling Price: ");
		sp = sc.nextInt();

		if (sp > cp) {
			profit = sp - cp;
			System.out.println("Profit = " + profit);
		} else if (cp > sp) {
			loss = cp - sp;
			System.out.println("Loss = " + loss);
		} else {
			System.out.println("No profit or loss");
		}

		sc.close();

	}

}
