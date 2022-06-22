package com.semi4.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.semi4.biz.CartBiz;
import com.semi4.biz.CustBiz;
import com.semi4.vo.CartVO;
import com.semi4.vo.CustVO;

@Controller
@RequestMapping("/cart")
public class CartController {
	@Autowired
	CartBiz biz;
	CustBiz cbiz;

	@RequestMapping("")
	public String center(Model m, HttpSession session) {
		List<CartVO> list = null;
		CustVO cust = null;
		try {
			cust = (CustVO) session.getAttribute("logincust");
			

			list= biz.getID(cust.getUid());
			m.addAttribute("cartlist", list);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		m.addAttribute("center", "cart/center");
		return "main";
		

	}
	

}








