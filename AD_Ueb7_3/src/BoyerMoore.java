
public class BoyerMoore {

	public static int boyerMooreSearch(String text, int n, String pattern, int m) {
		int i, j, sizeOfAlphabet = 28;
		int[] shift = new int[sizeOfAlphabet];

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
			} else {
				if (m - j > shift[getIndex(text.charAt(i))]) {
					i = i + m - j;
				} else {
					i = i + shift[getIndex(text.charAt(i))];
				}
				j = m - 1;
			}
		}
		return count;

	}

	private static int getIndex(char a) {
		if (a == ' ')
			return 26;
		if (a == ',')
			return 27;

		return ((int)a - 65);

	}

}