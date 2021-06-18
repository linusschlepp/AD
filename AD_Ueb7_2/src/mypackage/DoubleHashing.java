package mypackage;
import java.util.Arrays;

public class DoubleHashing {

	public static void insertDouble(int[] values, int mod) {

		int[] hashTable = new int[mod];
		int temp = 0;
		int increment = 0;
		boolean flag = true;

		for (int i = 0; i < values.length; i++) {
			temp = values[i] % mod;
			for (int j = temp; i < values.length && flag; j++) {
				if (hashTable[j] == 0) {
					hashTable[j] = values[i];
					break;
				} else  {
					while (flag) {
						int tempIndex = (temp + increment*(1+(values[i]%(mod-1))))%mod;
						if (hashTable[tempIndex] == 0) {
							hashTable[tempIndex] = values[i];
							flag = false;
						}
						increment++;
					}
				}
			}
			increment = 0;
			flag = true;
		}
		System.out.println(Arrays.toString(hashTable));
	}

}
