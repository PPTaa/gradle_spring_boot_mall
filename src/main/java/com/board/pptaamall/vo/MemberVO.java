package com.board.pptaamall.vo;

import java.sql.Timestamp;

public class MemberVO {
	
/*	`regiDate`, 
	`userAddr1`, 
	`userAddr2`, 
	`userAddr3`, 
	`userId`, `userName`, `userPass`, `userPhon`, `verify`
	*/
	private String userId;
	private String userPass;
	private String userName;
	private String userPhon;
	private String userAdd1;
	private String userAdd2;
	private String userAdd3;
	private Timestamp regiDate;
	private int verify;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getuserPhon() {
		return userPhon;
	}
	public void setuserPhon(String userPhon) {
		this.userPhon = userPhon;
	}
	public String getUserAdd1() {
		return userAdd1;
	}
	public void setUserAdd1(String userAdd1) {
		this.userAdd1 = userAdd1;
	}
	public String getUserAdd2() {
		return userAdd2;
	}
	public void setUserAdd2(String userAdd2) {
		this.userAdd2 = userAdd2;
	}
	public String getUserAdd3() {
		return userAdd3;
	}
	public void setUserAdd3(String userAdd3) {
		this.userAdd3 = userAdd3;
	}
	public Timestamp getRegiDate() {
		return regiDate;
	}
	public void setRegiDate(Timestamp regiDate) {
		this.regiDate = regiDate;
	}
	public int getVerify() {
		return verify;
	}
	public void setVerify(int verify) {
		this.verify = verify;
	}
	
	
}
