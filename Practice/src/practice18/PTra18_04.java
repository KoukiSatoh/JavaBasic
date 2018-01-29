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

import entity.Player;

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

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		Collections.shuffle(roster);

		ArrayList<Player> GKlist = new ArrayList<Player>();
		ArrayList<Player> DFlist = new ArrayList<Player>();
		ArrayList<Player> MFlist = new ArrayList<Player>();
		ArrayList<Player> FWlist = new ArrayList<Player>();

		for(Player prayer : roster ) {
			if(prayer.getPosition().equals("GK")) {
				if(GKlist.size() < 1) {
					GKlist.add(prayer);
				}
			}

			if(prayer.getPosition().equals("MF")) {
				if(MFlist.size() < 4) {
					MFlist.add(prayer);
				}
			}

			if(prayer.getPosition().equals("DF")) {
				if(DFlist.size() < 4) {
					DFlist.add(prayer);
				}
			}

			if(prayer.getPosition().equals("FW")) {
				if(FWlist.size() < 2) {
					FWlist.add(prayer);
				}
			}
		}

		 for(Player player : GKlist) {
	     	   System.out.println(player.toString());
	        }

		 for(Player player : MFlist) {
	     	   System.out.println(player.toString());
	        }

		 for(Player player : DFlist) {
	     	   System.out.println(player.toString());
	        }

		 for(Player player : FWlist) {
	     	   System.out.println(player.toString());
	        }





	}
}


//シャッフルを使う

