package com.qfedu.action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qfedu.pojo.User;
import com.qfedu.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService us;
	
	@RequestMapping("/login")
	@ResponseBody
	public String login(User user,HttpServletRequest rsq) {
		
		boolean flag = us.LoginUser(user, rsq);
		
		if (flag) {
			return "1";
		} else {
			return "0";
		}
		
	}
	
	@RequestMapping("/regist")
	public String registUser(User user) {
		us.RegistUser(user);
		
		return "redirect:login.html";
	}
	
	@RequestMapping("/findPass")
	@ResponseBody
	public User findPass(User user) {
		
		User p = us.selectPass(user);
		return p;
	}
	
	 @RequestMapping("removeUser")
	 @ResponseBody
	public String deleteUser(Integer id) {
		
		us.delete(id);
		return "1";
	}
	 @RequestMapping("updateUser")
	 @ResponseBody
	 public String updateUser(User user) {
		 us.updateUser(user);
		 return "1";
	 }
}
