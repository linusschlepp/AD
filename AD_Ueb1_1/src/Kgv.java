import java.util.*;

public class Kgv {

	int a, b;

	Kgv(int a, int b) {
		this.a = a;
		this.b = b;
		solve(a, b);
	}

	void solve(int a, int b) {

		int a_temp = a;
		int b_temp = b;

		while (a_temp != b_temp) {
			if (a_temp < b_temp) {
				a_temp += a;
			} else {
				b_temp += b;
			}
		}

		System.out.println("Kleinstes gemeinsames Vielfaches: " + a_temp);

	}
}
