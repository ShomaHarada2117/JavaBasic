package practice06;
/*
 * PTra06_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_02 {
	public static void main(String[] args) {

		// ★ 20回繰り返しを行うfor文を記述してください
		//-----for start
		for(int a =1; a<=20; a++) {
			// ★ 今何回目の処理なのかを出力してください
			System.out.print(a);

			// ★ 奇数回のときには、「奇数」を出力してください
			if (!(a %2 ==0)) {
				System.out.print(" " +"奇数");
			}
			System.out.println("");
		}

		//-----for end
	}
}
