import java.util.Arrays;

public class Main {

	public static void main(String... args) {
		int[] a = { 8, 65, 16, 39, 12, 89, 75, 45, 56, 95, 61, 4, 66, 3 };

		boolean result = addValues(a);
		System.out.println(result);

	}

	public static boolean addValues(int[] a) {

		int s = 24;
		int left = 0;
		int right = a.length - 1;

		mergeSort(a, 0, (a.length - 1));
		while (left < right) {
			if ((left != right) && (s == a[left] + a[right])) {
				return true;
			} else if (s > a[left] + a[right]) {
				left++;
			} else {
				right--;
			}
		}
		return false;
	}

	
	public static void mergeSort(int a[], int f, int l) {
		if (f < l) {
			int m = (f + l + 1) / 2;
			mergeSort(a, f, m - 1);
			mergeSort(a, m, l);
			merge(a, f, l, m);

		}
	}

	public static void merge(int a[], int f, int l, int m) {
		int n = l - f + 1;
		int a1f = f;
		int a1l = m - 1;
		int a2f = m;
		int a2l = l;
		int[] anew = new int[n];

		for (int i = 0; i < n; i++) {
			if (a1f <= a1l) {
				if (a2f <= a2l) {
					if (a[a1f] <= a[a2f])
						anew[i] = a[a1f++];
					else
						anew[i] = a[a2f++];
				} else
					anew[i] = a[a1f++];
			} else
				anew[i] = a[a2f++];
		}

		for (int j = 0; j < n; j++)
			a[f + j] = anew[j];

		anew = null;
	}

}
