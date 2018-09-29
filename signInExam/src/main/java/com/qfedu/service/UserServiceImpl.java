package com.qfedu.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qfedu.dao.UserMapper;
import com.qfedu.pojo.User;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper um;
	
	@Override
	public boolean LoginUser(User user,HttpServletRequest rsq) {
		
		 User u = um.loginUser(user);
		 
		 if(u !=null) {
				rsq.getSession().setAttribute("user", u);
				System.out.println(u);
				return true;
			}else {
				
				return false;
			}	
	}

	@Override
	public boolean RegistUser(User user) {
		
		int u = um.insert(user);
		System.out.println(u);
		
		return u>0;
	}

	@Override
	public User selectPass(User user) {
		User p = um.selectPass(user);
		
		return p;
	}

	@Override
	public boolean updateUser(User user) {
		
		int u = um.updateByPrimaryKeySelective(user);
		
		return u>0;
	}

	@Override
	public boolean delete(Integer id) {
		int d = um.deleteByPrimaryKey(id);
		return d>0;
	}

}
