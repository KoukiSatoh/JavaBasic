package practice06;
/*
 * PTra06_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_06 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 */

		int i,j,k;

		for(i = 0; i <= 5-1; i++){
			for(j = 0; j < i; j++){
	                System.out.print("■");
	            }
	            for(k = 0; k < 5-i ; k++){
	                System.out.print("□");
	            }
	            System.out.println("");
	        }
	    }
}
