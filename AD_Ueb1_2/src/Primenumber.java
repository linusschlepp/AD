import java.util.*;

public class Primenumber {

	int k;
	int counter = 0;

	Primenumber(int k) {
		this.k = k;
		solve(k);
	}

	void solve(int k) {

		boolean bool = true;
		List<Integer> primeNumbers = findPrimenumbers(10);
		for (int i = 2; i < k; i++) {
				for (int j = 0; j < primeNumbers.size(); j++) {
				if (i == primeNumbers.get(j)) {
					continue;
				}

				else if (i % primeNumbers.get(j) == 0) {
					bool = false;
					break;
				}
			}
			if (bool) {
				if (counter < 10) {
					System.out.print(i + " ");
					counter++;
				} else {
					System.out.println();
					counter = 0;
				}

			}
			bool = true;
		}
	}
	List<Integer> findPrimenumbers(int k) {
		List<Integer> ListPrime = new ArrayList<>();
		boolean bool = true;
		int temp = 2;
		while (temp <= k) {
			for (int i = 2; i < temp; i++) {
				if (temp % i == 0) {
					bool = false;
					break;
				}
			}
			if (bool) {

				ListPrime.add(temp);
			}
			temp++;
			bool = true;
		}
		return ListPrime;
	}
}
