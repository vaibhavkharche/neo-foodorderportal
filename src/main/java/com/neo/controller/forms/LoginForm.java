package com.neo.controller.forms;

public class LoginForm {

	private String error;
	private String userName;
	private String password;
	private String curretTokenNo;

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCurretTokenNo() {
		return curretTokenNo;
	}

	public void setCurretTokenNo(String curretTokenNo) {
		this.curretTokenNo = curretTokenNo;
	}

}
