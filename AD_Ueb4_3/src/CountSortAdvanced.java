
public class CountSortAdvanced {

	static int counter = 0;
	
	static int[] countSortAdvanced(int a[], int n, int k) {
		int i, j = 1;

		int[] bin = new int[k + 1];
			int[] sortArray = new int[n];
			

		for (i = 0; i < n; i++) {
			bin[a[i]]++;
			setCounter(1);}
		
		for(i = 1; i<k; i++) {
			bin[i]+=bin[i-1];
			setCounter(1);}
		
		
		for (i = n-1; i >= 0; i--) {
		sortArray[--bin[a[i]]] = a[i];
		setCounter(1);}
		
		
		
			
		
		bin = null;
		return sortArray;
	}
	
	
	public static void setCounter(int increment)
	{
		counter += increment;
	}
	
	public static int getCounter()
	{
		return counter;
	}

}
