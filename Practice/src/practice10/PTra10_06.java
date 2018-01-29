package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

import java.util.Scanner;

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Scanner scanner = new Scanner(System.in);
		Car[] cars = new Car[3];
		for (int i = 0; i < cars.length; i++) {
			System.out.println("------------------------------------");
			System.out.println((i + 1) + "台目");
			cars[i] = new Car();

			System.out.println("シリアル№、車体カラー、ガソリン量をカンマ区切りで入力してください");
			String line = scanner.nextLine();

			String[] inputInfo = line.split(",");

			cars[i].serialNo = Integer.parseInt(inputInfo[0]);
			cars[i].color = inputInfo[1];
			cars[i].gasoline = Integer.parseInt(inputInfo[2]);
		}

		// それぞれの車を走らせる。
		final int distance = 200;
		int[] count = new int[cars.length];

		for (int i = 0; i < cars.length; i++) {
			int move = 0;
			while (distance - move > 0) {
				int ret = cars[i].run();
				if (ret == -1) {
					count[i] = -1;
					break;
				}

				move += ret;
				count[i]++;
			}
		}

		// 出力
		for (int i = 0; i < count.length; i++) {
			if (count[i] == -1) {
				System.out.println((i + 1) + "台目は目的地に到達できませんでした");
			} else {
				System.out.println((i + 1) + "台目の車が掛かった時間：" + count[i] + "時間");
			}
		}
	}
}

// クラス型配列が理想

/*惜しい！残量や時間は表示出来てるけど、入力処理を忘れている。見落としを無くそう
 *
 		Car car = new Car();
		Car car2 = new Car();
		Car car3 = new Car();

		car.serialNo = 1000;
		car.color = "Red";
		car.gasoline = 50;

		car2.serialNo = 2000;
		car2.color = "Blue";
		car2.gasoline = 75;

		car3.serialNo = 3000;
		car3.color = "Green";
		car3.gasoline = 100;

		final int distance = 500;



		Car[] cars = new Car[3];//Car型の変数が三つ入る配列carsを宣言、確保した。
		cars[0] = car;//０にはcarが入る
		cars[1] = car2;//１にはcar２が入る
		cars[2] = car3;//２にはcar３が入る

		for(int i=0;i<cars.length;i++){

			int Adistance = 0;//進んだ距離 Advanced distance
			int count = 0;//目的地までの時間
			while(true) {
				int randomnumber = cars[i].run();//randomnumberはメソッドrunで生成されたランダムな数値が代入される
				                   // car.run();からcars[i].run();に変えた
					count++; //カウントは１ずつ増えていく
					Adistance += randomnumber; //Adistance = Adistance + randomnumbr
				 						   //AdistanceはAdistanceにrandomnumbr(1~15の乱数)を足した値になる

					System.out.println(Adistance);//進んだ距離が増えているかチェック(Adistance= Advanced distance)


				if(randomnumber == -1) {//Carクラスのgasolineが０以下になるとrandomnumberが-1を返すためのはず
					System.out.println("目的地に到達できませんでした");
					break;//gasolineが０以下になると、if文を抜けて「目的地に到達出来なかった」と出力される
				}

				if(distance <  Adistance) {//distanceよりAdistanceが大きくなったら条件をみたす。
					System.out.println("目的地にまで"+count+"時間かかりました。残りのガソリンは、"+cars[i].gasoline+"リットルです");
																	                 //car.gasoline cars[i].gasolineに変えた
					break;//目的地についたら、if文を抜けて上の文を出力する動きをする
				}

			}
		}
*/
