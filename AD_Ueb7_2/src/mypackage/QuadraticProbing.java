package mypackage;

import java.util.Arrays;
import static java.lang.Math.*;

public class QuadraticProbing {

	public static void insertQuadratic(int[] values, int mod) {

		int[] hashTable = new int[mod];
		int temp = 0;
		int c1 = 1;
		int c2 = 3;
		int increment = 0;
		boolean flag = true;

		for (int i = 0; i < values.length; i++) {
			temp = values[i] % mod;
			for (int j = temp; i < values.length && flag; j++) {
				if (hashTable[j] == 0) {
					hashTable[j] = values[i];
					break;
				} else {
					while (flag) {
						int tempIndex = (int) ((values[i] + c1*increment + c2* pow(increment, 2)) % mod);
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
	
//	public static void insertQuadratic(int[] values, int mod) {
//
//		int[] hash = new int[mod];
//		int temp = 0;
//		int countQuad1 = 1;
//		int countQuad2 = 3;
//		boolean flag = true;
//
//		for (int i = 0; i < values.length; i++) {
//			temp = values[i] % mod;
//			for (int j = temp; i < values.length && flag; j++) {
//				if (hash[j] == 0) {
//					hash[j] = values[i];
//					break;
//				} else if (hash[j] != 0) {
//					while (flag) {
//						int tempIndex = (int) ((values[i] + countQuad1 + pow(countQuad2, 2)) % mod);
//						if (hash[tempIndex] == 0) {
//							hash[tempIndex] = values[i];
//							flag = false;
//						}
//						countQuad2++;	
//					}
//				}
//			}
//			countQuad2 = 3;
//			flag = true;
//		}
//		System.out.println(Arrays.toString(hash));
//	}
//
//}



/*
public static void insertQuadratic(int[] values, int mod) {

	int[] hash = new int[mod];
	int temp = 0;
	int countQuad = 1;
	boolean flag = true;

	for (int i = 0; i < values.length; i++) {
		temp = values[i] % mod;
		for (int j = temp; i < values.length && flag; j++) {
			if (hash[j] == 0) {
				hash[j] = values[i];
				break;
			} else if (hash[j] != 0) {
				while (flag) {
					int tempIndex = (int) ((values[i]  + pow(countQuad, 2)) % mod);
					if (hash[tempIndex] == 0) {
						hash[tempIndex] = values[i];
						flag = false;
					}
					countQuad++;	
				}
			}
		}
		countQuad = 1;
		flag = true;
	}
	System.out.println(Arrays.toString(hash));
}

}
*/

