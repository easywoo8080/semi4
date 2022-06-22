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


	@RequestMapping("")
	public String center(Model m, HttpSession session) {
		List<CartVO> list = null;
		try {
			CustVO clist;

			clist = (CustVO) session.getAttribute("logincust");
			if (clist != null) {
				list = biz.getID(clist.getUid());
				m.addAttribute("cartlist", list);
			} else {

			}


			list= biz.getID("id01");
			m.addAttribute("cartlist", list);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		m.addAttribute("center", "cart/center");
		return "main";
		

	}
	
//	@RequestMapping("")
//	public String center(Model m, HttpSession session) {
//		List<CartVO> list = null;
//		List<CustVO> clist = null;
//		try {
//			
//			clist = (List<CustVO>) session.getAttribute("logincust");
//			if (clist != null) {
//				list=biz.getID(clist.get(0).getUid());
//				m.addAttribute("cartlist", list);
//			}else {
//				
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		m.addAttribute("center", "cart/center");
//		return "main";
//	}
}








