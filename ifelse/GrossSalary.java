package ifelse;

import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 20.	Write a Java program to input basic salary of an employee and calculate its Gross salary according to following:
//		Basic Salary <= 10000 : HRA = 20%, DA = 80%
//				Basic Salary <= 20000 : HRA = 25%, DA = 90%
//				Basic Salary > 20000 : HRA = 30%, DA = 95%

		Scanner sc=new Scanner(System.in);
		float hra,da;
		int basic_sal;

		System.out.println("Enter The Basic Salary :");
		basic_sal=sc.nextInt();
		
		if(basic_sal<=10000) {
			hra=basic_sal*0.2f;
			da=basic_sal*0.8f;
		}else if(basic_sal<=20000) {
			hra=basic_sal*0.25f;
			da=basic_sal*0.9f;
		}else{
			hra=basic_sal*0.3f;
			da=basic_sal*0.95f;
		}
		
		System.out.println("Gross Salary: " + (basic_sal+hra+da));
		
		sc.close();
	}

}
