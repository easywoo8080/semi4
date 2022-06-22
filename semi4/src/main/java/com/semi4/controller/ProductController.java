package com.semi4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.semi4.biz.ProductBiz;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductBiz biz;

	@RequestMapping("")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("main");
		mv.addObject("left", "product/left" );
		mv.addObject("center", "product/center" );
		return mv;
	}
	
	
}








