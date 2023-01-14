package ifelse;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 19.	Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
			Percentage >= 90% : Grade A
			Percentage >= 80% : Grade B
			Percentage >= 70% : Grade C
			Percentage >= 60% : Grade D
			Percentage >= 40% : Grade E
			Percentage < 40% : Grade F
		 */
		Scanner sc = new Scanner(System.in);
		int physics, chemistry, biology, mathematics, computer;
		System.out.println("Enter Physics Marks: ");
		physics = sc.nextInt();
		System.out.println("Enter Chemistry Marks: ");
		chemistry = sc.nextInt();
		System.out.println("Enter Biology Marks: ");
		biology = sc.nextInt();
		System.out.println("Enter Maths Marks: ");
		mathematics = sc.nextInt();
		System.out.println("Enter Computer Marks: ");
		computer = sc.nextInt();
		
		double perc;
		perc = (double)((physics+ chemistry+biology+mathematics+ computer)*100)/500;
		System.out.println("Percentage: " + perc);
		if(perc>=90) {
			System.out.println("Grade A");
		}else if(perc>=80) {
			System.out.println("Grade B");
		}else if(perc>=70) {
			System.out.println("Grade C");
		}else if(perc>=60) {
			System.out.println("Grade D");
		}else if(perc>=40) {
			System.out.println("Grade E");
		}else {
			System.out.println("Grade F");
		}
		sc.close();
	}

}
