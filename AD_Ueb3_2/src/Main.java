
public class Main {

	public static void main(String[] args) {

		int[] a = { -5, 13, -32, 7, -3, 17, 23, 12, -35, 19 };
		System.out.println("Bubblesort: ");
		Bubblesort bubblesort = new Bubblesort(a);
		
		int[] b = { -5, 13, -32, 7, -3, 17, 23, 12, -35, 19 };
		System.out.println("Insertionsort: ");
		Insertionsort insertionsort = new Insertionsort(b);
		
		int[] c = { -5, 13, -32, 7, -3, 17, 23, 12, -35, 19 };
		System.out.println("Selectionsort: ");
		Selectionsort selectionsort = new Selectionsort(c);

	}

}
