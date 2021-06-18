package mypackage;
import static java.util.concurrent.TimeUnit.*;



public class BoyerMoore {

	
	public static int boyerMooreSearch(String text, int n, String pattern, int m) throws InterruptedException {
		int i, j, sizeOfAlphabet = 28;
		int[] shift = new int[sizeOfAlphabet];
		System.out.println(text);
		for (i = 0; i < sizeOfAlphabet; i++)
			shift[i] = m;
		for (i = 0; i < m; i++)
			shift[getIndex(pattern.charAt(i))] = m - i - 1;

		int count = 0;
		j = i = m - 1;

		while (i < n) {
			if (text.charAt(i) == pattern.charAt(j)) {
				if (j == 0) {
					count++;
					i += m;
					j = m - 1;
				} else {
					i--;
					j--;
					
				}
				System.out.print(pattern.charAt(j));
				MILLISECONDS.sleep(100);
			} else {
				if (m - j > shift[getIndex(text.charAt(i))]) {
					i = i + m - j;
				} else {
					i = i + shift[getIndex(text.charAt(i))];
				}
				j = m - 1;
				System.out.print(".");
				MILLISECONDS.sleep(100);
			}
		}
		return count;

	}

	private static int getIndex(char a) {
		if (a == ' ')
			return 26;
		if (a == ',')
			return 27;

		return ((int) a - 65);

	}

}