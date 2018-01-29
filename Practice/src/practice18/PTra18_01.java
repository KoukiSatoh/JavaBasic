/*
 * PTra18_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PTra18_01 {
	public static void main(String[] args) {

	    // file/BestElevenCandidate.csv に記述された文字列を1行毎に line に代入します。
        ArrayList<String> array = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {//scannerにデータがあるか確認する*
                String line = scanner.nextLine();//scannerをlineに代入する*
                // ★ 1行ごとにArrayListに格納してください
                array.add(line);//arrayにlineのデータを追加
                
                /*while文でscanner.hasNext()からarray.add(line)までを"file/BestElevenCandidate.csv"が、
                 * 全てArrayListに格納されるまで繰り返している。
                 */
            }
        } catch (FileNotFoundException e) {//fileが見つからない
            System.out.println("ファイルが見つかりません");
        }

		// ★ ArrayListに格納された値を全て表示してください
		// ※ できれば拡張for文を使いましょう

        for(String file : array) {
     	   System.out.println(file);
        }

	}
}


