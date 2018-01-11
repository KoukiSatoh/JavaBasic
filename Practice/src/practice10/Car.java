package practice10;

import java.util.Random;

public class Car {
	int serialNo	;
	String color;
	int gasoline	;
	
	public int run() {
		Random rand = new Random();//ランダムな数値を生成する。
		int randomnumber = rand.nextInt(16);//生成した数値をrandomnumberに代入
	
		this.gasoline--; //gasoline＝gasoline - 1;と同じ
		if(gasoline < 0) {//ガソリンがゼロ以下、負の数になったら-１を返す
			return -1;
		}
		return randomnumber;
	}
}

