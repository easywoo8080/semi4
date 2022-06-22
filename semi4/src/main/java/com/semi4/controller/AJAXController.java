package com.semi4.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.semi4.biz.CartBiz;
import com.semi4.biz.CustBiz;
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

