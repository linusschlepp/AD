import java.util.Arrays;

public class MapSort {

	static void mapSort(int a[], int n, double c)
	{
		int newn = (int) ((double)n*c), i, j=0;
		int[] bin = new int[newn]; 
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int temp = 0;
		
		
		
		for(i=0; i < n; i++)
		{
			if(a[i]<min)
				min = a[i];
			if(a[i]>max)
				max = a[i];
		}
			double dist = (double)(max-min)/(double)(newn-1);
			
			for(i=0; i<n; i++)
			{
				int t = (int) ((double) (a[i]-min)/dist), insert=a[i], left = 0;
				
				if(bin[t] != 0 && insert <= bin[t])
					left = 1;
				
				while(bin[t] != 0)
				{
					if(left == 1 )
					{
						if(insert > bin[t])
							
							temp = bin[t];
							bin[t] = insert;
							insert = temp;
							
						if(t>0)
							t--;
						else 
							left = 0;		
					}
					else
					{
						if(insert <= bin[t])
						temp = bin[t];
						bin[t] = insert;
						insert = temp;
						
						if(t<newn-1)
							t++;
						else
							left = 1;
						
							
					}
				}
				bin[t] = insert;
				
			}
			for(i = 0; i <newn; i++)
			
				if(bin[i] != 0)
					a[j++] = bin[i];

			
		bin = null;
			
		}
	}
	
	
	

