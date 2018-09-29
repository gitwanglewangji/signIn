package com.qfedu.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qfedu.pojo.Sign;
import com.qfedu.service.SignService;

@Controller
public class SignController {
	
	@Resource
	private SignService ss;
	
	@RequestMapping("SignList")
    @ResponseBody
	public List<Sign> signList( int page, int size) {
	   System.out.println("--第"+page+"页");
	   //将页码转为查询起点
		int start=(page-1)*size;
		Map<String, Object> map = new HashMap<>();
		map.put("start",start);
		map.put("size",size);
		List<Sign> list = ss.selectAllSign(map);
		return list;
	}
	
	@RequestMapping("SignAllList")
    @ResponseBody
	public List<Sign> signAllList(Sign sign) {
		List<Sign> s = ss.selectAll(sign);
		return s;
	}
	
	//查询表中数据总数
    @RequestMapping("total")
    @ResponseBody
    public String total() {

        return "" + ss.total();
    }

}
