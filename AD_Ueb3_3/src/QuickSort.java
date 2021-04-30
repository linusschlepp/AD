import java.util.*;

public class QuickSort extends Algorithm {

	QuickSort(int[] a) {
		super(a);
	
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void solve(int a[], int f, int l) {
		// printArray(a, counter++);
		int part = 0;
		if (f < l) {
			part = preparePartition(f, l, part);
			solve(a, f, part - 1);
			solve(a, part + 1, l);
		
		}

	}

	int preparePartition(int f, int l, int part) {

		Random randomVariable = new Random();

		int temp_2 = 0;
		int temp = 0;
		// int pivot = a[f];
		int pivot = randomVariable.nextInt(l-f)+f;
		temp_2 = a[pivot];
		a[pivot] = a[l];
		a[l] = temp_2;

		part = f - 1;
		pivot = a[l];
		for (int i = f; i < l; i++) {
			if (a[i] < pivot) {
				part++;
				temp = a[part];
				a[part] = a[i];
				a[i] = temp;

			}
		}

		temp = a[part+1];
		a[part+1] = a[l];
		a[l] = temp;
		printArray(a, counter++);

		return part+1;
	}

	

	@Override
	public void solve() {
		// TODO Auto-generated method stub

	}

}
