/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Employee;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = {"山田", "佐藤", "小林"};

	/** メールデータ（定数） */
	public static final String[] MAILDATA = {"yamada@hoge.com","satou@hoge.com","kobayashi@hoge.com"};

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = {"rezo0001","rezo0002","rezo0003"};

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
														{"総務部","業務部","システム部"},
														{"5","10","35"},
													};

	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください


		Employee[] employee =  new Employee[NAMEDATA.length];
				for(int i = 0;i<NAMEDATA.length;i++) {
					employee[i] = new Employee();
					employee[i].setUserNm(NAMEDATA[i]);
					employee[i].setMail(MAILDATA[i]);
					employee[i].setPassword(PASSDATA[i]);
					employee[i].setDepartmentNm(QUATERDATA[0][i]);
					employee[i].setDepartmentCnt(Integer.parseInt(QUATERDATA[1][i]));
				}

				for (Employee employees : employee) {
					System.out.println("名前："+employees.getUserNm());
					System.out.println("メール："+employees.getMail());
					System.out.println("PW："+employees.getPassword());
					System.out.println("部署："+employees.getDepartmentNm());
					System.out.println("部署人数："+employees.getDepartmentCnt());
					System.out.println();
}


















				//		Employee employee2 = new Employee();
//		Employee employee3 = new Employee();
//
//
//
//		employee2.setUserNm(NAMEDATA[1]);
//		employee2.setMail(MAILDATA[1]);
//		employee2.setPassword(PASSDATA[1]);
//		employee2.setDepartmentNm(QUATERDATA[0][1]);
//		employee2.setDepartmentCnt(Integer.parseInt(QUATERDATA[1][1]));
//
//
//		employee3.setUserNm(NAMEDATA[2]);
//		employee3.setMail(MAILDATA[2]);
//		employee3.setPassword(PASSDATA[2]);
//		employee3.setDepartmentNm(QUATERDATA[0][2]);
//		employee3.setDepartmentCnt(Integer.parseInt(QUATERDATA[1][2]));
//
//		System.out.println(employee.getUserNm());
//		System.out.println(employee.getMail());
//		System.out.println(employee.getPassword());
//		System.out.println(employee.getDepartmentNm());
//		System.out.println(employee.getDepartmentCnt());
//
////		System.out.println(employee2.getUserNm());
////		System.out.println(employee2.getMail());
//		System.out.println(employee2.getPassword());
//		System.out.println(employee2.getDepartmentNm());
//		System.out.println(employee2.getDepartmentCnt());
//
//		System.out.println(employee3.getUserNm());
//		System.out.println(employee3.getMail());
//		System.out.println(employee3.getPassword());
//		System.out.println(employee3.getDepartmentNm());
//		System.out.println(employee3.getDepartmentCnt());

	}
}
