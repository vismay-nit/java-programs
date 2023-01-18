package arrayMatrix;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("Enter the number of elements you want to store: ");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Map<Integer, Integer> mp = new HashMap<>();

		for (int i = 0; i < n; i++) {

			if (mp.containsKey(arr[i])) {

				mp.put(arr[i], mp.get(arr[i]) + 1);
			} else {
				mp.put(arr[i], 1);
			}

		}
		System.out.println("Unique elements:");
		for (Map.Entry<Integer, Integer> x : mp.entrySet()) {
			
			if(x.getValue() == 1)
				System.out.println(x.getKey());
		}

	}

}
