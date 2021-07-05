
package mypackage;



public class Main {
	
	
	public static void main(String... args) {
		double Matrix[][] = 
				{{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, -1.0, Double.POSITIVE_INFINITY},
				{1.0, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 2.0, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
				{Double.POSITIVE_INFINITY, 2.0, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, -8.0}, 
				{-4.0, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 3.0, Double.POSITIVE_INFINITY},
				{Double.POSITIVE_INFINITY, 7.0, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY}, 
				{Double.POSITIVE_INFINITY, 5.0, 10.0, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY}};

		FloydWarshall fw = new FloydWarshall(Matrix, 6);
		fw.run();

	}

}
