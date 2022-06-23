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
import com.semi4.vo.CartVO;

import com.semi4.biz.CustBiz;

import com.semi4.vo.CustVO;

@RestController
public class AJAXController {


	@Autowired
	CartBiz cartbiz;
	
	@RequestMapping("checkid")
	public String checkid(String id) {

		String result = "";
		CustVO c = null;

		return result;
	}
	
	@RequestMapping("mainAddCart")
	public String mainAddCart(String id, HttpSession session) {
		String result = "";
		System.out.println("id : " + id);
		
		
		if( session == null ) {
			System.out.println("세션이 널이니다.");
		} else {
//			CustVO cust;
//			
//			cust = (CustVO) session.getAttribute("logincust");
//			CartVO c = new CartVO(cust.getUid(), id, 1);
//			
//			try {
//				cartbiz.register(c);
//				
//				System.out.println("Registered OK");
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
		}
		
		return result;
	}
	

}

