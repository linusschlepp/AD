
public class Selectionsort extends Algorithm {

	Selectionsort(int[] a) {
		super(a);

	}

	@Override
	public void solve() {

		int temp = 0;
		int min = 0;
		printArray(a, counter++);

		for (int i = 0; i < a.length; i++) {

			
			// min nimmt immer jetzigen Index-Wert an 
			min = i;

			for (int j = i; j < a.length; j++) {

				
				//Wenn sich einer kleiner Wert findet, nimmt min einen neuen Wert an 
				if (a[j] < a[min]) {
					min = j;
				}
			}
			/*
			 * 
			 *  
			 * Es wird immer getauscht, dies spielt aber nur eine Rolle, 
			 * wenn davor im if-Statement j und min getauscht wurden
			 * 
			 */
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
			printArray(a, counter++);

		}

	}

}
