
public class Bubblesort extends Algorithm {

	Bubblesort(int[] a) {
		super(a);

	}

	@Override
	public void solve() {

		int temp = 0;
		printArray(a, counter++);
		for (int i = 0; i < a.length; i++) {
			
			//iteriert von hinten durch
			for (int j = a.length - 2; j >=i; j--) {
				/*
				wenn der vordere Wert gr��er ist als der n�chste ist, wird getauscht d.h. 
				Minimum wandert nach vorne bzw. der index wird verkleinert
				*/
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					printArray(a, counter++);

				}

			}

		}

	}

}
