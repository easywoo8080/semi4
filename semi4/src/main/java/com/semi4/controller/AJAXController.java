package com.semi4.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.semi4.biz.CartBiz;
import com.semi4.biz.CustBiz;
import com.semi4.vo.CartVO;
import com.semi4.vo.CustVO;

@RestController
public class AJAXController {

	@Autowired
	CustBiz custbiz;

	@Autowired
	CartBiz cartbiz;
	
	@RequestMapping("checkid")
	public String checkid(String id) {
		String result = "";
		CustVO cust = null;
		
		if(id.equals("") || id == null) {
			return "1";
		}
		try {
			cust = custbiz.get(id);
			if(cust == null) {
				result = "0";
			}else {
				result = "1";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
	
	@RequestMapping("mainAddCart")
	public String mainAddCart(String id, HttpSession session) {
		String result = "";

		if( session.getAttribute("logincust") != null ) {

			CustVO cust;
			cust = (CustVO) session.getAttribute("logincust");

			CartVO c = new CartVO(cust.getUid(), Integer.parseInt(id), 1);
			
			try {
				cartbiz.getID(id);
				
				cartbiz.register(c);

			} catch (Exception e) {
				e.printStackTrace();
			}
			result = "1";
			
		} else {
			result = "0";
		}
		
		return result;
	}



}

