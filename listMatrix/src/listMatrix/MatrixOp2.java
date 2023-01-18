package listMatrix;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixOp2 {
	public static int[][] generateMatrix() {
		Scanner sc = new Scanner(System.in);
		int row, col;
		System.out.println("Enter Rows and columns: ");
		row = sc.nextInt();
		col = sc.nextInt();
		int[][] matrix = new int[row][col];
		System.out.println("Enter Elements: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		return matrix;

	}

	public static int sumDiag(int[][] mat, int flag) {

		int major = 0, minor = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {

				if (i == j)
					major += mat[i][j];
				if ((i + j) == (mat.length - 1))
					minor += mat[i][j];
			}
		}
		if (flag == 1)
			return major;

		return minor;
	}

	public static int[] sumRow(int[][] mat) {

		int[] rSum = new int[mat[0].length];
		int sum;

		for (int i = 0; i < mat.length; i++) {
			sum = 0;
			for (int j = 0; j < mat[0].length; j++) {
				sum += mat[i][j];
			}
			rSum[i] = sum;
		}
		return rSum;

	}

	public static int[] sumCol(int[][] mat) {
		int[] cSum = new int[mat.length];
		int sum;

		for (int i = 0; i < mat[0].length; i++) {
			sum = 0;
			for (int j = 0; j < mat.length; j++) {
				sum += mat[j][i];
			}
			cSum[i] = sum;
		}
		return cSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] mat1 = generateMatrix();

		// 28. Write a Java program to find sum of main diagonal elements of a matrix.
		// 29. Write a Java program to find sum of minor diagonal elements of a matrix.

		System.out.println("Sum of Diagonal Elements: ");
		int major = sumDiag(mat1, 1);

		int minor = sumDiag(mat1, 0);
		System.out.println("Major Diagonal Sum: " + major);

		System.out.println("Minor Diagonal Sum: " + minor);

		// 30. Write a Java program to find sum of each row and column of a matrix.

		int[] rowSum = sumRow(mat1);

		int[] colSum = sumCol(mat1);
		System.out.println("Row Sum: ");
		System.out.println(Arrays.toString(rowSum));

		System.out.println("Column Sum: ");
		System.out.println(Arrays.toString(colSum));
	}

}
