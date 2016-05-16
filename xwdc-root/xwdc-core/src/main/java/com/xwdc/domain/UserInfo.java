package com.xwdc.domain;

public class UserInfo {
	private String id;
	private String userName;
	private String userAge;
	private String userAdd;
	
	public UserInfo(String id, String userName, String userAge, String userAdd) {
		super();
		this.id = id;
		this.userName = userName;
		this.userAge = userAge;
		this.userAdd = userAdd;
	}
	
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAge() {
		return userAge;
	}
	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}
	public String getUserAdd() {
		return userAdd;
	}
	public void setUserAdd(String userAdd) {
		this.userAdd = userAdd;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", userName=" + userName + ", userAge="
				+ userAge + ", userAdd=" + userAdd + "]";
	}
		
}
