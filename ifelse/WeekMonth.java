package ifelse;

import java.util.Scanner;

public class WeekMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//11.	Write a Java program to input week number and print week day.
		System.out.print("Enter the Week Number(1-7) :");
		int num = sc.nextInt();			
		if(num==1)
			System.out.println("This is a Sunday");
		else if(num==2)
			System.out.println("This is a Monday");
		else if(num==3)
			System.out.println("This is a Tuesday");
		else if(num==4)
			System.out.println("This is a Wednesday");
		else if(num==5)
			System.out.println("This is a Thursday");
		else if(num==6)
			System.out.println("This is a Friday");
		else if(num==7)
			System.out.println("This is a Saturday");
		else
			System.out.println("Enter 1 to 7...");
		
		//12.	Write a Java program to input month number and print number of days in that month.
		int month,year;
		System.out.print("Enter the Month Number(1-12) :");
		month=sc.nextInt();
		System.out.println("Enter year: "); 
		year=sc.nextInt();
		if((month == 2) && ((year%4==0 && year%100!=0)|| (year%400==0)))
			System.out.println("No.of Days: 29 days");
		else if(month==2)
			System.out.println("No.of Days: 28 days");
		else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
			System.out.println("No.of Days: 31 days");
		else if(month==2||month==4||month==6||month==9||month==11)
			System.out.println("No.of Days: 30 days");
		else
			System.out.println("Enter valid month year");
		
		
		sc.close();
	}

}
