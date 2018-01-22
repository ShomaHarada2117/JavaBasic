/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player>playerList =new ArrayList<>();

		//内容を取得
		ArrayList<String>array  = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();

                // ↓文字列を分割してPlayerインスタンスに格納
                String[] str =line.split(",",0);

             Player player = new Player();
             player.setPosition(str[0]);
        	 player.setName(str[1]);
        	 player.setCountry(str[2]);
        	 player.setTeam(str[3]);

             playerList.add(player);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }
		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
        Collections.shuffle(playerList);
        for(Player playerInf : playerList) {
        	if(playerInf.getPosition().equals("GK")) {
        		for(int i =0; i >=1; i++) {
        			System.out.println(playerInf);
        		}
        	}
        }



	}
}
//リストの並びをランダムにする
// Collections.shuffle(n);
//先頭を取得
// String result = n.get(0);
