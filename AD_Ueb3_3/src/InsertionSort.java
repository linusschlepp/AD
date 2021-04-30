
public class InsertionSort extends Algorithm {

	InsertionSort(int[] a) {
		super(a);

	}

	@Override
	public void solve() {

		int key = 0;
		int j = 0;
		printArray(a, counter++);
		for (int i = a.length-2; i >= 0; i--) {

			key = a[i];
			j = i + 1;

			while (j <= a.length-1 && a[j] < key) {

				a[j -1] = a[j];
				j++;

			}

			a[j - 1] = key;
			printArray(a, counter++);

		}

	}

	@Override
	public void solve(int[] a, int f, int l) {
		// TODO Auto-generated method stub
		
	}

}
