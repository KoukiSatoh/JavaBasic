package practice04;
/*
 * PTra04_05.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra04_05 {
	public static void main(String[] args) {
		// 入力型プログラムです。
		// 下記の命令は、入力型プログラムで必要な記述になります。
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		boolean winFlg = false;

		System.out.print("じゃんけんゲームを開始します。");

		// 変数winFlgがtrueだった場合にループが終わります
		while (!winFlg /* winFlg == falseと同じ意味 */) {

			System.out.println("あなたの手は？");
			System.out.println("0:グー、1：チョキ、2：パー");

			// コマンドプロンプトで入力した文字列が変数lineに代入されます
			String line = scanner.nextLine();

			// 文字列を数字に変換して、変数numに代入します
			// ※ コマンドプロンプトで入力された値が、数字ではなかった場合はプログラムがエラーになり、プログラムが終了します
			int myHand = Integer.parseInt(line);

			System.out.print("相手の手は・・・・・");
			System.out.println("");

			// 下記の命令を実行すると変数cpuHandに、0以上、変数3未満の数字がランダムで代入されます
			int cpuHand = new java.util.Random().nextInt(3);

			//---------------------ここから本題-----------------------
			/*
			 * 以下のプログラムでは、まだ未完成です。
			 * ★ 残りのプログラムを追記して、じゃんけんゲームを完成させてください
			 *
			 * ●じゃんけんに、勝った場合はプログラムを終了します
			 * ●あいこ、又は負けた場合は、勝つまでプログラムが終わりません
			 *
			 * ※ プログラムは何行書いても良いです
			 */



			if (cpuHand == 0) {
				System.out.println("グー！");
				
				//勝敗判定
				if(myHand == 0) {
					System.out.println("あいこ");
				}else if(myHand == 1) {
						System.out.println("負け");
				}else {
					System.out.println("勝ち");
			    winFlg = true;
				}
				System.out.println("");


			} else if (cpuHand == 1) {
				System.out.println("チョキ！！");
				
				//勝敗判定
				if(myHand == 0) {
					System.out.println("勝ち");
					winFlg = true;
				}else if(myHand == 1) {
						System.out.println("あいこ");
				}else
					System.out.println("負け");

				System.out.println("");

			} else {
				System.out.println("パー！！");
				
				//勝敗判定
				if(myHand == 0) {
					System.out.println("負け");
				}else if(myHand == 1) {
						System.out.println("勝ち");
						winFlg = true;
				}else
					System.out.println("あいこ");
				System.out.println("");

			}
		}

	}
}
