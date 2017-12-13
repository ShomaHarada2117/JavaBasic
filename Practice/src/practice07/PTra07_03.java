package practice07;
/*
 * PTra07_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_03 {
	public static void main(String[] args) {

		// ★ char型の配列keywordを定義し 「'平', '島', '沼', '山', '森'」 で初期化してください
		String a ="平島沼山森";
		char[] kyeword =a.toCharArray();


		// ★ 配列keywordに格納されている値を後ろから順番に全て表示してください
		for(int i =kyeword.length -1; i >=0; i--){
			//配列を後ろから表示する方法
			//kyeword.length(i)を0以上(0まで)マイナスしていく
			//lengthは1からカウント(配列の要素数とずれるから)だから、-1しておく
			System.out.println(kyeword[i]);
		}
	}
}