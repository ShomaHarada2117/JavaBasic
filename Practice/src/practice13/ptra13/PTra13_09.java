/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;
import practice13.common.Employee;
public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = {"山田", "佐藤", "小林"};

	/** メールデータ（定数） */
	public static final String[] MAILDATA = {"yamada@hoge.com","satou@hoge.com","kobayashi@hoge.com"};

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = {"rezo0001","rezo0002","rezo0003"};

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
														{"総務部","業務部","システム部"},
														{"5","10","35"},
													};

	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください
		Employee[] employee =new Employee[3];
		for(int i =0; i <employee.length; i++) {
			employee[i] =new Employee();
		}
		for(int i=0; i <employee.length; i++) {
			for(int j=0; j <NAMEDATA.length; j++) {
				employee[i].setUserNm(NAMEDATA[j]);
			}
		}
		for(int i=0; i <employee.length; i++) {
			for(int j=0; j <MAILDATA.length; j++) {
				employee[i].setMail(MAILDATA[j]);
			}
		}
		for(int i=0; i <employee.length; i++) {
			for(int j=0; j <PASSDATA.length; j++) {
				employee[i].setPassword(PASSDATA[j]);
			}
		}
		for(int i=0; i <employee.length; i++) {
			for(int j=0; j <QUATERDATA[0].length; j++) {
				employee[i].setDepartmentNm(QUATERDATA[0][j]);
			}
		}
		for(int i=0; )//文字列を数字に変換
		for(int i=0; i <employee.length; i++) {
			for(int j=0; j <QUATERDATA[1].length; j++) {
				employee[i].setDepartmentCnt(QUATERDATA[1][j]);
			}
		}
	}

}
