import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int[][] testMatrix;
		int[][] testMatrix2;
		int[][] testMatrix3;
		int[][] testMatrix4;
		
		testMatrix = Matrix.befill();
		testMatrix2 = Matrix.befill();
		long timestamp1 = System.currentTimeMillis();
		testMatrix3 = Matrix.add(testMatrix, testMatrix2);
		long timestamp2 = System.currentTimeMillis();
		System.out.println(Matrix.getAdd(testMatrix.length, testMatrix2.length ));
		long timestamp3 = System.currentTimeMillis();
		testMatrix4 = Matrix.mult(testMatrix, testMatrix2);
		long timestamp4= System.currentTimeMillis();
		
		
	
		
		

System.out.println(Matrix.getMult(testMatrix.length, testMatrix2.length, testMatrix4.length ));


	}


}
