/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {
	/** 受講生ID */
	public int studentId;

	/** 受講生氏名 */
	public String studentName;

	/** 会社名 */
	public String companyName;

	/** 教室名 */
	public String className;

	/** メールアドレス */
	public String mail;

	/** パスワード */
	public String password;

	int getStudentId() {
		return this.studentId;
	}

	void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	 String getStudentName() {
		return this.studentName;
	}

	void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	String getCompanyName() {
		return this.companyName;
	}

	void CsetompanyName(String companyName) {
		this.companyName = companyName;
	}

	String getMail() {
		return this.mail;
	}

	void setMail(String mail) {
		this.mail = mail;
	}

	String getPassword() {
		return this.password;
	}

	void setPassword(String password) {
		this.password = password;
	}


}
