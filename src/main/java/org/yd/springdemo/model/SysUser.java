package org.yd.springdemo.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

public class SysUser implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3151859504222132723L;

	private Long id;//用户id
	
	private String userName;// '用户名'
	
	private String userPassword;// '用户密码'
	
	private String userEmail;// '用户邮箱'
	
	private String userInfo;// '简介'
	
	private byte[] headImg;// '头像'
	
	private Date createTime;// '创建时间'
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}
	public byte[] getHeadImg() {
		return headImg;
	}
	public void setHeadImg(byte[] headImg) {
		this.headImg = headImg;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "SysUser [id=" + id + ", userName=" + userName + ", userPassword=" + userPassword + ", userEmail="
				+ userEmail + ", userInfo=" + userInfo + ", headImg=" + Arrays.toString(headImg) + ", createTime="
				+ createTime + "]";
	}
	

}
