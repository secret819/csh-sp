package com.csh.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csh.sp.dao.UserInfoDAO;
import com.csh.sp.service.UserInfoService;
import com.csh.sp.vo.UserInfo;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoDAO uidao;
	
	@Override
	public List<UserInfo> getUserInfoList() {
		return uidao.getUserInfoList();
	}

	@Override
	public UserInfo getUserInfo(Integer num) {
		return uidao.getUserInfo(num);
	}

	@Override
	public int insertUserInfo(UserInfo ui) {
		return uidao.insertUserInfo(ui);
	}

	@Override
	public int updateUserInfo(UserInfo ui) {
		return uidao.updateUserInfo(ui);
	}

	@Override
	public int deleteUserInfo(Integer num) {
		return uidao.deleteUserInfo(num);
	}

}
