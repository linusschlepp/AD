import java.util.Random;

public class QuickSort extends Algorithm {

	QuickSort(int[] a) {
		super(a);

		// TODO Auto-generated constructor stub
	}

	@Override
	public void solve(int a[], int f, int l) {
		
		int part = 0;
		if (f < l) {
			part = preparePartition(f, l, part);
			//Sortiert werte links
			solve(a, f, part - 1);
			//Sortiert werte rechts
			solve(a, part + 1, l);

		}

	}

	int preparePartition(int f, int l, int part) {

		int temp = 0;
		int pivot = a[f];
		part = f - 1;
		
		for (int i = f; i <= l; i++) {
			if (a[i] <= pivot) {
				part++;
				temp = a[part];
				a[part] = a[i];
				a[i] = temp;

			}
		}

		temp = a[part];
		a[part] = a[f];
		a[f] = temp;
		printArray(a, counter++);

		return part;
	}

	@Override
	public void solve() {
		// TODO Auto-generated method stub

	}

}
