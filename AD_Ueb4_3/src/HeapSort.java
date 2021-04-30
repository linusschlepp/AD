import java.util.Arrays;

public class HeapSort {

	static void Heapify(int a[], int f, int l, int root) {
		int largest, left = f + (root - f) * 2 + 1, right = f + (root - f) * 2 + 2, temp;
		if (left <= l && a[left] > a[root])
			largest = left;
		else
			largest = root;
		if (right <= l && a[right] > a[largest])
			largest = right;
		if (largest != root) {
			temp = a[root];
			a[root] = a[largest];
			a[largest] = temp;
			Heapify(a, f, l, largest);
		}
		System.out.println(Arrays.toString(a));
	}

	static void heapSort(int a[], int f, int l) {
		BuildHeap(a, f, l);
		for (int i = l; i > f; i--) {
			int temp = a[f];
			a[f] = a[i];
			a[i] = temp;
			Heapify(a, f, i - 1, f);

		}
	}

	static void BuildHeap(int a[], int f, int l)
	{
		int n=l-f+1;
		for(int i=f+(n-2)/2; i>=f; i--)
		{
			Heapify(a,f,l,i);
		}
	}
}
