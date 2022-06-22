package com.semi4.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.semi4.vo.CustVO;

@RestController
public class AJAXController {

	
	@RequestMapping("checkid")
	public String checkid(String id) {

		System.out.println("aa");
		String result = "";
		CustVO c = null;

		System.out.println("이클립스 테스트");


		System.out.println("bae modified");		

		System.out.println("kang");





		return result;
	}
	
	
	
}









