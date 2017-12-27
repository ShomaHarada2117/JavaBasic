/*
 * PTra14_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice14.ptra14;

import practice14.common.Course;

public class PTra14_01 {

	/*
	 * ★ common.Courseを実装した、JavaCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】Java」
	 * 単元
	 * 		式と演算
	 * 		制御構文
	 * 		メソッド
	 * 		配列
	 * 		オブジェクト指向
	 * 		継承
	 * 		高度な継承
	 */
	public class JavaCourse implements Course{

		public String getCourseName() {
			return PREFIX + "Java";
		}

		public String[] getCourseUnit() {
			String[] unitList = {"式と演算","制御構文","メソッド","配列","オブジェクト指向","継承","高度な継承"};
			return unitList;
		}
	


//		String courseName;
//		String[] courseUnit;
//
//		public String getCourseName() {
//			return courseName;
//		}
//		public void setCourseName(String courseName) {
//			this.courseName = courseName;
//		}
//		public String[] getCourseUnit() {
//			return courseUnit;
//		}
//		public void setCourseUnit(String[] courseUnit) {
//			this.courseUnit = courseUnit;
//		}
	}

}
