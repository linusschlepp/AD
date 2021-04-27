
public abstract class Algorithm {

	int[] a;
	int counter = 0;

	Algorithm(int[] a_) {
		a = a_;
		solve();
		solve(a, 0, a.length-1);
	}

	public abstract void solve();

	public abstract void solve(int[] a, int f, int l);

	public void printArray(int[] a, int number) {

		System.out.print("Step " + number + ": ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}
		System.out.println();

	}

}
