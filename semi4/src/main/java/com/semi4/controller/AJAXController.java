package com.semi4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.semi4.biz.CustBiz;
import com.semi4.vo.CustVO;

@RestController
public class AJAXController {
	
	@Autowired
	CustBiz custbiz;
	
	@RequestMapping("checkid")
	public String checkid(String id) {
		String result = "";
		CustVO c = null;
		
		if(id.equals("") || id == null) {
			return "1";
		}
		
		try {
			c = custbiz.get(id);
			if(c == null) {
				result = "0";
			}else {
				result = "1";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	
    }
}