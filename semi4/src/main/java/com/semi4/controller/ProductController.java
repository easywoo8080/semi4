package com.semi4.controller;

import java.awt.print.Pageable;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.semi4.biz.CustBiz;
import com.semi4.biz.ProductBiz;
import com.semi4.vo.CustVO;
import com.semi4.vo.ProductVO;

@Controller
public class ProductController {
	
	@Autowired
	CustBiz custbiz;
	
	@Autowired
	ProductBiz productbiz;
	
	//String path = "테스트입니다. 여긴 컨트롤러";

	@RequestMapping("/product")
	public String main(Model m) {
		List<ProductVO> plist = null;
		try {
			plist = productbiz.get();
			m.addAttribute("plist", plist);
			//m.addAttribute("path", path);
			m.addAttribute("center", "product/center");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "main";
	}
	
	
}
