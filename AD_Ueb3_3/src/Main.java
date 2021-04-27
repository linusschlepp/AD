
public class Main {

	public static void main(String[] args) {
		
		
		int[] b = { -5, 13, -32, 7, -3, 17, 23, 12, -35, 19 };
		System.out.println("Insertionsort: ");
		long timestampInsertion = System.currentTimeMillis();
		Insertionsort insertionsort = new Insertionsort(b);
		System.out.println(System.currentTimeMillis()-timestampInsertion);
		int[] a = { -5, 13, -32, 7, -3, 17, 23, 12, -35, 19 };
		System.out.println("Bubblesort: ");
		long timestampBubble = System.currentTimeMillis();
		Bubblesort bubblesort = new Bubblesort(a);
		System.out.println(System.currentTimeMillis()-timestampBubble);

		int[] c = { -5, 13, -32, 7, -3, 17, 23, 12, -35, 19 };
		System.out.println("Selectionsort: ");
		long timestampSelection = System.currentTimeMillis();
		Selectionsort selectionsort = new Selectionsort(c);
		System.out.println(System.currentTimeMillis()-timestampSelection);
		
		int[] d = { -5, 13, -32, 7, -3, 17, 23, 12, -35, 19 };
		System.out.println("Qicksort");
		Quicksort quicksort = new Quicksort(d);
		
	}

}
