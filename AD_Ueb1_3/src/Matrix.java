import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public abstract class Matrix {

	
	
	
	static int n = 4000;
	static int m = 4000;
	static Scanner input = new Scanner(System.in);
	


	public static int[][] Init() {

		int[][] Matrix_0 = new int[n][m];

		for (int i = 0; i < Matrix_0.length; i++) {
			for (int j = 0; j < Matrix_0[i].length; j++) {
				Matrix_0[i][j] = 0;
			}

		}

		return Matrix_0;

	}

	public static void Print(int[][] Matrix_0) {

		for (int i = 0; i < Matrix_0.length; i++) {
			for (int j = 0; j < Matrix_0[i].length; j++) {
				System.out.print(Matrix_0[i][j] + " ");
			}
			System.out.println();

		}

		System.out.println();

	}

	public static int[][] Input() {
		int[][] Matrix_0 = new int[n][m];

		for (int i = 0; i < Matrix_0.length; i++) {
			for (int j = 0; j < Matrix_0[i].length; j++) {
				Matrix_0[i][j] = input.nextInt();
			}
			System.out.println();

		}

		return Matrix_0;
	}

	public static int[][] Add(int[][] Matrix, int[][] Matrix_0) {
		
		
		if (check(Matrix, Matrix_0)) {

			int[][] Matrix_sol = new int[n][m];

			for (int i = 0; i < Matrix_sol.length; i++) {
				for (int j = 0; j < Matrix_sol[i].length; j++) {
					Matrix_sol[i][j] = Matrix[i][j] + Matrix_0[i][j];
				}

			}
			
			
			return Matrix_sol;
		} else {
			return null;
		}
	}

	public static int[][] Mult(int[][] Matrix, int[][] Matrix_0) {
		if (check(Matrix, Matrix_0)) {
			int[][] retMatrix = new int[Matrix.length][Matrix_0[0].length];

			for (int i = 0; i < Matrix.length; i++) {
				for (int j = 0; j < Matrix[0].length; j++) {
					for (int k = 0; k < Matrix[0].length; k++) {
						retMatrix[i][j] = (Matrix[i][j] * Matrix_0[k][j]);
					}
				}
			}

			return retMatrix;
			
			
		} else {
			return null;
		}

	}

	
	public static boolean check(int[][] Matrix, int[][] Matrix_0) {
		if ((Matrix.length == Matrix_0.length) && (Matrix[0].length == Matrix_0[0].length)) {
			return true;
		} else if ((Matrix.length == Matrix_0[0].length) && (Matrix[0].length == Matrix[0].length)) {
			return true;
		} else {
			return false;
		}
	}

	public static int[][] befill() {
		Random ran = new Random();

		int[][] Matrix_0 = new int[n][m];
		for (int i = 0; i < Matrix_0.length; i++) {
			for (int j = 0; j < Matrix_0[i].length; j++) {
				Matrix_0[i][j] = ran.nextInt(10);
			}

		}

		return Matrix_0;
	}
	
	public static BigInteger getAdd(int n, int m)
	{
		
		BigInteger big_m = new BigInteger((String.valueOf(m)));
		BigInteger big_n = new BigInteger((String.valueOf(n)));
		
		return big_m.multiply(big_n);
		
	}
	
	public static BigInteger getMult(int m, int n, int k)
	{
		
		BigInteger big_m = new BigInteger((String.valueOf(m)));
		BigInteger big_n = new BigInteger((String.valueOf(n)));
		BigInteger big_k = new BigInteger((String.valueOf(k)));
	
		
		return big_m.multiply((big_n.multiply(big_k)));
		//return (float) m*(k*n);
		
	}


}


