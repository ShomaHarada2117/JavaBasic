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

		// ★ 配列arrayに格納されている全ての数字の平均を出力してください
		for(int i =0; i <array.length; i++ ) {
			int point =0;
			int ave =0;
			for(int j =0; j <array[i].length; j++) {
				point+=array[i][j];
				ave =point /array[i].length;
			}
			System.out.println(ave);
		}
	}
}
