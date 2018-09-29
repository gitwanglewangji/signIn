package com.qfedu.service;

import java.util.List;
import java.util.Map;

import com.qfedu.pojo.Sign;

public interface SignService {

	List<Sign> selectAllSign(Map<String, Object> map);
	List<Sign> selectAll(Sign sign);
	
	Sign selectSignById(Integer id);
	
	int total();
}
