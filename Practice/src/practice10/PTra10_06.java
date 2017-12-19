package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car[] cars =new Car[3];

		Car car1 =new Car();
		car1.serialNo =15000;
		car1.color ="Green";
		car1.gasoline =2000;

		Car car2 =new Car();
		car2.serialNo =2500;
		car2.color ="Black";
		car2.gasoline =50;

		Car car3 =new Car();
		car3.serialNo =300;
		car3.color ="Pink";
		car3.gasoline =35;

		cars[0] =car1;
		cars[1] =car2;
		cars[2] =car3;

		final int distance = 300;



		for(int i =0; i<cars.length; i++) {
			int total =0;
			int count =0;

			while(true) {

				total +=cars[i].run();

				count ++;
				if(total >=distance) {
					System.out.println("目的地にまで" +count +"時間かかりました。");
				    System.out.println("残りのガソリンは、" +cars[i].gasoline +"リットルです");
				    break;
				}

				if(cars[i].gasoline ==0) {
					System.out.println("目的地に到達できませんでした");
					break;
				}

			}
		}

	}
}
