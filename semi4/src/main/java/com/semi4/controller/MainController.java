package com.semi4.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.semi4.biz.CustBiz;
import com.semi4.vo.CustVO;

@Controller
public class MainController {
	
	@Autowired
	CustBiz custbiz;

	@RequestMapping("/")
	public String main(Model m) {
		return "main";
	}
	
	@RequestMapping("/login")
	public String login(Model m) {
		m.addAttribute("center", "login");
		return "main";
	}
	
	@RequestMapping("/logout") 
	public String logout(Model m, HttpSession session) {
		if(session !=null) {
			session.invalidate();
		}
		return "main";
	}
	
	@RequestMapping("/loginimpl") 
	public String loginimpl(Model m, String id, String pwd, HttpSession session) {
		CustVO cust = null;
		try {
			cust = custbiz.get(id);
			if(cust == null) {
				throw new Exception();
			}
			if(cust.getPwd().equals(pwd)) {
				session.setAttribute("logincust", cust);
			}else {
				throw new Exception();
			}
				
		} catch (Exception e) {
			
		}
        return "main";
	}
}
