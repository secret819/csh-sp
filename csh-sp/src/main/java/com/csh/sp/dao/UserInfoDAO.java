package com.csh.sp.dao;

import java.util.List;

import com.csh.sp.vo.UserInfo;


public interface UserInfoDAO {

	public List<UserInfo> getUserInfoList();
	public UserInfo getUserInfo(Integer num);
	public int insertUserInfo(UserInfo ui);
	public int updateUserInfo(UserInfo ui);
	public int deleteUserInfo(Integer num);
}
