package com.semi4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.semi4.biz.CustBiz;
import com.semi4.vo.CustVO;

@Controller
@RequestMapping("/cust")
public class CustController {

	@Autowired
	CustBiz cbiz;
	
	@RequestMapping("")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("main");
		mv.addObject("center", "cust/center" );
		return mv;
	}

	@RequestMapping("/add")
	public String add(Model m) {
		m.addAttribute("center", "cust/add");
		return "main";		
	}
	
	@RequestMapping("/addimpl")
	public String addimpl(Model m, CustVO obj) {
		try {
			cbiz.register(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:detail?id="+obj.getUid();
	}
	
	@RequestMapping("/select")
	public String select(Model m) {
		List<CustVO> list = null;
		try {
			list = cbiz.get();
			m.addAttribute("clist", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "cust/select");
		return "main";
	}
	
	@RequestMapping("/detail")
	public String detail(Model m, String id) {
		CustVO obj = null;
		try {
			obj  = cbiz.get(id);
			m.addAttribute("c", obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "cust/detail");
		return "main";
	}
	
	@RequestMapping("/update")
	public String update(Model m, CustVO obj) {
		try {
			cbiz.modify(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:detail?id="+obj.getUid();
	}

}