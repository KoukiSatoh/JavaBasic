package practice10;
/*
 * PTra10_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_01 {

	/*
	 * ★ 以下の仕様のクラスを作成してください（新しくJavaファイルを作成してください）
	 *
	 * クラス名
	 * 		User
	 * フィールド
	 * 		userId		:	int型
	 * 		userNm		：	String型
	 * 		mail		：	String型
	 * 		password	:	String型
	 * メソッド
	 * 		なし
	 */

	public static void main(String[] args) {

		// Userクラスを作成後に着手してください
		// ★ User型の変数usを宣言してください
		// ★ 変数usに、Userクラスのインスタンスを作成・代入してください
		User us = new User();

		// ★ 変数usに格納されているインスタンスの、フィールドuserId, userNm, mail, passwordを出力してください
		us.userId = 123;
		System.out.println(us.userId);

		us.userNm = "リゾーム太郎";
		System.out.println(us.userNm);

		us.mail = "rhizome@hoge.com";
		System.out.println(us.mail);

		us.password = "1qazxcv";
		System.out.println(us.password );

	}
}
