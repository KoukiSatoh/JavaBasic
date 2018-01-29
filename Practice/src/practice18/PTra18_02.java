/*
 * PTra18_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Player;

public class PTra18_02 {

	/*
	 * ★ BestElevenCandidate.csvの情報を保持するためのクラス、entity.Playerクラスを作成してください
	 *
	 * フィールド
	 * 		position	：	String
	 * 		name		：	String
	 * 		country		：	String
	 * 		team		：	String
	 * メソッド
	 * 		各アクセサ
	 *
	 * 		toString()	：	Objectクラスのオーバーライド
	 * 		各フィールドの値を、カンマ区切りの文字列で取得する
	 */

	public static void main(String[] args)  {

		/*
		 * entity.Playerの作成後に行ってください
		 *
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

		ArrayList<Player> roster = new ArrayList<Player>();
		try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))){
			while(scanner.hasNext()) {
				String line = scanner.nextLine();
				Player player = new Player();//Playerインスタンスを作る
				String[] lineAry = line.split(",",0);//lineに入っているCSVデータを、カンマ区切りにする
				player.setPosition(lineAry[0]);//Positioをセットする。
				player.setName(lineAry[1]);//Nameをセットする。
				player.setCountry(lineAry[2]);//Countryをセットする
				player.setTeam(lineAry[3]);//Teamをセットする

				roster.add(player);//playerに格納された値を、rosterに追加する
                
				/*while文でscanner.hasNext()からroster.add(player)までを"file/BestElevenCandidate.csv"が、
                 * 全てArrayListに格納されるまで繰り返している。
                 */
			}
		} catch (FileNotFoundException e) {//fileが見つからない
            System.out.println("ファイルが見つかりません");
        }

		// ★ ArrayListに格納されているインスタンス全てのtoStringメソッドを実行し、出力してください
		// ※ できれば拡張for文を使いましょう

		for(Player prayer : roster ) {
			System.out.println(prayer.toString());
		}

	}
}
