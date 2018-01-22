/*
  * PTra15_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice15.ptra15;


import practice15.common.Java2Month;
import practice15.common.Room;

public class PTra15_02 {
	public static void main(String[] args) {

		Room room = new Java2Month();//Java2Monthのインスタンスを作成


		// roomに格納されたJava2MonthインスタンスのgetCurriculumメソッドを呼び出してください
		Java2Month j2m = (Java2Month)room;//roomをJava2MonthでキャストしてgetCurriculumメソッドを呼び出せるようにした


		// 取得したカリキュラム情報を全て出力してください

		String[] curriculumList = j2m.getCurriculum(); //String型の配列Java2に.getCurriculumを代入？

		for(String curriculum :curriculumList) {
			System.out.println(curriculum);
		}

//わからんので、一旦後回しで先に進む。

	}
}