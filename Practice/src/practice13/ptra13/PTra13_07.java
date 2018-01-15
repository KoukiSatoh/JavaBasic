/*
 * PTra13_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Item;
import practice13.common.Slime;
import practice13.common.SuperHero;

public class PTra13_07 {

	/*
	 * ★ common.Item, common.SuperHero, common.Slimeを使用します
	 */

	public static void main(String[] args) {

		// ★ SuperHeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者（装備あり）", "スライム"を設定してください
		SuperHero superHero = new SuperHero();
		Slime slime = new Slime();

		slime.setName("スライム");
		superHero.setName("勇者（装備あり）");
		// ★ Itemクラスのインスタンスを作成し、("こんぼう", 4）を¥にしてください
		Item item = new Item();
		item.setName("こんぼう");
		item.setAdditionalDamagee(4);
		// ★ 作成したItemインスタンスをSuperHeroに持たせてください
		superHero.setEquipment(item);

		/*
		 * ★ SuperHeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●SuperHeroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */

		while(true) {//HPが０になったらtrueになる
			boolean isSlimedead = slime.damage(superHero.attack());//Characterのdamageメソッドに飛ぶ。スライムがうけるダメージは勇者の攻撃力
			if(isSlimedead) { // スライムが死んだ場合、以下の内容を出力する
				System.out.println(superHero.getName()+"は"+slime.getName()+"との戦闘に勝利した");
				break;
			}
			boolean isSuperHerodead = superHero.damage(slime.attack());//Characterのdamageメソッドに飛ぶ
			if(isSuperHerodead) {//勇者が死んだ場合、以下の内容を出力する
				System.out.println(slime.getName()+"は"+superHero.getName()+"との戦闘に勝利した");
				break;
			}
		}


		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」

	}
}
