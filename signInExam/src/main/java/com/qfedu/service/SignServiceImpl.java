package com.qfedu.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qfedu.dao.SignMapper;
import com.qfedu.pojo.Sign;

@Service
public class SignServiceImpl implements SignService {

	@Resource
	private SignMapper sm;
	
	@Override
	public List<Sign> selectAllSign(Map<String, Object> map) {
		
		List<Sign> s = sm.selectAllSign(map);
		System.out.println(s.get(0));
		return s;
	}

	@Override
	public int total() {
		int t = sm.total();
		return t;
	}

	@Override
	public List<Sign> selectAll(Sign sign) {

		List<Sign> s = sm.selectAll(sign);

		return s;
	}

	@Override
	public Sign selectSignById(Integer id) {
		Sign s = sm.selectByPrimaryKey(id);
		
		return s;
	}

}
