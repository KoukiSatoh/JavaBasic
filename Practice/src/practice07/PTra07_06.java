package practice07;
/*
 * PTra07_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_06 {
	public static void main(String[] args) {

		// ★ ※2次元配列を用いています
		int[][] array = {
				{500,40,6},
				{70,8,90,1000}
		};


		int sum = 0;
		int count = 0;
		for (int[] list : array) {

			for (int i : list) {
				sum += i;
				count++;
			}

		}

		System.out.println(sum / count);


	}
}
