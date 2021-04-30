import java.util.*;


public class Main {
	
	static Random ran = new Random();

	public static void main(String[] args) {
		int k = 15;
		int a[] = getRanArray(k);
	//	MapSort.mapSort(a, k, 1.50);
		CountSort.countSort(a, a.length-2, a.length);
		Arrays.toString(a);
		
	}
	
	
	
	
	static int[] getRanArray(int k)
	{
		
		int[] ranArray = new int[k];
		
		for(int i = 0; i < k; i++)
		{
			ranArray[i] = getRanNumber(ran.nextInt(10000));
		}
		
		return ranArray; 
	}
	

	
		static int getRanNumber(int number)
		{
			
			while(true)
			{
				if(number >= 1000 )
				{
					return number;
				}
				else
				{
					number = ran.nextInt(10000);
				}
				
			}
			
		}
}
