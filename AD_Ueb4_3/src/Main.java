import java.util.*;

public class Main {

	static Random ran = new Random();

	public static void main(String[] args) {
		int k = 30;
		int a[] = getRanArray(100000);

		System.out.println(Arrays.toString(a));
		long timeStampBefore = System.currentTimeMillis();
		MapSort.mapSort(a, a.length - 1, 1.30);
		System.out.println(Arrays.toString(a) + "\n" + (System.currentTimeMillis() - timeStampBefore));
		System.out.println(MapSort.getCounter());
		// a= CountSortAdvanced.countSortAdvanced(a, a.length-1, 10000);
		// System.out.println(Arrays.toString(a));

	}

	static int[] getRanArray(int k) {

		int[] ranArray = new int[k];

		for (int i = 0; i < k; i++)
			ranArray[i] = getRanNumber(ran.nextInt(10000));

		return ranArray;
	}

	static int getRanNumber(int number) {

		while (true) {
			if (number >= 1000)
				return number;
			else
				number = ran.nextInt(10000);

		}

	}
}
