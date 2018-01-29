package practice10;
/*
 * PTra10_05.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_05 {

	/*
	 * 以下の仕様のクラスを作成してください（新しくJavaファイルを作成してください）
	 *
	 * クラス名
	 * 		Car
	 * フィールド
	 * 		serialNo		:	int型
	 * 		color			：	String型
	 * 		gasoline		：	int型
	 * メソッド
	 * 		戻り値(int)、メソッド名(run)、引数(なし)
	 * 			ガソリンを1消費して、ランダムな距離(1～15)進む（戻り値が進んだ距離）
	 * 			ガソリンが負の数になった場合（もう進めない）は-1を返します。
	 */

	public static void main(String[] args) {

		// Carクラスを作成後に着手してください
		// ★ Car型の変数carを宣言し、Carクラスのインスタンスを代入してください
		Car car = new Car();

		// ★ 変数carに格納されているインスタンスのserialNoフィールドに、10000を代入してください
		car.serialNo = 1000;
		// ★ 変数carに格納されているインスタンスのcolorフィールドに、"Red"を代入してください
		car.color = "Red";
		// ★ 変数carに格納されているインスタンスのgasolineフィールドに、50を代入してください
		car.gasoline = 50;

		// 目的地までの距離
		final int distance = 300;

		/*
		 * ★ 変数carに格納されているインスタンスメソッドrunを使って、目的地まで進んでください
		 * ★ 先にガソリンがなくなった場合は、「目的地に到達できませんでした」を出力してください
		 * ★ 目的地についた時点で「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください
		 * ※n：runメソッドを実行した回数, xは残りのガソリンの数です
		 */
		int Adistance = 0;//　進んだ距離
		int count = 0;//目的地までの時間
		while(true) {
			int randomnumber = car.run();//randomnumberはメソッドrunで生成されたランダムな数値が代入される
			count++; //カウントは１ずつ増えていく
			 Adistance += randomnumber; //Adistance = Adistance + randomnumbr
			 						   //AdistanceはAdistanceにrandomnumbr(1~15の乱数)を足した値になる
			 System.out.println(Adistance);//進んだ距離が増えているかチェック(Adistance= Advanced distance)

			if(randomnumber == -1) {//Carクラスのgasolineが０以下になるとrandomnumberが-1を返すためのはず
				System.out.println("目的地に到達できませんでした");
				break;//gasolineが０以下になると、if文を抜けて「目的地に到達出来なかった」と出力される
			}


			if(distance <  Adistance) {//distanceよりAdistanceが大きくなったら条件をみたす。
				System.out.println("目的地にまで"+count+"時間かかりました。残りのガソリンは、"+car.gasoline+"リットルです");
				break;//distance <  Adistanceは　目的地についたら、if文を抜けて上の文を出力する動きをする
			}
		}
	}
}


/* 見やすい表示にするときの参考に。内容自体は変わらない。
		int move = 0;
		int count = 0;
		while (distance - move > 0) {
			int ret = car.run();
			if (ret == -1) {
				break;
			}

			move += ret;
			count++;

			// 表示用
			int disp = (distance - move) < 0 ? 0 : distance - move;
			System.out.println((count) + "時間で" + ret + "km進みました。残り：" + disp + "km");
			System.out.println();
		}

		if (distance - move > 0) {
			System.out.println("目的地に到達できませんでした");
		} else {
			System.out.println("目的地にまで" + count + "時間かかりました。残りのガソリンは、" + car.gasolin + "リットルです");
		}
	}
}
*/
