import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public abstract class Matrix {

	
	
	
	static int n = 4000;
	static int m = 4000;
	static Scanner input = new Scanner(System.in);
	


	public static int[][] init() {

		int[][] matrix = new int[n][m];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = 0;
			}

		}

		return matrix;

	}

	public static void printMatrix(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();

		}

		System.out.println();

	}

	public static int[][] input() {
		int[][] matrix = new int[n][m];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextInt();
			}
			System.out.println();

		}

		return matrix;
	}

	public static int[][] add(int[][] matrix, int[][] matrix2) {
		
		
		if (check(matrix, matrix2)) {

			int[][] matrixSolution = new int[n][m];

			for (int i = 0; i < matrixSolution.length; i++) {
				for (int j = 0; j < matrixSolution[i].length; j++) {
					matrixSolution[i][j] = matrix[i][j] + matrix2[i][j];
				}

			}
			
			
			return matrixSolution;
		} else {
			return null;
		}
	}

	public static int[][] mult(int[][] matrix, int[][] matrix2) {
		if (check(matrix, matrix2)) {
			int[][] retMatrix = new int[matrix.length][matrix2[0].length];

			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[0].length; j++) {
					for (int k = 0; k < matrix[0].length; k++) {
						retMatrix[i][j] = (matrix[i][j] * matrix2[k][j]);
					}
				}
			}

			return retMatrix;
			
			
		} else {
			return null;
		}

	}

	
	public static boolean check(int[][] matrix, int[][] matrix2) {
		if ((matrix.length == matrix2.length) && (matrix[0].length == matrix2[0].length)) {
			return true;
		} else if ((matrix.length == matrix2[0].length) && (matrix[0].length == matrix[0].length)) {
			return true;
		} else {
			return false;
		}
	}

	public static int[][] befill() {
		Random ran = new Random();

		int[][] matrix = new int[n][m];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = ran.nextInt(10);
			}

		}

		return matrix;
	}
	
	public static BigInteger getAdd(int n, int m)
	{
		
		BigInteger bigM = new BigInteger((String.valueOf(m)));
		BigInteger bigN = new BigInteger((String.valueOf(n)));
		
		return bigM.multiply(bigN);
		
	}
	
	public static BigInteger getMult(int m, int n, int k)
	{
		
		BigInteger bigM = new BigInteger((String.valueOf(m)));
		BigInteger bigN = new BigInteger((String.valueOf(n)));
		BigInteger bigK = new BigInteger((String.valueOf(k)));
	
		
		return bigM.multiply((bigN.multiply(bigK)));
		
		
	}


}


