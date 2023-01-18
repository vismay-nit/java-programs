package listMatrix;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixOp {
	public static void printMatrix(int[][] matrix) {

		for (int[] row : matrix)
			System.out.println(Arrays.toString(row));
	}

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

	public static int[][] addMatrix(int[][] mat1, int[][] mat2) {

		int r1 = mat1.length, r2 = mat2.length, c1 = mat1[0].length, c2 = mat2[0].length;

		int[][] resultant = new int[r1][c2];
		if ((r1 != r2) || (c1 != c2))
			return resultant;

		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				resultant[i][j] = mat1[i][j] + mat2[i][j];
			}
		}

		return resultant;

	}

	public static int[][] subMatrix(int[][] mat1, int[][] mat2) {

		int r1 = mat1.length, r2 = mat2.length, c1 = mat1[0].length, c2 = mat2[0].length;

		int[][] resultant = new int[r1][c2];
		if ((r1 != r2) || (c1 != c2))
			return resultant;

		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				resultant[i][j] = mat1[i][j] - mat2[i][j];
			}
		}

		return resultant;

	}

	public static int[][] scalarMul(int[][] mat, int n) {

		int[][] res = new int[mat.length][mat[0].length];
		if (mat.length == 0 || mat[0].length == 0)
			return res;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				res[i][j] = n * mat[i][j];
			}
		}

		return res;

	}

	public static int[][] mulMatrix(int[][] mat1, int[][] mat2) {

		int r1 = mat1.length, r2 = mat2.length, c1 = mat1[0].length, c2 = mat2[0].length;

		int[][] resultant = new int[r1][c2];
		if ((r1 != r2) || (c1 != c2))
			return resultant;

		for (int i = 0; i < r1; i++) {
			int sum = 0;
			for (int j = 0; j < c2; j++) {
				for (int k = 0; k < c2; k++) {
					sum += mat1[i][k] * mat2[k][j];
				}

				resultant[i][j] = sum;
			}
		}

		return resultant;

	}

	public static String equalOrNot(int[][] mat1, int[][] mat2) {
		int r1 = mat1.length, r2 = mat2.length, c1 = mat1[0].length, c2 = mat2[0].length;

		int[][] resultant = new int[r1][c2];
		if ((r1 != r2) || (c1 != c2))
			return "Not Equal";

		for (int i = 0; i < r1; i++) {

			for (int j = 0; j < c2; j++) {
				if (mat1[i][j] != mat2[i][j])
					return "Not Equal";
			}
		}
		return "Equal";

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] mat1 = generateMatrix();

		int[][] mat2 = generateMatrix();

		int[][] addn = addMatrix(mat1, mat2);
		int[][] sub = subMatrix(mat1, mat2);
		// 23. Write a Java program to add two matrices.
		System.out.println("Addition of Matrices: ");
		printMatrix(addn);

		// 24. Write a Java program to subtract two matrices.
		System.out.println("Subtraction of Matrices: ");
		printMatrix(sub);

		// 25. Write a Java program to perform Scalar matrix multiplication.
		System.out.println("Enter N to multiply:");
		int n = sc.nextInt();
		int[][] scalar = scalarMul(mat1, n);
		System.out.println("Scalar multiplication: ");
		printMatrix(scalar);

		// 26. Write a Java program to multiply two matrices.
		int[][] mul = mulMatrix(mat1, mat2);
		System.out.println("Multiplication of Matrices: ");
		printMatrix(mul);

		// 27. Write a Java program to check whether two matrices are equal or not.
		int[][] matc1 = generateMatrix();

		int[][] matc2 = generateMatrix();

		String checkEqual = equalOrNot(matc1, matc2);
		System.out.println(checkEqual);
	}

}
