package com.csh.sp.vo;

public class UserInfo {
	
	private Integer uinum;
	private String uiid;
	private String uipwd;
	private String uiname;
	private String uiemail;
	public Integer getUinum() {
		return uinum;
	}
	public void setUinum(Integer uinum) {
		this.uinum = uinum;
	}
	public String getUiid() {
		return uiid;
	}
	public void setUiid(String uiid) {
		this.uiid = uiid;
	}
	public String getUipwd() {
		return uipwd;
	}
	public void setUipwd(String uipwd) {
		this.uipwd = uipwd;
	}
	public String getUiname() {
		return uiname;
	}
	public void setUiname(String uiname) {
		this.uiname = uiname;
	}
	public String getUiemail() {
		return uiemail;
	}
	public void setUiemail(String uiemail) {
		this.uiemail = uiemail;
	}
	@Override
	public String toString() {
		return "UserInfo [uinum=" + uinum + ", uiid=" + uiid + ", uipwd=" + uipwd + ", uiname=" + uiname + ", uiemail="
				+ uiemail + "]";
	}
	
	
}
