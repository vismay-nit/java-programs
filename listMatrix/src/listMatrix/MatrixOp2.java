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

	public static void interchangeDiag(int[][] mat) {

		int n = mat.length;
		for (int i = 0; i < n; i++) {
			int temp = mat[i][i];
			mat[i][i] = mat[i][n - i - 1];
			mat[i][n - i - 1] = temp;
		}

		for (int[] row : mat) {
			System.out.println(Arrays.toString(row));
		}

	}

	public static void lowerTrianglular(int[][] mat) {

		int[][] lowTri = new int[mat.length][mat[0].length];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (i < j)
					lowTri[i][j] = mat[i][j];
			}
		}

		for (int[] row : lowTri) {
			System.out.println(Arrays.toString(row));
		}

	}

	public static void lowerUpperTrianglular(int[][] mat) {

		int[][] lowTri = new int[mat.length][mat[0].length];
		int[][] upperTri = new int[mat.length][mat[0].length];
		int sumLow = 0, sumUp = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (i < j) {
					lowTri[i][j] = 0;
					upperTri[i][j] = mat[i][j];
					sumUp += upperTri[i][j];
				} else if (i > j) {
					upperTri[i][j] = 0;
					lowTri[i][j] = mat[i][j];

					sumLow += lowTri[i][j];

				} else {
					upperTri[i][j] = mat[i][j];
					lowTri[i][j] = mat[i][j];

					sumUp += upperTri[i][j];

					sumLow += lowTri[i][j];
				}

			}
		}
		System.out.println("Lower Triangular Matrix");
		for (int[] row : lowTri) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println("sum Lower triangular: " + sumLow);
		System.out.println("Upper Triangular Matrix");
		for (int[] row : upperTri) {
			System.out.println(Arrays.toString(row));
		}

		System.out.println("sum upper triangular: " + sumUp);

	}

	public static void transpose(int[][] mat) {

		int r = mat.length, c = mat[0].length;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(mat[j][i] + " ");
			}
			System.out.println();
		}

	}

	public static int det(int n, int[][] mat) {
		int d = 0;
		if (n == 1)
			return mat[0][0];
		else if (n == 2)
			return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
		else {
			int[][] newMat = new int[n - 1][];
			d = 0;

			for (int skipCol = 0; skipCol < n; skipCol++) {
				for (int k = 0; k < (n - 1); k++) {
					newMat[k] = new int[n - 1];
				}

				for (int i = 1; i < n; i++) {
					int skipRow = 0;
					for (int j = 0; j < n; j++) {

						if (skipCol == j) {
							continue;
						}
						newMat[i - 1][skipRow] = mat[i][j];
						skipRow++;
					}
				}

				d += Math.pow(-1, skipCol) * mat[0][skipCol] * det(n - 1, newMat);
			}

		}
		return d;
	}

	public static void checkIdentity(int[][] mat) {

		int n = mat.length;
		int flag = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (i == j) {
					if (mat[i][j] != 1) {
						flag = 1;
						break;
					}
				} else {
					if (mat[i][j] != 0) {
						flag = 1;
						break;
					}
				}

			}
			if (flag == 1) {
				break;
			}

		}
		if(flag==1) {

			System.out.println("Not Identity Matrix!");
		}
		else {
			System.out.println("Identity");
		}
	}

	public static void checkSparse(int[][] mat) {
		int zero=0;
		int n=mat.length,m=mat[0].length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(mat[i][j]==0)
					zero++;
			}
		}
		if(zero > (n*m)/2)
			System.out.println("Sparse Matrix");
		else System.out.println("Not a Sparse Matrix");
	}

	public static boolean checkSymmetric(int[][] mat) {
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				if(mat[i][j] != mat[j][i]) {
					return false;
				}
			}
		}
		return true;
		
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

		// 31. Write a Java program to interchange diagonals of a matrix.
		System.out.println("\nAfter Interchanging Diagonals:");
		interchangeDiag(mat1);

		// 32. Write a Java program to find upper triangular matrix.
		// 33. Write a Java program to find lower triangular matrix.
		// 34. Write a Java program to find sum of upper triangular matrix.
		// 35. Write a Java program to find sum of lower triangular matrix.

		lowerUpperTrianglular(mat1);

		// 36. Write a Java program to find transpose of a matrix.

		int[][] mat2 = generateMatrix();
		transpose(mat2);
		// 37. Write a Java program to find determinant of a matrix.
		double dtm = det(mat2.length, mat2);
		System.out.println("Determinant: " + dtm);

		// 38. Write a Java program to check Identity matrix.
		// 39. Write a Java program to check Sparse matrix.
		// 40. Write a Java program to check Symmetric matrix.
		int[][] mat3 =generateMatrix();
		checkIdentity(mat3);

		int[][] mat4 =generateMatrix();
		checkSparse(mat4);

		int[][] mat5 =generateMatrix();
		if(checkSymmetric(mat2)) {
			System.out.println("Symmetric");
		}else {
			System.out.println("Not Symmetric");
		}
		sc.close();

	}

}
