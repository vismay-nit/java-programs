package loops;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num,temp,cnt,dig;
		System.out.println("Enter n: ");
		num=sc.nextInt();
		
		System.out.println("digit/tfreq");
		for(int i=0;i<=9;i++)
		{
			cnt=0;
			temp=num;
			while(temp>0) {
				dig=temp%10;
				if(dig==i)
					cnt++;
				
				temp/=10;
			}
			if(cnt>0) {
				System.out.println(i+"\t"+cnt);
			}
		}
		sc.close();
	}

}
