package com.csh.sp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.csh.sp.dao.UserInfoDAO;
import com.csh.sp.vo.UserInfo;

@Repository
public class UserInfoDAOImpl implements UserInfoDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<UserInfo> getUserInfoList() {
		return ss.selectList("com.csh.sp.USERINFO.selectUSERINFOList");
	}

	@Override
	public UserInfo getUserInfo(Integer num) {
		return ss.selectOne("com.csh.sp.USERINFO.selectUSERINFO",num);
	}

	@Override
	public int insertUserInfo(UserInfo ui) {
		return ss.insert("com.csh.sp.USERINFO.insertUSERINFO",ui);
	}

	@Override
	public int updateUserInfo(UserInfo ui) {
		return ss.update("com.csh.sp.USERINFO.updateUSERINFO",ui);
	}

	@Override
	public int deleteUserInfo(Integer num) {
		return ss.delete("com.csh.sp.USERINFO.deleteUSERINFO",num);
	}

}
