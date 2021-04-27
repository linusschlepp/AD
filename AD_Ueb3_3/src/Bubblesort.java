
public class Bubblesort extends Algorithm {

	Bubblesort(int[]a)
	{
		super(a);
	}

	@Override
	public void solve() {

		int temp = 0;
		printArray(a, counter++);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {

				if (a[j] > a[j + 1]) {
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					
					
				}
				

			}
			printArray(a, counter++);

		}

	}

	@Override
	public void solve(int[] a, int f, int l) {
		// TODO Auto-generated method stub
		
	}

}

