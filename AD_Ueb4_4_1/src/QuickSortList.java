import java.util.*;

public class QuickSortList {

	int a[];

	QuickSortList(int[] a) {
		this.a = a;
		solve(a, 0, a.length - 1);
		printArray();

	}

	public void solve(int a[], int f, int l) {

		int part = 0;
		if (f < l) {
			part = preparePartition(f, l, part);
			// Sortiert werte links
			solve(a, f, part - 1);
			// Sortiert werte rechts
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

		return part;
	}

	public void printArray() {
		System.out.println(Arrays.toString(a));
	}

}
