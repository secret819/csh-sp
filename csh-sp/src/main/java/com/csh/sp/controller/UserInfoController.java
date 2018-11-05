package com.csh.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.csh.sp.service.UserInfoService;
import com.csh.sp.vo.UserInfo;

@Controller
public class UserInfoController {

	@Autowired
	private UserInfoService uis;	
	
	@GetMapping(value="/users")
	public @ResponseBody List<UserInfo> getUserInfoList(){
		return uis.getUserInfoList();
	}
	
	@GetMapping(value="/users/{uinum}")
	public @ResponseBody UserInfo getExam(@PathVariable Integer num) {
		return uis.getUserInfo(num);
	}
	
	@PostMapping(value="/users/{uinum}")
	public @ResponseBody int insertUserInfo(@RequestBody UserInfo ui) {
		return uis.insertUserInfo(ui);
	}
	
	@PutMapping(value="/users/{uinum}")
	public @ResponseBody int updateExam(@RequestBody UserInfo ui) {
		return uis.updateUserInfo(ui);
	}  
	
	@DeleteMapping(value="/users/{uinum}")
	public @ResponseBody int deleteExam(@PathVariable Integer num) {
		return uis.deleteUserInfo(num);
	}
}
