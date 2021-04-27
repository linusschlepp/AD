import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int[][] test_matrix;
		int[][] test_matrix2;
		int[][] test_matrix3;
		int[][] test_matrix4;
		
		test_matrix = Matrix.befill();
		test_matrix2 = Matrix.befill();
//	Matrix.Print(test_matrix);
	//	Matrix.Print(test_matrix2);
		long timestamp1 = System.currentTimeMillis();
		test_matrix3 = Matrix.Add(test_matrix, test_matrix2);
		long timestamp2 = System.currentTimeMillis();
		// System.out.println(("delta: "+ (timestamp2-timestamp1)));
		System.out.println(Matrix.getAdd(test_matrix.length, test_matrix2.length ));
		long timestamp3 = System.currentTimeMillis();
		test_matrix4 = Matrix.Mult(test_matrix, test_matrix2);
		long timestamp4= System.currentTimeMillis();
		
		
	//	System.out.println(("delta1: "+ (timestamp4-timestamp3)));
	//	 Matrix.Print(test_matrix3);
	//	Matrix.Print(test_matrix4);
		
		

System.out.println(Matrix.getMult(test_matrix.length, test_matrix2.length, test_matrix4.length ));


	}


}
