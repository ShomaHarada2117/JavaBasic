package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */
		for(int a =1; a <=50; a++) {

			switch(a) {
			case 6:
			case 11:
			case 12:
			case 16:
			case 17:
			case 18:
			case 21:
			case 22:
			case 23:
			case 24:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 36:
			case 37:
			case 38:
			case 41:
			case 42:
			case 46:
			System.out.print("■");
			break;

			default:
				System.out.print("□");
			}
				if(a %5 ==0) {
					System.out.println();
				}
		}
	}
}

