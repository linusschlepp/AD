
public class CountSort {

	static int counter = 0;
	
	static void countSort(int a[], int n, int k) {
		int i, j = 1;
		int[] bin = new int[k + 1];
		/**
		 * (Schleife welche alle Werte im Array mit 0 besetzt ist in Java redundant)
		 * Laufzeit von 2k+4n entsteht durch, k = die for-SChleife �ber k und die
		 * while-Schleife = 2k n = die 4 Operationen innerhalb der n-Schleifen = 4n
		 */
		for (i = 0; i < n; i++) {
			/**
			 * Schleife z�hlt H�ufigkeit der Elemente, a[i] ist immer Zahl aus Wertebereich,
			 * wenn diese im Array �fter vorkommt wird der Index (entsprechend der Zahl im
			 * Wertebereich um eins erh�ht) im bin-Array immer um 1 inkrementiert
			 **/
			
			bin[a[i]]++;
			setCounter(1);
		}
		// for-Schleife iteriert durch komplettes Array
		for (i = 0; i < n; i++) {
			/**
			 * while-Schleife �berpr�ft, ob wert im bin-Array
			 * 0 ist d.h. vorhanden ist, wenn ja
			 * wird der n�chste Wert �berpr�ft. Wenn nein, 
			 * wird dieser Schritt �bersprungen! (While-Schleife sucht den 
			 * ersten Wert im bin-Array (ent�lt alle Werte von 0 bis k). 
			 * Dementsprechend, ist der erste auftretende Wert auch der 
			 * kleinte undso weiter)
			 * 
			 */
			while (bin[j] == 0)
			{
				j++;
				setCounter(1);
			}
			/**
			 * Wert wird an die richtige Stelle im Array gesetzt,
			 * bin[j] wird um eine Stelle dekrementiert (H�ufigkeit wird 
			 * eins runtergedreht
			 */
			a[i] = j;
			bin[j]--;
			setCounter(1);
		}
		bin = null;
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
