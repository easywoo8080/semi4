package com.semi4.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.semi4.biz.CartBiz;
import com.semi4.vo.CartVO;
import com.semi4.vo.CustVO;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	CartBiz cartbiz;

	@RequestMapping("")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("main");
		mv.addObject("center", "order/center" );
		return mv;
	}
	

	@RequestMapping("/add")
	public ModelAndView add(ModelAndView mv, HttpSession session, int[] sArray) {
		CustVO cust = null;
		cust = (CustVO) session.getAttribute("logincust");
		
		List<CartVO> list = new ArrayList<CartVO>();
		int allprice = 0;
		try {
			for (int i = 0; i < sArray.length; i++) {
				
				list.add( cartbiz.get(sArray[i]) );		
				allprice += list.get(i).getPrice() * list.get(i).getNum();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mv.addObject("allprice", allprice );
		mv.addObject("cartlist", list );
		mv.addObject("cust", cust );
		mv.addObject("center", "order/add" );
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("/addimpl")
	public ModelAndView addimpl(ModelAndView mv,HttpSession session, String oname, String oaddr, String ophon, String[] pid, String[] dnum, String[] dprice) {
		System.out.println("oname : " + oname);
		System.out.println("oaddr : " + oaddr);
		System.out.println("ophon : " + ophon);
		System.out.println("pid : " + pid);
		System.out.println("dnum : " + dnum);
		System.out.println("dprice : " + dprice);
		
		
		
		
		
		
		
		
		
		
		
		mv.setViewName("main");
		mv.addObject("center", "order/center" );
		return mv;
	}
}








