package com.semi4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String main(Model m) {

		// 주석이라도
		System.out.println("아무거나");

		
		//System.out.println();

		return "main";
	}
}








