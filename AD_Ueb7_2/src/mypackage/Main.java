package mypackage;
import static mypackage.LinearProbing.*;
import static mypackage.DoubleHashing.*;
import static mypackage.QuadraticProbing.*;


public class Main {

	public static void main(String[] args) {
		
		
		int[] values = new int[] {10, 22, 31, 4, 15, 28, 17, 88, 59};
		System.out.print("Linear Probing: ");
		insertLinear(values, 11);
		System.out.print("Quadratic Probing: ");
		insertQuadratic(values, 11);
		System.out.print("Double Probing: ");
		insertDouble(values, 11);
		

	}

}
