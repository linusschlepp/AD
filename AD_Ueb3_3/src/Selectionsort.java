
public class Selectionsort extends Algorithm {

	Selectionsort(int[] a) {
		super(a);

	}

	@Override
	public void solve() {

		int temp = 0;
		int max = 0;
		printArray(a, counter++);

		for (int i = a.length - 1; i >= 0; i--) {

			max = i;

			for (int j = i; j >= 0; j--) {

				if (a[j] > a[max]) {
					max = j;
				}
			}

			temp = a[i];
			a[i] = a[max];
			a[max] = temp;
			printArray(a, counter++);

		}

	}

	@Override
	public void solve(int[] a, int f, int l) {
		// TODO Auto-generated method stub

	}

}
