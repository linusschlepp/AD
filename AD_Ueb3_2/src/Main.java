
public class Main {

	public static void main(String[] args) {

		int[] a = { -5, 13, -32, 7, -3, 17, 23, 12, -35, 19 };
		System.out.println("Bubblesort: ");
		BubbleSort bubblesort = new BubbleSort(a);
		
		int[] b = { -5, 13, -32, 7, -3, 17, 23, 12, -35, 19 };
		System.out.println("Insertionsort: ");
		InsertionSort insertionsort = new InsertionSort(b);
		
		int[] c = { -5, 13, -32, 7, -3, 17, 23, 12, -35, 19 };
		System.out.println("Selectionsort: ");
		SelectionSort selectionsort = new SelectionSort(c);

	}

}
