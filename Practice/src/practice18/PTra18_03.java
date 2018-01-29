/*
 * PTra18_03.java
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

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> roster = new ArrayList<Player>();
		try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))){
			while(scanner.hasNext()) {
				String line = scanner.nextLine();
				Player player = new Player();
				String[] lineAry = line.split(",",0);
				player.setPosition(lineAry[0]);
				player.setName(lineAry[1]);
				player.setCountry(lineAry[2]);
				player.setTeam(lineAry[3]);

				roster.add(player);


			}
		} catch (FileNotFoundException e) {//fileが見つからない
            System.out.println("ファイルが見つかりません");
        }


		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
		for(int i = roster.size()-1; i >= 0; i--) {
			if(roster.get(i).getTeam().equals("レアル・マドリード")||roster.get(i).getTeam().equals("バルセロナ")) {
			   roster.remove(i);
			}
		}




		// ★ 削除後のArrayListの中身を全件出力してください
		for(int i = 0; i <roster.size(); i++) {
			System.out.println(roster.get(i).toString());
		}




	}
}

//リムーブで調べてみる