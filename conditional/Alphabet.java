package conditional;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character: ");
		char ch = sc.next().charAt(0);
		String ans;
		ans = ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))? "Alphabet":"Not Alphabet";
		System.out.println(ans);
		sc.close();
	}

}
