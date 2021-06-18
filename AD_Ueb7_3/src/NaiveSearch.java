import static java.util.concurrent.TimeUnit.*;

public class NaiveSearch {

	
	public static int naiveSearch(String text, int n, String pattern, int m) throws InterruptedException {
		int refresh = pattern.length();
		int compare = 0;
		System.out.println(text);
		int count = 0;
		for (int i = 0; i <= n - m; i++) {
			boolean match = true;
			for (int j = 0; j < m; j++) {
				if (text.charAt(i + j) != pattern.charAt(j)) {
					match = false;
					break;
					
				}
				

			}

			if (match) {
				count++;
				System.out.print(pattern);
				MILLISECONDS.sleep(100);
				compare = refresh;
			} else if (compare == 0) {
				System.out.print(".");
				MILLISECONDS.sleep(100);
			}
			if (compare > 0)
				compare--;
		}

		System.out.println();

		return count;
	}

}
