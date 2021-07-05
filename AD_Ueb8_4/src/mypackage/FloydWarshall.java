package mypackage;

import java.io.UnsupportedEncodingException;

public class FloydWarshall {

	double[][] cMatrix;
	double[][] pMatrix;
	int max;
	
	FloydWarshall(double[][] Matrix, int max){
		this.cMatrix = Matrix;
		this.pMatrix = Matrix;
		this.max = max;
		
	}
	
	
	public void run() {
		for(int k = 0; k < cMatrix.length; k++) {
			System.out.println("Predecesser Matrix: " );
			print(pMatrix);
			
			for(int row = 0; row < cMatrix.length; row++) {
				for(int col = 0; col < cMatrix.length; col++) {
					if(cMatrix[row][col] > (cMatrix[row][k]+cMatrix[k][col]) && (cMatrix[k][col] != max)  && 
							(cMatrix[row][k] != max))
						cMatrix[row][col] = cMatrix[row][k]+cMatrix[k][col];
				}
			}
			
			System.out.println("New Matrix A ("+(k+1)+") : ");
			print(cMatrix);
			
		}
		
	}
	
	
	private void print(double[][] Matrix) {
		
		for(int i = 0; i < Matrix.length; i++) {
			for(int j = 0; j < Matrix[i].length; j++) {
				if(Matrix[i][j] == Double.POSITIVE_INFINITY) {
					String infinitySymbol = null;
					try {
						infinitySymbol = new String(String.valueOf(Character.toString('\u221E')).getBytes("UTF-16"), "UTF-16");
						
					} catch (UnsupportedEncodingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally {
						System.out.print(infinitySymbol+ " ");
					}
				

			}
				else {
					System.out.format("%.0f", Matrix[i][j]);
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		
	}
	
	
}
