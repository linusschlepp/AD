package mypackage;

import java.util.Arrays;

public class LinearProbing {

	public static void insertLinear(int[] values, int mod) {

		int[] hashTable = new int[mod];
		int temp = 0;

		for (int i = 0; i < values.length; i++) {
			temp = values[i] % mod;
			for (int j = temp; i < values.length; j++) {

				if (hashTable[j] == 0) {
					hashTable[j] = values[i];
					break;
				}

			}

		}
		System.out.println(Arrays.toString(hashTable));
	}
}
