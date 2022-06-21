package com.semi4.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.semi4.vo.CustVO;

@RestController
public class AJAXController {

	
	@RequestMapping("checkid")
	public String checkid(String id) {

		String result = "";
		CustVO c = null;

		return result;
	}
	
	@RequestMapping("mainAddCart")
	public String mainAddCart(String id) {

		System.out.println("mainAddCart");
		String result = "";
		CustVO c = null;


		return result;
	}
	
	
	
	
}









