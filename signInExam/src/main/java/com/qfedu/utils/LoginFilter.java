package com.qfedu.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qfedu.pojo.User;



/*
		无敌的生活，使我寂寞
		自卑的生活，使我逃避
		自负的生活，使我自闭
		自信的生活，使我光明
*/
@WebFilter("/main/*")
public class LoginFilter implements Filter{


	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) arg0;
		HttpServletResponse resp = (HttpServletResponse) arg1;
		
		User user =  (User) req.getSession().getAttribute("user");
		String path = req.getServletPath();
			

			
			if (user == null) {
				resp.sendRedirect("/signInExam/login.html");
			} else {
				arg2.doFilter(arg0, arg1);
			}
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

		
	}

}
