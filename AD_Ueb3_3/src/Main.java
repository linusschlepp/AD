
public class Main {

	public static void main(String[] args) {
		
		
		int[] b = { -5, 13, -32, 7, -3, 17, 23, 12, -35, 19 };
		System.out.println("Insertionsort: ");
		long timestampInsertion = System.currentTimeMillis();
		InsertionSort insertionsort = new InsertionSort(b);
		System.out.println(System.currentTimeMillis()-timestampInsertion);
		int[] a = { -5, 13, -32, 7, -3, 17, 23, 12, -35, 19 };
		System.out.println("Bubblesort: ");
		long timestampBubble = System.currentTimeMillis();
		BubbleSort bubblesort = new BubbleSort(a);
		System.out.println(System.currentTimeMillis()-timestampBubble);

		int[] c = { -5, 13, -32, 7, -3, 17, 23, 12, -35, 19 };
		System.out.println("Selectionsort: ");
		long timestampSelection = System.currentTimeMillis();
		SelectionSort selectionsort = new SelectionSort(c);
		System.out.println(System.currentTimeMillis()-timestampSelection);
		
		int[] d = { -5, 13, -32, 7, -3, 17, 23, 12, -35, 19 };
		System.out.println("Qicksort");
		QuickSort quicksort = new QuickSort(d);
		
	}

}
