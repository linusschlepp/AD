
public class CountSort {

	
	static void countSort(int a[], int n , int k)
	{
		int i, j=1; 
		int[] bin = new int[k+1];
		
		
		for(i= 1; i<=k; i++)
			bin[i] = 0;
		for(i = 0; i<n; i++)
			bin[i]++;
		for(i= 0; i < n; i++)
		{
			while(bin[j]== 0)
				j++;
			a[i]=j;
			bin[j]--;
		}
		bin = null;
	}
	
	
}
