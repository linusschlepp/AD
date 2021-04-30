
public class CountSortAdvanced {

	static void countSortAdvanced(int a[], int n, int k) {
		int i, j = 1;
		
		int[] bin = new int[k + 1];

		for (i = 0; i < n; i++)
			
		

		for (i = 0; i < n; i++) {
			while (bin[j] == 0)
				j++;
			a[i] = j;
			bin[j]--;
		}
		bin = null;
	}

}
