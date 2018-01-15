/*
 * PTra13_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Hero;
import practice13.common.Slime;

class PTra13_04{

	/*
	 * ★ PTra13_02, PTra13_03で作成した、Hero/Slimeクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ HeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者", "スライム"を設定してください
		Hero hero = new Hero();
		Slime slime = new Slime();
		//インスタンスを作成した
		hero.setName("勇者");
		slime.setName("スライム");
		//名前を設定した
		
		/*
		 * ★ HeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●Heroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */
		while(true) {//HPが０になったらtrueになる
			boolean isSlimedead = slime.damage(hero.attack());//Characterのdamageメソッドに飛ぶ。スライムがうけるダメージは勇者の攻撃力
			if(isSlimedead) { // スライムが死んだ場合、以下の内容を出力する
				System.out.println(hero.getName()+"は"+slime.getName()+"との戦闘に勝利した");
				break;
			}
			boolean isHeroedead = hero.damage(slime.attack());//Characterのdamageメソッドに飛ぶ
			if(isHeroedead) {//勇者が死んだ場合、以下の内容を出力する
				System.out.println(slime.getName()+"は"+hero.getName()+"との戦闘に勝利した");
				break;
			}
		}


		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」

	}
}
