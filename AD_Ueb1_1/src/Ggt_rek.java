
public class Ggt_rek {

	int a;
	int b;
	int erg;

	Ggt_rek(int a, int b) {
		this.a = a;
		this.b = b;
		erg = solve(a, b);
		System.out.println("Groesster Teiler: " + erg);
	}

	int solve(int a, int b) {
		int temp = b;

		if (temp == 0) {
			return a;
		}

		else {

			b %= a;
			a = temp;
			return solve(a, b);

		}

	}
}

