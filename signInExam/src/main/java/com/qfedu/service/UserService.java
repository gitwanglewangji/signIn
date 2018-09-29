package com.qfedu.service;

import javax.servlet.http.HttpServletRequest;

import com.qfedu.pojo.User;

public interface UserService {

	//注册
	boolean RegistUser(User user);
	
	//登录
	boolean LoginUser(User user,HttpServletRequest rsq);
	
	User selectPass(User user);
	
	boolean updateUser(User user);
	
	boolean delete(Integer id);
}
