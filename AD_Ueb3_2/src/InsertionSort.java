
public class InsertionSort extends Algorithm {

	InsertionSort(int[] a) {
		super(a);

	}

	@Override
	public void solve() {

		int key = 0;
		int j = 0;
		printArray(a, counter++);
		for (int i = 1; i < a.length; i++) {

			//key nimmt derzeitigen Wert im Array an 
			key = a[i];
			
			//j ist Wert bevor key im Array
			j = i - 1;
			/**
			Schleife wird nur betreten, wenn j >= 0 um IndexOutOfBoundsException 
			zu vermeiden. Und wenn Wert vor key größer ist als a[j].
			Demenstsprechend werden alle Werte im Array um eins nach rechts verschoben
			
			 **/
			while (j >= 0 && a[j] > key) {

				a[j + 1] = a[j];
				j--;

			}

			
			/*
			Da die while-Schleife solange durchlaufen wird bis key
			der größte Wert im Array ist. Wird key an die größere 
			Stelle bzw. Index+1 im Array gesetzt. 
			 */
			a[j + 1] = key;
			printArray(a, counter++);

		}

	}

}
