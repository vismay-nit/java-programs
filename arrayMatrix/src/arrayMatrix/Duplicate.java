package arrayMatrix;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		// 13. Write a Java program to count total number of duplicate elements in an
		// array.
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
		int[] temp = new int[n];
		int cntDuplicate = 0,j=0;
		for (Map.Entry<Integer, Integer> x : mp.entrySet()) {

			if (x.getValue() != 1)
				cntDuplicate++;
			else {
				temp[j++]=x.getKey();
			}
		}

		System.out.println("Duplicate elements: " + cntDuplicate);

		// 14. Write a Java program to delete all duplicate elements from an array.
		System.out.println("After deleting duplicates:");
		for(int i=0;i<j;i++) {
			System.out.print(temp[i]+" ");
		}
		
	}

}
