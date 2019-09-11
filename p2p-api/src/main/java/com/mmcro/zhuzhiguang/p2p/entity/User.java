package com.mmcro.zhuzhiguang.p2p.entity;
//com.mmcro.zhuzhiguang.p2p

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;


public class User  implements Serializable {
	
	private Integer id;
	
	@Length(min=5)
	private String name;
	
	private String confirmPwd;
	
	public String getConfirmPwd() {
		return confirmPwd;
	}
	public void setConfirmPwd(String confirmPwd) {
		this.confirmPwd = confirmPwd;
	}
	private String password;
	
	private String mobile;
	
	private String recommderId;
	
	private Date registerDate;
	
	private String registerIp;
	
	private Date updateDate;
	
	private String updateIp;
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", mobile=" + mobile + ", recommderId="
				+ recommderId + ", registerDate=" + registerDate + ", registerIp=" + registerIp + ", updateDate="
				+ updateDate + ", updateIp=" + updateIp + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getRecommderId() {
		return recommderId;
	}
	public void setRecommderId(String recommderId) {
		this.recommderId = recommderId;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public String getRegisterIp() {
		return registerIp;
	}
	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getUpdateIp() {
		return updateIp;
	}
	public void setUpdateIp(String updateIp) {
		this.updateIp = updateIp;
	}
	
	
	


}
